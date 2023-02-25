package com.panash.designpatterns.mediator.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

	List<EventHandler> handlers = new ArrayList<>();

	public boolean attachHandler(EventHandler handler) {
		return handlers.add(handler);
	}

	public boolean detachHandler(EventHandler handler) {
		return handlers.remove(handler);
	}

	protected void notifyEventHandlers() {
		handlers.forEach(h -> h.handle());
	}

}
