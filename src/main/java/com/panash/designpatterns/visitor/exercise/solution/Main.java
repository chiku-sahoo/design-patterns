package com.panash.designpatterns.visitor.exercise.solution;

public class Main {

	public static void main(String[] args) {
		var wavFile = WavFile.createWavFile();

		wavFile.execute(new NoiseReductionFilterOp());
		wavFile.execute(new NormalizeFilterOp());

		// tomorrow if a new operation is added, just create a new implementation of
		// Operation.
		
		wavFile.execute(new ReverbFilterOp());
	}

}
