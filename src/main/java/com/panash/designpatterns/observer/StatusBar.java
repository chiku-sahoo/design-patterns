package com.panash.designpatterns.observer;

public class StatusBar implements Observer {

	@Override
	public void update() {
		System.out.println("Status bar updated");
	}

}
