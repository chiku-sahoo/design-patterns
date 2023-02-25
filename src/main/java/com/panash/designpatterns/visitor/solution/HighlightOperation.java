package com.panash.designpatterns.visitor.solution;

public class HighlightOperation implements Operation {

	@Override
	public void apply(AnchorNode anchorNode) {
		System.out.println("highlight anchor node.");
	}

	@Override
	public void apply(HeadingNode headingNode) {
		System.out.println("highlight heading node.");
	}

}
