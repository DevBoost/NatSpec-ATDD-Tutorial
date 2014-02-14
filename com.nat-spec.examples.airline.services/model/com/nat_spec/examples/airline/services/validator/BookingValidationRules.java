package com.nat_spec.examples.airline.services.validator;

import com.nat_spec.examples.airline.persistence.entity.Flight;
import com.nat_spec.examples.airline.persistence.entity.Passenger;
import com.nat_spec.examples.airline.services.OperationStatus;

public class BookingValidationRules {

	ValidationSupport validationSupport;

	public BookingValidationRules(Flight f, Passenger p) {
		validationSupport = new ValidationSupport(f, p);
	}

	public OperationStatus validate() {
		// The code in this method is generated from: /com.nat-spec.examples.airline.services/model/com/nat_spec/examples/airline/services/validator/BookingValidationRules.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// There needs to be a free seat for the passenger.
		validationSupport.checkFreeSeats();
		// There should be at least 0 free seats to handle overbooking.
		validationSupport.checkFreeSeats(0);
		// Each Passenger can only be booked once.
		validationSupport.checkUniquePassenger();
		
		return validationSupport.getStatus();
	}

}
