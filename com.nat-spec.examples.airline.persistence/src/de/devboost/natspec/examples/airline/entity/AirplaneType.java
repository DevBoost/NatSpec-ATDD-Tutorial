package de.devboost.natspec.examples.airline.entity;

public class AirplaneType extends NamedEntity {

	private int totalSeats;

	public AirplaneType(String name) {
		super(name);
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
}
