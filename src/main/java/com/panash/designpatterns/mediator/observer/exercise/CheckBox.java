package com.panash.designpatterns.mediator.observer.exercise;

public class CheckBox extends UIControl {

	private boolean isChecked;

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
		notifyEventHandlers();
	}

}
