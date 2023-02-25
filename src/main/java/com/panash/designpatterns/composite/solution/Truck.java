package com.panash.designpatterns.composite.solution;

public class Truck implements RescueUnitResource {
 
	@Override
	public void deploy() {
    System.out.println("Deploying a truck");
  }
}
