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
public class CancelSeatTwice extends NatSpecJUnit4Template {

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
		// The code in this method is generated from: /com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/CancelSeatTwice.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Wenn ein Passagier John Doe
		log("Wenn ein Passagier John Doe");
		com.nat_spec.examples.airline.persistence.entity.Passenger passenger_John_Doe = testSupport.givenAPassenger("John", "Doe");
		// Für den Flug LH-1234
		log("Für den Flug LH-1234");
		com.nat_spec.examples.airline.persistence.entity.Flight flight_LH_1234 = testSupport.givenAFlight("LH-1234");
		// der mit einer Boeing-737-600 ausgeführt wird
		log("der mit einer Boeing-737-600 ausgeführt wird");
		testSupport.withAirplane("Boeing-737-600", flight_LH_1234);
		// und 2 freie Sitzplätze hat
		log("und 2 freie Sitzplätze hat");
		testSupport.withFreeSeats(2, flight_LH_1234);
		// Einen Sitzplatz bucht
		log("Einen Sitzplatz bucht");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_ = testSupport.einenSitzplatzBucht(flight_LH_1234, passenger_John_Doe);
		// Wird ein valides Ticket ausgestellt
		log("Wird ein valides Ticket ausgestellt");
		testSupport.assumeAValidTicketIsIssued(operationStatus_);
		// Wenn Passagier John Doe sein Ticket für Flug LH-1234 storniert
		log("Wenn Passagier John Doe sein Ticket für Flug LH-1234 storniert");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_1234 = testSupport.cancelSeat(passenger_John_Doe, flight_LH_1234);
		// Wird die Stornierung bestätigt
		log("Wird die Stornierung bestätigt");
		testSupport.assumeCancellationSuccessful(true, operationStatus_John_Doe_LH_1234);
		// Wenn Passagier John Doe sein Ticket für Flug LH-1234 storniert
		log("Wenn Passagier John Doe sein Ticket für Flug LH-1234 storniert");
		com.nat_spec.examples.airline.services.OperationStatus operationStatus_John_Doe_LH_12340 = testSupport.cancelSeat(passenger_John_Doe, flight_LH_1234);
		// Wird die Stornierung nicht bestätigt
		log("Wird die Stornierung nicht bestätigt");
		testSupport.assumeCancellationSuccessful(false, operationStatus_John_Doe_LH_12340);
		
	}

	public static void createNatSpecDescription(INatSpecDefinitionHandler handler) {
		handler.register("Wenn ein Passagier John Doe");
		handler.register("Für den Flug LH-1234");
		handler.register("der mit einer Boeing-737-600 ausgeführt wird");
		handler.register("und 2 freie Sitzplätze hat");
		handler.register("Einen Sitzplatz bucht");
		handler.register("Wird ein valides Ticket ausgestellt");
		handler.register("Wenn Passagier John Doe sein Ticket für Flug LH-1234 storniert");
		handler.register("Wird die Stornierung bestätigt");
		handler.registerComment("/// Dopelstornierung wird zurückgewiesen");
		handler.register("Wenn Passagier John Doe sein Ticket für Flug LH-1234 storniert");
		handler.register("Wird die Stornierung nicht bestätigt");
	}
}
