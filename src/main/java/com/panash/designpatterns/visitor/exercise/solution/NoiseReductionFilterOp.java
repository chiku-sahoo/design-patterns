package com.panash.designpatterns.visitor.exercise.solution;

public class NoiseReductionFilterOp implements Operation {

	@Override
	public void apply(FormatSegment formatSegment) {
		System.out.println("Reduced noise in Format Segment...");
	}

	@Override
	public void apply(FactSegment factSegment) {
		System.out.println("Reduced noise in Fact Segment...");
	}

}
