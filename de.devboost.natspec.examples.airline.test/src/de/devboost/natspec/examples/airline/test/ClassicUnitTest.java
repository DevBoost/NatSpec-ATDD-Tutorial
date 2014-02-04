package de.devboost.natspec.examples.airline.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.devboost.natspec.examples.airline.InMemoryPersistenceContext;
import de.devboost.natspec.examples.airline.entity.AirplaneType;
import de.devboost.natspec.examples.airline.entity.Flight;
import de.devboost.natspec.examples.airline.entity.Passenger;
import de.devboost.natspec.examples.airline.services.AirlineServices;
import de.devboost.natspec.examples.airline.services.OperationStatus;

public class ClassicUnitTest {

	private AirlineServices services;
	private InMemoryPersistenceContext persistenceContext;
	private Throwable exception;

	@Before
	public void setUp() {
		this.exception = null;
		services = new AirlineServices();
		persistenceContext = InMemoryPersistenceContext.getPersistenceContext();
	}

	@After
	public void tearDown() {
		services = null;
		if (exception != null) {
			fail(exception.getMessage());
		}
	}

	@Test
	public void testSeatBooking() {
		Passenger passenger = persistenceContext.createPassenger("John", "Doe");
		assertNotNull(passenger);

		AirplaneType airplane = persistenceContext
				.createAirplaneType("Boing 737");
		airplane.setTotalSeats(20);
		Flight flight = persistenceContext.createFlight("LH-1234");
		flight.setFreeSeats(20);
		assertNotNull(flight);
		flight.setAirplane(airplane);

		OperationStatus status = services.bookSeat(passenger, flight);
		assertTrue(status.getMessage(), status.isValid());
		// book a second time
		status = services.bookSeat(passenger, flight);
		assertFalse(status.getMessage(), status.isValid());

	}
}
