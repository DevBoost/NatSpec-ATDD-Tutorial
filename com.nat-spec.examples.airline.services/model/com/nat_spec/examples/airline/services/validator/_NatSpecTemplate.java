package com.nat_spec.examples.airline.services.validator;

import com.nat_spec.examples.airline.persistence.entity.Flight;
import com.nat_spec.examples.airline.persistence.entity.Passenger;
import com.nat_spec.examples.airline.services.OperationStatus;

public class _NatSpecTemplate {

	ValidationSupport validationSupport;

	public _NatSpecTemplate(Flight f, Passenger p) {
		validationSupport = new ValidationSupport(f, p);
	}

	public OperationStatus validate() {
		/* @MethodBody */
		return validationSupport.getStatus();
	}

}
