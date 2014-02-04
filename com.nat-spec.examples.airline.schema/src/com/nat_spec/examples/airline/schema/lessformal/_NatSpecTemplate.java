package com.nat_spec.examples.airline.schema.lessformal;

import java.io.IOException;

import com.nat_spec.examples.airline.schema.AbstractNatSpecTemplate;
import com.nat_spec.examples.airline.schema.AbstractSchemaSupport;

public class _NatSpecTemplate extends AbstractNatSpecTemplate {
	
	protected LessFormalSchemaSupport lessFormalSchemaSupport = new LessFormalSchemaSupport();

	public static void main(String[] args) throws IOException {
		new _NatSpecTemplate().run();
	}

	public void createDataModel() {
		// generated code will be inserted here
		/* @MethodBody */
	}

	@Override
	protected AbstractSchemaSupport getDataModelSupport() {
		return lessFormalSchemaSupport;
	}
}