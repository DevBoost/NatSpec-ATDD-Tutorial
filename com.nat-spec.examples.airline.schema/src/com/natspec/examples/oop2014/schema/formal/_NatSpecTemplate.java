package com.natspec.examples.oop2014.schema.formal;

import java.io.IOException;

import com.natspec.examples.oop2014.schema.AbstractNatSpecTemplate;
import com.natspec.examples.oop2014.schema.AbstractSchemaSupport;

public class _NatSpecTemplate extends AbstractNatSpecTemplate {
	
	protected FomalSchemaSupport fomalSchemaSupport = new FomalSchemaSupport();
	
	public static void main(String[] args) throws IOException {
		new _NatSpecTemplate().run();
	}

	public void createDataModel() {
		// generated code will be inserted here
		/* @MethodBody */
	}

	@Override
	protected AbstractSchemaSupport getDataModelSupport() {
		return fomalSchemaSupport;
	}
}