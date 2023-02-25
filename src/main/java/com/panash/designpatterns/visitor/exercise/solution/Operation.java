package com.panash.designpatterns.visitor.exercise.solution;

public interface Operation {

	/**
	 * Operation is a VISITOR.
	 * 
	 * Here, the structure of a WavFile is fixed i.e. it will have only fact segments
	 * and format segments.
	 */

	void apply(FormatSegment formatSegment);

	void apply(FactSegment factSegment);

}
