package com.panash.designpatterns.adapter.solution;

import com.panash.designpatterns.adapter.problem.gmail.GmailClient;

public class Main {

	public static void main(String[] args) {
		var emailClient = new EmailClient();
		emailClient.addProvider(new LocalEmailProvider());
		
		var customGmailProvider = new CustomGmailProvider(new GmailClient());
		emailClient.addProvider(customGmailProvider);
		
		emailClient.downloadEmails();
	}
	
}
