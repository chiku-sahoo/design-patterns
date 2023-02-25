package com.panash.designpatterns.visitor.exercise.solution;

public class FormatSegment implements Segment {

	@Override
	public void execute(Operation operation) {
		operation.apply(this);
	}

}
