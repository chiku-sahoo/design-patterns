package com.panash.designpatterns.momento;

public class Excecutor {

	public static void main(String[] args) {
		var history = new History();
		
		var document = new Document("Hello World!", "Aerial", 11);
		history.push(document.createState());
		
		document.setContent("Hello good people!");
		history.push(document.createState());
		
		document.setFontSize(13);
		System.out.println(document);
		
		document.restoreState(history.pop());
		System.out.println(document);
		
		document.restoreState(history.pop());
		System.out.println(document);
		
		document.restoreState(history.pop());
		System.out.println(document);
	}
	
}
