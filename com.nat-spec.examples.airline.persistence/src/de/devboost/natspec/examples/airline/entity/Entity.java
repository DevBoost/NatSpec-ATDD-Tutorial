package de.devboost.natspec.examples.airline.entity;

public class Entity {

	private int id;
	private static int counter = 0;

	public Entity() {
		this.setId(counter++);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
