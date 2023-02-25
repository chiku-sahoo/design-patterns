package com.panash.designpatterns.visitor.exercise.solution;

import java.util.ArrayList;
import java.util.List;

public class WavFile {

	private List<Segment> segments = new ArrayList<>();

	public static WavFile createWavFile() {
		var wavFile = new WavFile();
		wavFile.segments.add(new FormatSegment());
		wavFile.segments.add(new FactSegment());
		wavFile.segments.add(new FactSegment());
		wavFile.segments.add(new FactSegment());
		return wavFile;
	}
	
	public void execute(Operation operation) {
		segments.forEach(s -> s.execute(operation));
	}

}
