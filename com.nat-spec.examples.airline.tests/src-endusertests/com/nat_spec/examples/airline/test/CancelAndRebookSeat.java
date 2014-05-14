package com.nat_spec.examples.airline.test;

import de.devboost.natspec.interfaces.INatSpecDefinitionHandler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.nat_spec.examples.airline.persistence.InMemoryPersistenceContext;
import com.nat_spec.examples.airline.services.AirlineServices;

import de.devboost.natspec.junit4.runner.NatSpecJUnit4Runner;
import de.devboost.natspec.junit4.runner.NatSpecJUnit4Template;

@RunWith(NatSpecJUnit4Runner.class)
public class CancelAndRebookSeat extends NatSpecJUnit4Template {

	private AirlineServices services;
	private TestSupport testSupport;
	private InMemoryPersistenceContext persistenceContext;

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

	@Test
	public void runTest() throws Exception {
		// The code in this method is generated from: /com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/CancelAndRebookSeat.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Given a plane Boeing-737-600
		log("Given a plane Boeing-737-600");
		com.nat_spec.examples.airline.persistence.entity.AirplaneType airplaneType_Boeing_737_600 = testSupport.givenAnAirplane("Boeing-737-600");
		// Given a flight LH-1234
		log("Given a flight LH-1234");
		com.nat_spec.examples.airline.persistence.entity.Flight flight_LH_1234 = testSupport.givenAFlight("LH-1234");
		// that is executed using a Boeing-737-600
		log("that is executed using a Boeing-737-600");
		testSupport.withAirplane(airplaneType_Boeing_737_600, flight_LH_1234);
		// With 1 free seats
		log("With 1 free seats");
		testSupport.withFreeSeats(1, flight_LH_1234);
		// Given a passenger John Doe
		log("Given a passenger John Doe");
		com.nat_spec.examples.airline.persistence.entity.Passenger passenger_John_Doe = testSupport.givenAPassenger("John", "Doe");
		// Given a passenger Jane Mejer
		log("Given a passenger Jane Mejer");
		com.nat_spec.examples.airline.persistence.entity.Passenger passenger_Jane_Mejer = testSupport.givenAPassenger("Jane", "Mejer");
		// Book seat for John Doe at LH-1234
		log("Book seat for John Doe at LH-1234");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_1234 = testSupport.bookSeat(passenger_John_Doe, flight_LH_1234);
		// Assume a valid ticket is issued
		log("Assume a valid ticket is issued");
		testSupport.assumeAValidTicketIsIssued(operationStatus_John_Doe_LH_1234);
		// Book seat for Jane Mejer at LH-1234
		log("Book seat for Jane Mejer at LH-1234");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_Jane_Mejer_LH_1234 = testSupport.bookSeat(passenger_Jane_Mejer, flight_LH_1234);
		// Assume no valid ticket is issued
		log("Assume no valid ticket is issued");
		testSupport.assumeFailure(operationStatus_Jane_Mejer_LH_1234);
		// Cancel seat for John Doe at LH-1234
		log("Cancel seat for John Doe at LH-1234");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_12340 = testSupport.cancelSeat(passenger_John_Doe, flight_LH_1234);
		// Assume cancellation successful
		log("Assume cancellation successful");
		testSupport.assumeCancellationSuccessful(operationStatus_John_Doe_LH_12340);
		// Book seat for Jane Mejer at LH-1234
		log("Book seat for Jane Mejer at LH-1234");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_Jane_Mejer_LH_12340 = testSupport.bookSeat(passenger_Jane_Mejer, flight_LH_1234);
		// Assume a valid ticket is issued
		log("Assume a valid ticket is issued");
		testSupport.assumeAValidTicketIsIssued(operationStatus_Jane_Mejer_LH_12340);
		
	}

	public static void createNatSpecDescription(INatSpecDefinitionHandler handler) {
		handler.register("Given a plane Boeing-737-600");
		handler.register("Given a flight LH-1234");
		handler.register("that is executed using a Boeing-737-600");
		handler.register("With 1 free seats");
		handler.register("Given a passenger John Doe");
		handler.register("Given a passenger Jane Mejer");
		handler.registerComment("// first passenger");
		handler.register("Book seat for John Doe at LH-1234");
		handler.register("Assume a valid ticket is issued");
		handler.registerComment("// second passenger");
		handler.register("Book seat for Jane Mejer at LH-1234");
		handler.register("Assume no valid ticket is issued");
		handler.registerComment("// cancel first passenger");
		handler.register("Cancel seat for John Doe at LH-1234");
		handler.register("Assume cancellation successful");
		handler.registerComment("// rebook second passenger on now free set");
		handler.register("Book seat for Jane Mejer at LH-1234");
		handler.register("Assume a valid ticket is issued");
	}
}
