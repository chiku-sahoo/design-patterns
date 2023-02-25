package com.panash.designpatterns.decorator.solution;

public class SourceControlArtefact implements Artefact {

	private Artefact artefact;

	public SourceControlArtefact(Artefact artefact) {
		this.artefact = artefact;
	}

	@Override
	public String render() {
		var sourceControlIcon = "[SourceControl]";
		return String.format("%s %s", artefact.render(), sourceControlIcon);
	}

}
