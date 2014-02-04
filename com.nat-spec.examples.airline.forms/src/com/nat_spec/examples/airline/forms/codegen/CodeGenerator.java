package com.nat_spec.examples.airline.forms.codegen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.nat_spec.examples.airline.forms.FoodOrder;
import com.nat_spec.examples.airline.forms.FormSupport;
import com.nat_spec.examples.airline.forms.elements.EmailField;
import com.nat_spec.examples.airline.forms.elements.FormElement;
import com.nat_spec.examples.airline.forms.elements.Option;
import com.nat_spec.examples.airline.forms.elements.OptionSet;
import com.nat_spec.examples.airline.forms.elements.Question;

public class CodeGenerator {

	private String packageName = FormSupport.class.getPackage().getName();

	public static void main(String[] args) {
		new CodeGenerator().run();
	}

	private void run() {
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.createFormModel();
		FormSupport formSupport = foodOrder.getFormSupport();
		List<FormElement> formElements = formSupport.getFormElements();
		String code = createUICode(formElements);
		save("FoodOrderForm.java", code);
	}

	private String createUICode(List<FormElement> formElements) {
		StringBuilder code = new StringBuilder();
		
		code.append("package " + packageName + ";\n");
		code.append("\n");
		code.append("import org.eclipse.swt.SWT;\n");
		code.append("import org.eclipse.swt.layout.GridLayout;\n");
		code.append("import org.eclipse.swt.widgets.*;\n");
		code.append("import org.eclipse.swt.events.*;\n");
		code.append("\n");
		code.append("public class FoodOrderForm {\n");
		code.append("\n");
		code.append("\tpublic void run() {\n");
		code.append("\t\tfinal Display display = new Display();\n");
		code.append("\t\tShell shell = new Shell(display);\n");
		code.append("\t\tshell.setText(\"FoodOrder\");\n");
		code.append("\t\tshell.setLayout(new GridLayout(2, false));\n");
		code.append("\n");
		
		for (FormElement formElement : formElements) {
			code.append(addFormElement(formElement));
		}

		code.append("\t\tButton sendFormButton = new Button(shell, SWT.NONE);\n");
		code.append("\t\tsendFormButton.setText(\"Send form\");\n");
		code.append("\t\tsendFormButton.addSelectionListener(new SelectionListener() {\n");
			
		code.append("\t\t\t@Override\n");
		code.append("\t\t\tpublic void widgetSelected(SelectionEvent e) {\n");
		code.append("\t\t\t\tdisplay.dispose();\n");
		code.append("\t\t\t}\n");
			
		code.append("\t\t\t@Override\n");
		code.append("\t\t\tpublic void widgetDefaultSelected(SelectionEvent e) {\n");
		code.append("\t\t\t}\n");
		code.append("\t\t});\n");

		code.append("\t\tshell.setLocation(200, 100);\n");
		code.append("\t\tshell.setSize(220, 120);\n");
		code.append("\t\tshell.pack();\n");
		code.append("\t\tshell.open();\n");
		code.append("\t\twhile (!shell.isDisposed()) {\n");
		code.append("\t\t\tif (!display.readAndDispatch()) {\n");
		code.append("\t\t\t\tdisplay.sleep();\n");
		code.append("\t\t\t}\n");
		code.append("\t\t}\n");
		code.append("\t}\n");
		code.append("}\n");
		return code.toString();
	}

	private String addFormElement(FormElement formElement) {
		StringBuilder code = new StringBuilder();
		int id = formElement.getId();
		String text = formElement.getText();
		if (formElement instanceof Question) {
			code.append("\t\tLabel label" + id + " = new Label(shell, SWT.NONE);\n");
			code.append("\t\tlabel" + id + ".setText(\"" + text + "\");\n");
			code.append("\t\tButton button" + id + " = new Button(shell, SWT.CHECK);\n");
			code.append("\t\tbutton" + id + ".setText(\"Yes\");\n");
		}
		if (formElement instanceof EmailField) {
			code.append("\t\tLabel label" + id + " = new Label(shell, SWT.NONE);\n");
			code.append("\t\tlabel" + id + ".setText(\"Please enter your email address:\");\n");
			code.append("\t\tnew Text(shell, SWT.NONE);\n");
		}
		if (formElement instanceof OptionSet) {
			code.append("\t\tLabel label" + id + " = new Label(shell, SWT.NONE);\n");
			code.append("\t\tlabel" + id + ".setText(\"" + text + "\");\n");
			OptionSet optionSet = (OptionSet) formElement;
			code.append("\t\tCombo combo" + id + " = new Combo(shell, SWT.DROP_DOWN);\n");
			String values = "";
			for (Option option : optionSet.getOptions()) {
				values += "\"" + option.getText() + "\", ";
			}
			code.append("\t\tcombo" + id + ".setItems(new String[] {" + values + "});\n");
			code.append("\t\tcombo" + id + ".select(0);\n");
		}
		return code.toString();
	}

	private void save(String path, String code) {
		try {
			String packagePath = packageName
					.replace(".", File.separator);
			String fullpath = "src-gen"
					+ File.separator
					+ packagePath + File.separator
					+ path;
			File file = new File(fullpath);
			FileWriter writer = new FileWriter(file);
			writer.write(code);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
