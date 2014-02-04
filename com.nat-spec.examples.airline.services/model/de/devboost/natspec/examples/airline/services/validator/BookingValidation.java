package de.devboost.natspec.examples.airline.services.validator;

import de.devboost.natspec.examples.airline.entity.*;
import de.devboost.natspec.examples.airline.services.OperationStatus;
	

public class BookingValidation {

	BookingValidationServices bookingValidationServices;

	public BookingValidation(Flight f, Passenger p) {
		bookingValidationServices = new BookingValidationServices(f, p);
	}

	public OperationStatus validateBooking() {
		// The code in this method is generated from: /com.nat-spec.examples.airline.services/model/de/devboost/natspec/examples/airline/services/validator/BookingValidation.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// There needs to be a free seat for the passenger.
		bookingValidationServices.checkFreeSeats();
		// There should be at least 0 free seats for overbooking issues.
		bookingValidationServices.checkFreeSeats(0);
		// Each Passenger can only be booked once.
		bookingValidationServices.checkUniquePassenger();
		
		return bookingValidationServices.getStatus();
	}
	
}
