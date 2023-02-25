package com.panash.designpatterns.command;

import com.panash.designpatterns.command.fx.Command;

public class NotifyAdministrationCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Notified system adminstration");
	}

}
