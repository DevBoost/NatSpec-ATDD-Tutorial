package com.nat_spec.examples.airline.forms.elements;

import java.util.Collections;
import java.util.List;

public class EmailField extends FormElement {

	public EmailField(int id) {
		super(id);
	}

	@Override
	public String getText() {
		return "Your email address:";
	}

	@Override
	public List<FormElement> getChildren() {
		return Collections.emptyList();
	}
}
