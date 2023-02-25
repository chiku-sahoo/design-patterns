package com.panash.designpatterns.adapter.solution;

import com.panash.designpatterns.adapter.problem.gmail.GmailClient;

public class CustomGmailProvider implements EmailProvider {

	private GmailClient gmailClientSdk; // composition over inheritance

	public CustomGmailProvider(GmailClient gmailClientSdk) {
		this.gmailClientSdk = gmailClientSdk;
	}

	/**
	 * By implementing EmailProvider and with composition of GmailClient in this
	 * custom class we tried to match the interface.
	 * 
	 * We had to do this because GmailClient is an sdk from a package and we cannot
	 * modify it to match our interface.
	 */
	@Override
	public void downloadEmails() {
		gmailClientSdk.connect();
		gmailClientSdk.getEmails();
		gmailClientSdk.disconnect();
	}

}
