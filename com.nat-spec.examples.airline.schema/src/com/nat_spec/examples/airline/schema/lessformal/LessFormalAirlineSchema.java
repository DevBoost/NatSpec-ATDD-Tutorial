package com.nat_spec.examples.airline.schema.lessformal;

import java.io.IOException;

import com.nat_spec.examples.airline.schema.AbstractNatSpecTemplate;
import com.nat_spec.examples.airline.schema.AbstractSchemaSupport;

public class LessFormalAirlineSchema extends AbstractNatSpecTemplate {
	
	protected LessFormalSchemaSupport lessFormalSchemaSupport = new LessFormalSchemaSupport();

	public static void main(String[] args) throws IOException {
		new LessFormalAirlineSchema().run();
	}

	public void createDataModel() {
		// generated code will be inserted here
		// The code in this method is generated from: /com.nat-spec.examples.airline.schema/src/com/nat_spec/examples/airline/schema/lessformal/LessFormalAirlineSchema.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// An airplane is a transportation vehicle.
		com.nat_spec.examples.airline.schema.ddl.Table table_airplane_transportation_vehicle_ = lessFormalSchemaSupport.createTable("airplane", java.util.Arrays.asList(new java.lang.String[] {"transportation", "vehicle."}));
		// Every airplane has a type.
		lessFormalSchemaSupport.createColumn("airplane", java.util.Arrays.asList(new java.lang.String[] {"type."}));
		// It also has a seat count.
		lessFormalSchemaSupport.createColumn(java.util.Arrays.asList(new java.lang.String[] {"seat", "count."}), table_airplane_transportation_vehicle_);
		// A passenger is a person who uses airline services.
		com.nat_spec.examples.airline.schema.ddl.Table table_passenger_person_who_uses_airline_services_ = lessFormalSchemaSupport.createTable("passenger", java.util.Arrays.asList(new java.lang.String[] {"person", "who", "uses", "airline", "services."}));
		// Every passenger has a name.
		lessFormalSchemaSupport.createColumn("passenger", java.util.Arrays.asList(new java.lang.String[] {"name."}));
		// He also has a date of birth.
		lessFormalSchemaSupport.createColumn(java.util.Arrays.asList(new java.lang.String[] {"date", "of", "birth."}), table_passenger_person_who_uses_airline_services_);
		// A flight is a travel service provided by an airline.
		com.nat_spec.examples.airline.schema.ddl.Table table_flight_travel_service_provided_by_an_airline_ = lessFormalSchemaSupport.createTable("flight", java.util.Arrays.asList(new java.lang.String[] {"travel", "service", "provided", "by", "an", "airline."}));
		// Every flight has an airplane type.
		lessFormalSchemaSupport.createColumn("flight", java.util.Arrays.asList(new java.lang.String[] {"airplane", "type."}));
		
	}

	@Override
	protected AbstractSchemaSupport getDataModelSupport() {
		return lessFormalSchemaSupport;
	}
}