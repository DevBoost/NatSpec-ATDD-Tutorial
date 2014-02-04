package de.devboost.natspec.examples.airline.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.devboost.natspec.examples.airline.InMemoryPersistenceContext;
import de.devboost.natspec.examples.airline.services.AirlineServices;

public class CancelAndRebookSeat {

	private AirlineServices services;
	private TestSupport testSupport;
	private InMemoryPersistenceContext persistenceContext;

	@Test
	public void executeScript() throws Exception {
		// The code in this method is generated from: /com.nat-spec.examples.airline.tests/src-endusertests/de/devboost/natspec/examples/airline/test/CancelAndRebookSeat.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Given a plane Boing-737-600
		de.devboost.natspec.examples.airline.entity.AirplaneType airplaneType_Boing_737_600 = testSupport.givenAnAirplane("Boing-737-600");
		// Given a flight LH-1234
		de.devboost.natspec.examples.airline.entity.Flight flight_LH_1234 = testSupport.givenAFlight("LH-1234");
		// With airplane Boing-737-600
		testSupport.withAirplane(airplaneType_Boing_737_600, flight_LH_1234);
		// With 1 free seats
		testSupport.withFreeSeats(1, flight_LH_1234);
		// Given a passenger John Doe
		de.devboost.natspec.examples.airline.entity.Passenger passenger_John_Doe = testSupport.givenAPassenger("John", "Doe");
		// Given a passenger Jane Mejer
		de.devboost.natspec.examples.airline.entity.Passenger passenger_Jane_Mejer = testSupport.givenAPassenger("Jane", "Mejer");
		// Book seat for John Doe at LH-1234
		de.devboost.natspec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_1234 = testSupport.bookSeat(passenger_John_Doe, flight_LH_1234);
		// Assume success
		testSupport.assumeSuccess(operationStatus_John_Doe_LH_1234);
		// Book seat for Jane Mejer at LH-1234
		de.devboost.natspec.examples.airline.services.OperationStatus operationStatus_Jane_Mejer_LH_1234 = testSupport.bookSeat(passenger_Jane_Mejer, flight_LH_1234);
		// Assume failure
		testSupport.assumeFailure(operationStatus_Jane_Mejer_LH_1234);
		// Cancel seat for John Doe at LH-1234
		de.devboost.natspec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_12340 = testSupport.cancelSeat(passenger_John_Doe, flight_LH_1234);
		// Assume success
		testSupport.assumeSuccess(operationStatus_John_Doe_LH_12340);
		// Book seat for Jane Mejer at LH-1234
		de.devboost.natspec.examples.airline.services.OperationStatus operationStatus_Jane_Mejer_LH_12340 = testSupport.bookSeat(passenger_Jane_Mejer, flight_LH_1234);
		// Assume success
		testSupport.assumeSuccess(operationStatus_Jane_Mejer_LH_12340);
		
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
