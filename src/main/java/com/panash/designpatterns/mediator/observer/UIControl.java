package com.panash.designpatterns.mediator.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

	List<EventHandler> handlers = new ArrayList<>(); // list of observers

	public boolean addEventHandler(EventHandler handler) {
		return handlers.add(handler);
	}

	public boolean removeEventHandler(EventHandler handler) {
		return handlers.remove(handler);
	}

	protected void notifyEventHandlers() { // because only UIControl subclasses should be able to access this method.
		handlers.forEach(o -> o.handle());
	}

}
