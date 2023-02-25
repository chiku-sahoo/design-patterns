package com.panash.designpatterns.mediator.observer.exercise;

public class Main {

	public static void main(String[] args) {
		SignUpOrchestrator mediator = new SignUpOrchestrator();
		mediator.orchestrate();
	}
	
}
