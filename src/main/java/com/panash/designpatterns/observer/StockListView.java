package com.panash.designpatterns.observer;

public class StockListView implements Observer {

	@Override
	public void update() {
		System.out.println("Stock List View updated");
	}

}
