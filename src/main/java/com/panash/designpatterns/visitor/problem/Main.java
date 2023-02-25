package com.panash.designpatterns.visitor.problem;

public class Main {

	public static void main(String[] args) {
		var htmlDocument = new HtmlDocument();
		var headingNode = new HeadingNode();
		var anchorNode = new AnchorNode();

		htmlDocument.addNode(headingNode);
		htmlDocument.addNode(anchorNode);

		htmlDocument.highlight();

		// tomorrow if we want to add a new operation we will have to modify the entire
		// object structure to implement the new operation.

	}

}
