package com.nat_spec.examples.airline.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nat_spec.examples.airline.persistence.InMemoryPersistenceContext;
import com.nat_spec.examples.airline.services.AirlineServices;
import com.nat_spec.examples.airline.test.TestSupport;

public class OverbookSeatNumber {

	private AirlineServices services;
	private TestSupport testSupport;
	private InMemoryPersistenceContext persistenceContext;

	@Test
	public void executeScript() throws Exception {
		// The code in this method is generated from: /com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/OverbookSeatNumber.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Given a plane Boing-737-600
		com.nat_spec.examples.airline.persistence.entity.AirplaneType airplaneType_Boing_737_600 = testSupport.givenAnAirplane("Boing-737-600");
		// Given a flight LH-1234
		com.nat_spec.examples.airline.persistence.entity.Flight flight_LH_1234 = testSupport.givenAFlight("LH-1234");
		// with airplane Boing-737-600
		testSupport.withAirplane(airplaneType_Boing_737_600, flight_LH_1234);
		// with 2 free seats
		testSupport.withFreeSeats(2, flight_LH_1234);
		// Given a passenger John Doe
		com.nat_spec.examples.airline.persistence.entity.Passenger passenger_John_Doe = testSupport.givenAPassenger("John", "Doe");
		// Book seat for John Doe at LH-1234
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_1234 = testSupport.bookSeat(passenger_John_Doe, flight_LH_1234);
		// Assume success
		testSupport.assumeSuccess(operationStatus_John_Doe_LH_1234);
		// Given a passenger Jane Doe
		com.nat_spec.examples.airline.persistence.entity.Passenger passenger_Jane_Doe = testSupport.givenAPassenger("Jane", "Doe");
		// Book seat for Jane Doe at LH-1234
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_Jane_Doe_LH_1234 = testSupport.bookSeat(passenger_Jane_Doe, flight_LH_1234);
		// Assume success
		testSupport.assumeSuccess(operationStatus_Jane_Doe_LH_1234);
		// Given a passenger Jim Doe
		com.nat_spec.examples.airline.persistence.entity.Passenger passenger_Jim_Doe = testSupport.givenAPassenger("Jim", "Doe");
		// Book seat for Jim Doe at LH-1234
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_Jim_Doe_LH_1234 = testSupport.bookSeat(passenger_Jim_Doe, flight_LH_1234);
		// Assume failure
		testSupport.assumeFailure(operationStatus_Jim_Doe_LH_1234);
		
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
