package com.nat_spec.examples.airline.services;

import com.nat_spec.examples.airline.persistence.entity.Flight;
import com.nat_spec.examples.airline.persistence.entity.Passenger;
import com.nat_spec.examples.airline.services.validator.BookingValidation;

public class AirlineServices {

	public AirlineServices() {
	}

	public OperationStatus bookSeat(final Passenger passenger,
			final Flight flight) {
		BookingValidation bookingValidation = new BookingValidation(flight,
				passenger);
		OperationStatus status = bookingValidation.validateBooking();
		if (status.isValid()) {
			flight.addPassenger(passenger);
			return status;
		} else {
			return status;
		}
	}

	public OperationStatus cancelSeat(final Passenger passenger,
			final Flight flight) {
		if (flight.removePassenger(passenger)) {
			return new OperationStatus("Passenger was removed", true);
		}
		return new OperationStatus("Passenger was not booked on flight", false);
	}
}
