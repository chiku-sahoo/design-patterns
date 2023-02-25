package com.panash.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

import com.panash.designpatterns.command.fx.Command;

public class CompositeCommand implements Command {

	List<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	@Override
	public void execute() {
		commands.stream().forEach(c -> c.execute());
	}

}
