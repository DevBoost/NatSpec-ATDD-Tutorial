package com.nat_spec.examples.airline.services;

public class OperationStatus {

	private String message;
	private boolean valid;

	public OperationStatus(String message, boolean valid) {
		this.message = message;
		this.valid = valid;
	}

	public OperationStatus() {
		message = "";
		valid = true;
	}

	public String getMessage() {
		return message;
	}

	public void addMessage(String cause) {
		setMessage(getMessage() + cause + "\n");
	}

	private String getValidStatus() {
		if (isValid())
			return "Operation Valid";
		else
			return "Operation Invalid";
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return getValidStatus() + ": " + getMessage();
	}

}
