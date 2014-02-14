package com.nat_spec.examples.airline.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nat_spec.examples.airline.persistence.InMemoryPersistenceContext;
import com.nat_spec.examples.airline.services.AirlineServices;
import com.nat_spec.examples.airline.test.TestSupport;

public class BookSeat {

	private AirlineServices services;
	private TestSupport testSupport;
	private InMemoryPersistenceContext persistenceContext;

	@SuppressWarnings("unused")
	@Test
	public void executeScript() throws Exception {
		int result;
		// The code in this method is generated from: /com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/BookSeat.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Given a Passenger John Doe
		com.nat_spec.examples.airline.persistence.entity.Passenger passenger_John_Doe = testSupport.givenAPassenger("John", "Doe");
		// Given an Airplane Boing-787
		com.nat_spec.examples.airline.persistence.entity.AirplaneType airplaneType_Boing_787 = testSupport.givenAnAirplane("Boing-787");
		// Given a flight LH-1234
		com.nat_spec.examples.airline.persistence.entity.Flight flight_LH_1234 = testSupport.givenAFlight("LH-1234");
		// that is executed using a Boing-787
		testSupport.withAirplane(airplaneType_Boing_787, flight_LH_1234);
		// With 200 free seats
		testSupport.withFreeSeats(200, flight_LH_1234);
		// Book seat for John Doe at LH-1234
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_1234 = testSupport.bookSeat(passenger_John_Doe, flight_LH_1234);
		// Assume a valid ticket is issued
		testSupport.assumeAValidTicketIsIssued(operationStatus_John_Doe_LH_1234);
		
	}

	@Before
	public void setUp() {
		services = new AirlineServices();
		persistenceContext = InMemoryPersistenceContext.getPersistenceContext();
		testSupport = new TestSupport(services, persistenceContext);
	}

	@After
	public void shutdown() {
		if (testSupport != null)
			testSupport = null;
		if (persistenceContext != null)
			persistenceContext.shutdown();
	}
}
