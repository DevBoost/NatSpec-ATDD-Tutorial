package com.nat_spec.examples.airline.forms;

public class FoodOrder {

	protected FormSupport formSupport = new FormSupport();

	public void createFormModel() {
		// generated code will be inserted here
		// The code in this method is generated from: /com.nat-spec.examples.airline.forms/src/com/nat_spec/examples/airline/forms/FoodOrder.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Let user select between the following options:
		com.nat_spec.examples.airline.forms.elements.OptionSet optionSet_ = formSupport.addOptionSet();
		// - Hamburger
		formSupport.addOption(java.util.Arrays.asList(new java.lang.String[] {"Hamburger"}), optionSet_);
		// - Cheeseburger
		formSupport.addOption(java.util.Arrays.asList(new java.lang.String[] {"Cheeseburger"}), optionSet_);
		// Ask user: Would you like french fries with that?
		formSupport.askWouldYouLikeFrenchFriesWithThat(java.util.Arrays.asList(new java.lang.String[] {"Would", "you", "like", "french", "fries", "with", "that?"}));
		// Ask user: Do you collect bonus points?
		formSupport.askWouldYouLikeFrenchFriesWithThat(java.util.Arrays.asList(new java.lang.String[] {"Do", "you", "collect", "bonus", "points?"}));
		// Ask user for his email address.
		formSupport.askUserForHisEmailAddress();
		
	}

	public FormSupport getFormSupport() {
		return formSupport;
	}
}