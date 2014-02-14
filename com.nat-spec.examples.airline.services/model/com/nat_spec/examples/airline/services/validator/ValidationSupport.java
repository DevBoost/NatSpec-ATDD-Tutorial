package com.nat_spec.examples.airline.services.validator;

import com.nat_spec.examples.airline.persistence.entity.Flight;
import com.nat_spec.examples.airline.persistence.entity.Passenger;
import com.nat_spec.examples.airline.services.OperationStatus;

import de.devboost.natspec.annotations.TextSyntax;

public class ValidationSupport {

	private Passenger passenger;
	private Flight flight;
	private OperationStatus status;

	public ValidationSupport(Flight f, Passenger p) {
		this.flight = f;
		this.passenger = p;
		setStatus(new OperationStatus());
	}

	public OperationStatus getStatus() {
		return status;
	}
	
	private void setInvalid(String message) {
		getStatus().setValid(false);
		getStatus().addMessage(message);
	}

	private void setStatus(OperationStatus status) {
		this.status = status;
	}

	@TextSyntax("Each Passenger can only be booked once.")
	public void checkUniquePassenger() {
		if (flight.bookedPassengerIds().contains(passenger.getId())) {
			setInvalid("A passenger can only be booked once for each flight.");
		}
	}

	@TextSyntax("There should be at least #1 free seats to handle overbooking.")
	public void checkFreeSeats(int overbookingBuffer) {
		if (flight.getFreeSeats() < overbookingBuffer) {
			setInvalid("There are no free seats for the flight.");
		}
	}

	@TextSyntax("There needs to be a free seat for the passenger.")
	public void checkFreeSeats() {
		if (flight.getFreeSeats() < 1) {
			setInvalid("There are no free seats for the flight.");
		}
	}

//	@TextSyntax("The Passenger needs to be at least #1 years old.")
//	public void thePassengerNeedsToBeAtLeastYearsOld(int minimalAge) {
//		if (passenger.getAge() < minimalAge) {
//			setInvalid("The passenger needs to be at least " + minimalAge
//					+ " years.");
//		}
//	}
	

}
