package com.nat_spec.examples.airline.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.nat_spec.examples.airline.persistence.InMemoryPersistenceContext;
import com.nat_spec.examples.airline.persistence.entity.AirplaneType;
import com.nat_spec.examples.airline.persistence.entity.Flight;
import com.nat_spec.examples.airline.persistence.entity.Passenger;
import com.nat_spec.examples.airline.services.AirlineServices;
import com.nat_spec.examples.airline.services.OperationStatus;

import de.devboost.natspec.annotations.BooleanSyntax;
import de.devboost.natspec.annotations.TextSyntax;

public class TestSupport {

	private AirlineServices services;
	private InMemoryPersistenceContext persistenceContext;

	public TestSupport(AirlineServices services, InMemoryPersistenceContext persistenceContext) {
		super();
		this.services = services;
		this.persistenceContext = persistenceContext;
	}

//	@TextSyntax("With age of #2 years")
//	public void setAge(Passenger passenger, int age) {
//		passenger.setAge(age);
//	}

	@TextSyntax("Wird kein valides Ticket ausgestellt")
	public void assumeFailure(OperationStatus status) {
		Assert.assertFalse(status.toString(), status.isValid());
	}

	@TextSyntax("Assume #1 has passenger #2")
	public void hasPassenger(Flight flight, Passenger passenger) {
		Assert.assertTrue(flight.hasPassenger(passenger));
	}

	@TextSyntax("Book seat for #1 at #2")
	public OperationStatus bookSeat(Passenger passenger, Flight flight) {
		return services.bookSeat(passenger, flight);
	}

	@TextSyntax("Wenn Passagier #1 sein Ticket für Flug #2 storniert")
	public OperationStatus cancelSeat(Passenger passenger, Flight flight) {
		return services.cancelSeat(passenger, flight);
	}

	@TextSyntax("Wenn ein Passagier #1 #2")
	public Passenger givenAPassenger(String firstname, String lastname) {
		return persistenceContext.createPassenger(firstname, lastname);
	}

	public AirplaneType givenAnAirplane(String airplaneType) {
		return persistenceContext.createAirplaneType(airplaneType);
	}

	@TextSyntax("Für den Flug #1")
	public Flight givenAFlight(String flightName) {
		return persistenceContext.createFlight(flightName);
	}

	@TextSyntax("der mit einer #1 ausgeführt wird")
	public void withAirplane(String airplaneTypeName, Flight flight) {
		AirplaneType airplaneType = givenAnAirplane(airplaneTypeName);
		flight.setAirplane(airplaneType);
		persistenceContext.update(flight);
	}

	@TextSyntax("und #1 freie Sitzplätze hat")
	public void withFreeSeats(int numberOfSeats, Flight flight) {
		flight.setFreeSeats(numberOfSeats);
		persistenceContext.update(flight);
	}

	@TextSyntax("Wird ein valides Ticket ausgestellt")
	public void assumeAValidTicketIsIssued(OperationStatus status) {
		assertTrue(status.getMessage(), status.isValid());
	}

	@TextSyntax("Wird die Stornierung #1 bestätigt")
	public void assumeCancellationSuccessful(@BooleanSyntax(value = { "", "nicht" }) Boolean successExpected,
			OperationStatus status) {
		assertEquals(status.getMessage(), successExpected, status.isValid());
	}

	@TextSyntax("Einen Sitzplatz bucht")
	public OperationStatus einenSitzplatzBucht(Flight flight, Passenger passenger) {
		return bookSeat(passenger, flight);
	}

	@TextSyntax("Wenn #1 erneut ein Ticket für #2 bucht")
	public OperationStatus wennErneutEinTicketFürBucht(Passenger passenger, Flight flight) {
		return bookSeat(passenger, flight);
	}
}
