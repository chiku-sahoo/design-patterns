package com.panash.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();

	public void subscribe(Observer obs) {
		observers.add(obs);
	}

	public void unsubscribe(Observer obs) {
		observers.remove(obs);
	}

	public void updateObservers() {
		for (var obs : observers) {
			obs.update();
		}
	}
}
