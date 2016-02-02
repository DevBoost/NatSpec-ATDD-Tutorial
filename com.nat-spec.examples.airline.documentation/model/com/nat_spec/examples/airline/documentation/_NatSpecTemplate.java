package com.nat_spec.examples.airline.documentation;

import de.devboost.natspec.library.documentation.Documentation;
import de.devboost.natspec.library.documentation.DocumentationGenerator;
import de.devboost.natspec.library.documentation.DocumentationSupport;

public class _NatSpecTemplate {

	private DocumentationSupport documentationSupport = new DocumentationSupport(_NatSpecTemplate.class);

	public static void main(String[] args) throws Exception {
		new _NatSpecTemplate().saveDocumentation();
	}

	@SuppressWarnings("unused")
	public void saveDocumentation() throws Exception {

		/* @MethodBody */
		int unused = 0;
		Documentation documentation = documentationSupport.getDocumentation();
		DocumentationGenerator generator = new DocumentationGenerator();
		generator.saveDocumentationToFile(documentation);

	}
}
