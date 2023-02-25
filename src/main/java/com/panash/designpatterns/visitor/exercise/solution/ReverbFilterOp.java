package com.panash.designpatterns.visitor.exercise.solution;

public class ReverbFilterOp implements Operation {

	@Override
	public void apply(FormatSegment formatSegment) {
		System.out.println("Reverbed format segment...");
	}

	@Override
	public void apply(FactSegment factSegment) {
		System.out.println("Reverbed fact segment...");
	}

}
