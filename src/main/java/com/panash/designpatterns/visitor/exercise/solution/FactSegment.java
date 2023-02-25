package com.panash.designpatterns.visitor.exercise.solution;

public class FactSegment implements Segment {

	@Override
	public void execute(Operation operation) {
		operation.apply(this);
	}

}
