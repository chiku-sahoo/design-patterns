package com.panash.designpatterns.decorator.solution;

public class ErrorArtefact implements Artefact {

	private Artefact artefact;

	public ErrorArtefact(Artefact artefactMarker) {
		this.artefact = artefactMarker;
	}

	@Override
	public String render() {
		String errorIcon = "[Error]";

		return String.format("%s %s", artefact.render(), errorIcon);
	}

}
