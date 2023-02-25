package com.panash.designpatterns.mediator.observer;

public class Main {

	public static void main(String[] args) {
		ArticlesDialogBox mediator = new ArticlesDialogBox();
		mediator.simulateUserInteraction();
	}
	
}
