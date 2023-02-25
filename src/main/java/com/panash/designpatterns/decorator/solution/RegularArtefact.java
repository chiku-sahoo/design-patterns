package com.panash.designpatterns.decorator.solution;

public class RegularArtefact implements Artefact {

	private String fileName;

	public RegularArtefact(String name) {
		this.fileName = name;
	}

	@Override
	public String render() {
		return fileName;
	}

}
