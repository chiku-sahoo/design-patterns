package com.panash.designpatterns.decorator.solution;

public class Editor {
    public void openProject(String path) {
        Artefact[] artefacts = {
                new MainArtefact(new RegularArtefact("Main.js")),
                new RegularArtefact("Demo.js"),
                new ErrorArtefact(new RegularArtefact("EmailClient.js")),
                new RegularArtefact("EmailProvider.js"),
                new SourceControlArtefact(new ErrorArtefact(new RegularArtefact("EmailUtil.js")))
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
