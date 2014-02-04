package de.devboost.natspec.examples.airline.test;

import org.junit.Assert;

import de.devboost.natspec.annotations.TextSyntax;
import de.devboost.natspec.examples.airline.InMemoryPersistenceContext;
import de.devboost.natspec.examples.airline.entity.AirplaneType;
import de.devboost.natspec.examples.airline.entity.Flight;
import de.devboost.natspec.examples.airline.entity.Passenger;
import de.devboost.natspec.examples.airline.services.AirlineServices;
import de.devboost.natspec.examples.airline.services.OperationStatus;

public class TestSupport {

	private AirlineServices services;
	private InMemoryPersistenceContext persistenceContext;

	public TestSupport(AirlineServices services,
			InMemoryPersistenceContext persistenceContext) {
		super();
		this.services = services;
		this.persistenceContext = persistenceContext;
	}

	@TextSyntax("With age of #2 years")
	public void setAge(Passenger passenger, int age) {
		passenger.setAge(age);
	}

	@TextSyntax("Assume success")
	public void assumeSuccess(OperationStatus status) {
		Assert.assertTrue(status.toString(), status.isValid());
	}

	@TextSyntax("Assume failure")
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

	@TextSyntax("Cancel seat for #1 at #2")
	public OperationStatus cancelSeat(Passenger passenger, Flight flight) {
		return services.cancelSeat(passenger, flight);
	}

	@TextSyntax("Given a Passenger #1 #2")
	public Passenger givenAPassenger(String firstname, String lastname) {
		return persistenceContext.createPassenger(firstname, lastname);
	}

	@TextSyntax("Given an Airplane #1")
	public AirplaneType givenAnAirplane(String airplaneType) {
		return persistenceContext.createAirplaneType(airplaneType);
	}

	@TextSyntax("Given a flight #1")
	public Flight givenAFlight(String flightName) {
		return persistenceContext.createFlight(flightName);
	}

	@TextSyntax("With airplane #1")
	public void withAirplane(AirplaneType airplaneType, Flight flight) {
		flight.setAirplane(airplaneType);
		persistenceContext.update(flight);
	}

	@TextSyntax("With #1 free seats")
	public void withFreeSeats(int numberOfSeats, Flight flight) {
		flight.setFreeSeats(numberOfSeats);
		persistenceContext.update(flight);
	}

}
