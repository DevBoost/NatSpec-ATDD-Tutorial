package com.natspec.examples.oop2014.schema.ddl.codegen;

import java.util.List;

import com.natspec.examples.oop2014.schema.ddl.Column;
import com.natspec.examples.oop2014.schema.ddl.Table;


public class SQLCodeGenerator {

	public String generateCode(Table table) {
		StringBuilder code = new StringBuilder();
		code.append("CREATE TABLE " + table.getName() + " (\n\n");
		List<Column> columns = table.getColumns();
		for (int i = 0; i < columns.size(); i++) {
			Column column = columns.get(i);
			String columnName = column.getName();
			code.append("\t" + columnName + " " + column.getType());
			if (i < columns.size() - 1) {
				code.append(",\n");
			} else {
				code.append("\n");
			}
		}
		code.append(");\n");
		return code.toString();
	}
}
