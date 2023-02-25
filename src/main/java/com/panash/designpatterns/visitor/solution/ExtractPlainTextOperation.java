package com.panash.designpatterns.visitor.solution;

public class ExtractPlainTextOperation implements Operation {

	@Override
	public void apply(AnchorNode anchorNode) {
		System.out.println("Plain text for anchor node");
	}

	@Override
	public void apply(HeadingNode headingNode) {
		System.out.println("Plain text for heading node.");
	}

}
