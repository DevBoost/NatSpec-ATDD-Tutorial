package com.nat_spec.examples.airline.services;

import com.nat_spec.examples.airline.persistence.entity.Flight;
import com.nat_spec.examples.airline.persistence.entity.Passenger;
import com.nat_spec.examples.airline.services.validator.BookingValidationRules;

public class AirlineServices {

	public OperationStatus bookSeat(Passenger passenger, Flight flight) {
		BookingValidationRules bookingValidation = new BookingValidationRules(flight,
				passenger);
		OperationStatus status = bookingValidation.validate();
		if (status.isValid()) {
			flight.addPassenger(passenger);
		}
		return status;
	}

	public OperationStatus cancelSeat(Passenger passenger, Flight flight) {
		if (flight.removePassenger(passenger)) {
			return new OperationStatus("Passenger was removed", true);
		}
		return new OperationStatus("Passenger was not booked on flight", false);
	}
}
