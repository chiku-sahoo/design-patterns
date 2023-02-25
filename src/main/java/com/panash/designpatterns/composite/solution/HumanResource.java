package com.panash.designpatterns.composite.solution;

public class HumanResource implements RescueUnitResource {
  
	@Override
	public void deploy() {
    System.out.println("Deploying a human resource");
  }
}
