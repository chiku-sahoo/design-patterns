package com.panash.designpatterns.bridge.solution;

public class Main {

	public static void main(String[] args) {
		var remoteControl = new AdvancedRemoteControl(new SonyTV());
		remoteControl.turnOn();
	}
	
}
