package com.panash.designpatterns.visitor.solution;

public class Main {

	public static void main(String[] args) {
		var htmlDocument = new HtmlDocument();
		var headingNode = new HeadingNode();
		var anchorNode = new AnchorNode();

		htmlDocument.addNode(headingNode);
		htmlDocument.addNode(anchorNode);

		htmlDocument.execute(new HighlightOperation());

		// tomorrow if we want to add a extract plain text operation, we can simply to
		// it by adding a new implementation of Operation.
		
		htmlDocument.execute(new ExtractPlainTextOperation());
	}

}
