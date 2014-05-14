package com.nat_spec.examples.airline.forms;

import com.nat_spec.examples.airline.forms.codegen.CodeGenerator;

public class _NatSpecTemplate {

	protected FormSupport formSupport = new FormSupport();

	public void createFormModel() {
		// generated code will be inserted here
		/* @MethodBody */
	}

	public static void main(String[] args) {
		new CodeGenerator().run();
	}

	public FormSupport getFormSupport() {
		return formSupport;
	}
}