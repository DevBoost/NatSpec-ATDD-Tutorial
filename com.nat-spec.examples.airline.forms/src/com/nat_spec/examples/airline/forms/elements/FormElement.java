package com.nat_spec.examples.airline.forms.elements;

import java.util.List;

public abstract class FormElement {
	
	private int id;

	public FormElement(int id) {
		super();
		this.id = id;
	}

	public abstract String getText();

	public int getId() {
		return id;
	}

	public abstract List<FormElement> getChildren();
}
