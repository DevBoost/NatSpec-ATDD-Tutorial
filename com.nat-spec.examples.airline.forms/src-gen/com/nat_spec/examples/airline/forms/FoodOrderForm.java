package com.nat_spec.examples.airline.forms;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.*;

public class FoodOrderForm {

	public void run() {
		final Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("FoodOrder");
		shell.setLayout(new GridLayout(2, false));

		Label label1 = new Label(shell, SWT.NONE);
		label1.setText("Please select one of the following:");
		Combo combo1 = new Combo(shell, SWT.DROP_DOWN);
		combo1.setItems(new String[] {"Hamburger ", "Cheeseburger ", });
		combo1.select(0);
		Label label4 = new Label(shell, SWT.NONE);
		label4.setText("Would you like french fries with that? ");
		Button button4 = new Button(shell, SWT.CHECK);
		button4.setText("Yes");
		Label label5 = new Label(shell, SWT.NONE);
		label5.setText("Do you collect bonus points? ");
		Button button5 = new Button(shell, SWT.CHECK);
		button5.setText("Yes");
		Label label6 = new Label(shell, SWT.NONE);
		label6.setText("Please enter your email address:");
		Text text6 = new Text(shell, SWT.BORDER);
		GridData data = new GridData();       
		data.horizontalAlignment = SWT.FILL;  
		data.grabExcessHorizontalSpace = true;
		text6.setLayoutData(data);             
		new Label(shell, SWT.NONE);
		Button sendFormButton = new Button(shell, SWT.NONE);
		sendFormButton.setText("Send form");
		sendFormButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		shell.setLocation(200, 100);
		shell.setSize(220, 120);
		shell.pack();
		shell.open();
		shell.getChildren()[1].setFocus();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
