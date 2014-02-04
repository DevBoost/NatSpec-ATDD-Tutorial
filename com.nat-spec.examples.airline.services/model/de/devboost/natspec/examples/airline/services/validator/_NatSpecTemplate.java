package de.devboost.natspec.examples.airline.services.validator;

import de.devboost.natspec.examples.airline.entity.*;
import de.devboost.natspec.examples.airline.services.OperationStatus;
	

public class _NatSpecTemplate {

	BookingValidationServices bookingValidationServices;

	public _NatSpecTemplate(Flight f, Passenger p) {
		bookingValidationServices = new BookingValidationServices(f, p);
	}

	public OperationStatus validateBooking() {
		/* @MethodBody */
		return bookingValidationServices.getStatus();
	}
	
}
