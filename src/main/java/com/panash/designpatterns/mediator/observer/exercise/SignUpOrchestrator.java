package com.panash.designpatterns.mediator.observer.exercise;

public class SignUpOrchestrator {

	private TextBox usernameTextBox = new TextBox();
	private TextBox passwordTextBox = new TextBox();
	private CheckBox termsAgreement = new CheckBox();
	private Button signUpButton = new Button();

	public SignUpOrchestrator() {
		// injecting instances of EventHandlers in each of the UIControls.
		// instances of EventHandlers are implemented using lamdba below.
		usernameTextBox.attachHandler(() -> requirementCheck());
		passwordTextBox.attachHandler(() -> requirementCheck());
		termsAgreement.attachHandler(() -> requirementCheck());
	}

	public void orchestrate() {
		usernameTextBox.setContent("asahoo");
		passwordTextBox.setContent("pwd");
		termsAgreement.setChecked(true);

		passwordTextBox.setContent("");
	}

	// this method contains the implementation logic of functional interface
	// EventHandler.
	private void requirementCheck() {
		var result = true;
		if (usernameTextBox.getContent() == null || usernameTextBox.getContent().isEmpty()) {
			System.out.println("Username is empty.");
			result = false;
		}
		if (passwordTextBox.getContent() == null || passwordTextBox.getContent().isEmpty()) {
			System.out.println("Password is empty.");
			result = false;
		}
		if (!termsAgreement.isChecked()) {
			System.out.println("TnC not accepted.");
			result = false;
		}

		if (result == true)
			signUpButton.setEnabled(true);
		else
			signUpButton.setEnabled(false);

		System.out.println("Sign-up button enabled? " + signUpButton.isEnabled());
		System.out.println();
	}

}
