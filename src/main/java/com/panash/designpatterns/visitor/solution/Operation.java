package com.panash.designpatterns.visitor.solution;

public interface Operation {

	// Operation is a VISITOR
	// here the assumption is that the structure of the classes is fixed i.e. the
	// HtmlDocument will always have only anchor node and heading node.

	void apply(AnchorNode anchorNode);

	void apply(HeadingNode headingNode);

}
