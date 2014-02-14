package com.nat_spec.examples.airline.persistence;

import java.util.HashMap;
import java.util.Map;

import com.nat_spec.examples.airline.persistence.entity.AirplaneType;
import com.nat_spec.examples.airline.persistence.entity.Entity;
import com.nat_spec.examples.airline.persistence.entity.Flight;
import com.nat_spec.examples.airline.persistence.entity.Passenger;

public class InMemoryPersistenceContext {

	private static InMemoryPersistenceContext context;
	private Map<Integer, Flight> flights = new HashMap<Integer, Flight>();
	private Map<Integer, AirplaneType> airplanes = new HashMap<Integer, AirplaneType>();
	private Map<Integer, Passenger> passengers = new HashMap<Integer, Passenger>();

	public static InMemoryPersistenceContext getPersistenceContext() {
		if (context == null) {
			context = new InMemoryPersistenceContext();
		}
		return context;
	}

	public AirplaneType createAirplaneType(String name) {
		AirplaneType a = new AirplaneType(name);
		update(a);
		return a;
	}
	
	public Passenger createPassenger(String firstname, String lastname) {
		Passenger p = new Passenger(firstname, lastname);
		update(p);
		return p;
	}

	public Flight createFlight(String name) {
		Flight f = new Flight(name);
		update(f);
		return f;
	}

	public void update(Entity entity) {
		if (entity instanceof Flight) {
			flights.put(entity.getId(), (Flight) entity);
		}
		if (entity instanceof AirplaneType) {
			airplanes.put(entity.getId(), (AirplaneType) entity);
		}
		if (entity instanceof Passenger) {
			passengers.put(entity.getId(), (Passenger) entity);
		}
	}

	public AirplaneType getAirplaneType(int id) {
		return airplanes.get(id);
	}

	public Flight getFlight(int id) {
		return flights.get(id);
	}

	public Passenger getPassenger(int id) {
		return passengers.get(id);
	}

	public void shutdown() {
		
	}

}
