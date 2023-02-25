package com.panash.designpatterns.momento;

import java.util.Stack;

public class History {

	private Stack<DocumentState> states = new Stack<>();

	public void push(DocumentState state) {
		states.push(state);
	}

	public DocumentState pop() {
		return states.pop();
	}

}
