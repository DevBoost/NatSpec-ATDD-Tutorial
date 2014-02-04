package com.nat_spec.examples.airline.services.validator;

import com.nat_spec.examples.airline.persistence.entity.*;
import com.nat_spec.examples.airline.services.OperationStatus;
	

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
