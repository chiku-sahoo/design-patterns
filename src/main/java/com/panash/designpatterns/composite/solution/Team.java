package com.panash.designpatterns.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Team implements RescueUnitResource {
	private List<RescueUnitResource> resources = new ArrayList<>();

	public void add(RescueUnitResource resource) {
		resources.add(resource);
	}

	@Override
	public void deploy() {
		for (var resource : resources)
			resource.deploy();
	}

}
