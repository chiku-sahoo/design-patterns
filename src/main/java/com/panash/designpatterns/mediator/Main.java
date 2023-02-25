package com.panash.designpatterns.mediator;

public class Main {

	/**
	 * Mediator pattern is used to get rid of messy interactions between the object.
	 * 
	 * In this example DialogBox class is the mediator. It will have the logic to
	 * route communications.
	 * 
	 */

	public static void main(String[] args) {

		ArticlesDialogBox mediator = new ArticlesDialogBox();
		mediator.simulateUserInteraction();
	}

}
