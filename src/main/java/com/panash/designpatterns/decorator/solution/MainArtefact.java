package com.panash.designpatterns.decorator.solution;

public class MainArtefact implements Artefact {

	private Artefact artefactMarker;

	public MainArtefact(Artefact artefactMarker) {
		this.artefactMarker = artefactMarker;
	}

	@Override
	public String render() {
		String mainIcon = "[Main]";

		return String.format("%s %s", artefactMarker.render(), mainIcon);
	}

}
