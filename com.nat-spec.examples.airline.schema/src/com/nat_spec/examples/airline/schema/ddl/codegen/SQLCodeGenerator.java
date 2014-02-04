package com.nat_spec.examples.airline.schema.ddl.codegen;

import java.util.List;

import com.nat_spec.examples.airline.schema.ddl.Column;
import com.nat_spec.examples.airline.schema.ddl.Table;


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
