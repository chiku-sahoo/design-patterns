package com.panash.designpatterns.adapter.solution;

public class LocalEmailProvider implements EmailProvider {

	@Override
	public void downloadEmails() {
		System.out.println("Local Email Provider - Connecting... Downloading... Disconnecting...");
	}

}
