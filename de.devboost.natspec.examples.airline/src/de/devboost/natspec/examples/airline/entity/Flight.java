package de.devboost.natspec.examples.airline.entity;

import java.util.LinkedList;
import java.util.List;

public class Flight extends NamedEntity {

	private int freeSeats;
	private AirplaneType airplane;
	private List<Integer> passengerIds = new LinkedList<Integer>();

	public Flight(String name) {
		super(name);
	}

	public void setAirplane(AirplaneType airplane) {
		this.airplane = airplane;
		this.freeSeats = airplane.getTotalSeats();
	}

	public AirplaneType getAirplane() {
		return airplane;
	}

	public boolean addPassenger(Passenger passenger) {
		this.passengerIds.add(passenger.getId());
		return true;
	}

	public boolean removePassenger(Passenger passenger) {
		return passengerIds.remove(Integer.valueOf(passenger.getId()));
	}

	public boolean hasPassenger(Passenger passenger) {
		return passengerIds.contains(passenger.getId());
	}

	public int getFreeSeats() {
		return freeSeats - passengerIds.size();
	}

	public void setFreeSeats(int freeSeats) {
		this.freeSeats = freeSeats;
	}

	public List<Integer> bookedPassengerIds() {
		return passengerIds;
	}

}
