package com.panash.designpatterns.observer;

public class Main {

	public static void main(String[] args) {
		
		var slv = new StockListView();
		var sb = new StatusBar();
		
		Stock stock = new Stock("ABD Ltd", 256);
		stock.subscribe(slv);
		stock.subscribe(sb);
		stock.setValue(300);
		
		System.out.println();
		
		stock.unsubscribe(sb);
		stock.setValue(280);
	}
	
}
