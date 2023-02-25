package com.panash.designpatterns.iterator;

public class Product {

	private String name;
	private double cost;

	public Product(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + "]";
	}

}
