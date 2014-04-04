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
public class BookSeatTwice extends NatSpecJUnit4Template{

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
		// The code in this method is generated from: /com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/BookSeatTwice.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Given a Passenger John Doe
		log("Given a Passenger John Doe");
		com.nat_spec.examples.airline.persistence.entity.Passenger passenger_John_Doe = testSupport.givenAPassenger("John", "Doe");
		// Given an Airplane Boeing-787
		log("Given an Airplane Boeing-787");
		com.nat_spec.examples.airline.persistence.entity.AirplaneType airplaneType_Boeing_787 = testSupport.givenAnAirplane("Boeing-787");
		// Given a flight LH-1234
		log("Given a flight LH-1234");
		com.nat_spec.examples.airline.persistence.entity.Flight flight_LH_1234 = testSupport.givenAFlight("LH-1234");
		// that is executed using a Boeing-787
		log("that is executed using a Boeing-787");
		testSupport.withAirplane(airplaneType_Boeing_787, flight_LH_1234);
		// With 200 free seats
		log("With 200 free seats");
		testSupport.withFreeSeats(200, flight_LH_1234);
		// Book seat for John Doe at LH-1234
		log("Book seat for John Doe at LH-1234");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_1234 = testSupport.bookSeat(passenger_John_Doe, flight_LH_1234);
		// Assume a valid ticket is issued
		log("Assume a valid ticket is issued");
		testSupport.assumeAValidTicketIsIssued(operationStatus_John_Doe_LH_1234);
		// Book seat for John Doe at LH-1234
		log("Book seat for John Doe at LH-1234");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_12340 = testSupport.bookSeat(passenger_John_Doe, flight_LH_1234);
		// Assume no valid ticket is issued
		log("Assume no valid ticket is issued");
		testSupport.assumeFailure(operationStatus_John_Doe_LH_12340);
		
		
	}

	public static void createNatSpecDescription(INatSpecDefinitionHandler handler) {
		handler.registerComment("// This scenario describes an erroneous booking example");
		handler.registerComment("// where the same passenger is booked twice for one flight");
		handler.register("Given a Passenger John Doe");
		handler.register("Given an Airplane Boeing-787");
		handler.register("Given a flight LH-1234");
		handler.register("that is executed using a Boeing-787");
		handler.register("With 200 free seats");
		handler.register("Book seat for John Doe at LH-1234");
		handler.register("Assume a valid ticket is issued");
		handler.registerComment("// Second booking for the same passenger should fail");
		handler.register("Book seat for John Doe at LH-1234");
		handler.register("Assume no valid ticket is issued");
	}
}
