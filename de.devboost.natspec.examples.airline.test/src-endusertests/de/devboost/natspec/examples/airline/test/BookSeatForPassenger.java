package de.devboost.natspec.examples.airline.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.devboost.natspec.examples.airline.InMemoryPersistenceContext;
import de.devboost.natspec.examples.airline.services.AirlineServices;

public class BookSeatForPassenger {

	private AirlineServices services;
	private TestSupport testSupport;
	private InMemoryPersistenceContext persistenceContext;

	@Test
	public void executeScript() throws Exception {
		// The code in this method is generated from: /com.nat-spec.examples.airline.tests/src-endusertests/de/devboost/natspec/examples/airline/test/BookSeatForPassenger.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Given a Passenger John Doe
		de.devboost.natspec.examples.airline.entity.Passenger passenger_John_Doe = testSupport.givenAPassenger("John", "Doe");
		// Given an Airplane Boing-787
		de.devboost.natspec.examples.airline.entity.AirplaneType airplaneType_Boing_787 = testSupport.givenAnAirplane("Boing-787");
		// Given a flight LH-1234
		de.devboost.natspec.examples.airline.entity.Flight flight_LH_1234 = testSupport.givenAFlight("LH-1234");
		// With airplane Boing-787
		testSupport.withAirplane(airplaneType_Boing_787, flight_LH_1234);
		// With 200 free seats
		testSupport.withFreeSeats(200, flight_LH_1234);
		// Book seat for John Doe at LH-1234
		de.devboost.natspec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_1234 = testSupport.bookSeat(passenger_John_Doe, flight_LH_1234);
		// Assume success
		testSupport.assumeSuccess(operationStatus_John_Doe_LH_1234);
		
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
