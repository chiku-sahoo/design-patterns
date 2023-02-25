package com.panash.designpatterns.mediator.observer;

public class ArticlesDialogBox {

	private ListBox articlesListBox = new ListBox();
	private TextBox titleTextBox = new TextBox();
	private Button saveButton = new Button();

	public ArticlesDialogBox() {
		articlesListBox.addEventHandler(() -> articleSelected());
		titleTextBox.addEventHandler(this::titleChanged); // can be written using lambda or method reference
	}

	public void simulateUserInteraction() {
		articlesListBox.setSelection("Article 1");
		System.out.println("Title Box Content: " + titleTextBox.getContent());
		System.out.println("Save Button Enabled: " + saveButton.isEnabled());

		titleTextBox.setContent("");
		System.out.println("Title Box Content: " + titleTextBox.getContent());
		System.out.println("Save Button Enabled: " + saveButton.isEnabled());
	}

	private void titleChanged() {
		var isEmpty = (titleTextBox.getContent() == null || titleTextBox.getContent().isEmpty());
		saveButton.setEnabled(!isEmpty);
	}

	private void articleSelected() {
		titleTextBox.setContent(articlesListBox.getSelection());
		saveButton.setEnabled(true);
	}

}
