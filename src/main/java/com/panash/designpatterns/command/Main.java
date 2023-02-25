package com.panash.designpatterns.command;

import com.panash.designpatterns.command.fx.Button;

public class Main {

	public static void main(String[] args) {
		var addCustomerCommand = new AddCustomerCommand(new CustomerService());

		var button = new Button(addCustomerCommand);
		button.click();
		
		System.out.println();

		// We can have a composite command to execute multiple commands on click of a
		// button.
		
		var notifyAdminsCommand = new NotifyAdministrationCommand();
		var compositeCommand = new CompositeCommand();
		
		compositeCommand.addCommand(addCustomerCommand);
		compositeCommand.addCommand(notifyAdminsCommand);
		var buttonNuvo = new Button(compositeCommand);
		
		buttonNuvo.click();
		
	}

}
