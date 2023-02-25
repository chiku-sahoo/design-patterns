package com.panash.designpatterns.command;

import com.panash.designpatterns.command.fx.Command;

public class AddCustomerCommand implements Command {

	private CustomerService customerService;

	public AddCustomerCommand(CustomerService customerService) {
		this.customerService = customerService;
	}

	@Override
	public void execute() {
		customerService.addCustomer();
	}

}
