package com.panash.designpatterns.mediator;

public class ArticlesDialogBox extends DialogBox {

	private ListBox articlesListBox = new ListBox(this);
	private TextBox titleTextBox = new TextBox(this);
	private Button saveButton = new Button(this);

	
	public void simulateUserInteraction() {
		articlesListBox.setSelection("Article 1");
		System.out.println("Title Box Content: " + titleTextBox.getContent());
		System.out.println("Save Button Enabled: " + saveButton.isEnabled());
		
		titleTextBox.setContent("");
		System.out.println("Title Box Content: " + titleTextBox.getContent());
		System.out.println("Save Button Enabled: " + saveButton.isEnabled());
	}
	
	@Override
	public void changed(UIControl control) {
		if (control == articlesListBox)
			articleSelected();
		else if (control == titleTextBox)
			titleChanged();
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
