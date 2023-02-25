package com.panash.designpatterns.visitor.exercise.solution;

public class NormalizeFilterOp implements Operation {

	@Override
	public void apply(FormatSegment formatSegment) {
		System.out.println("Normalized format segment...");
	}

	@Override
	public void apply(FactSegment factSegment) {
		System.out.println("Normalized fact segment...");
	}

}
