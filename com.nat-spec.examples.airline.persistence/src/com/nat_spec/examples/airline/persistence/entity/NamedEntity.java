package com.nat_spec.examples.airline.persistence.entity;

public abstract class NamedEntity extends Entity {

	private String name;

	public NamedEntity(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
