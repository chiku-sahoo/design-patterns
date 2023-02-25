package com.panash.designpatterns.momento;

public class Document {

	private String content;
	private String fontName;
	private int fontSize;

	public DocumentState createState() {
		return new DocumentState(content, fontName, fontSize);
	}

	public void restoreState(DocumentState prevState) {
		content = prevState.getContent();
		fontName = prevState.getFontName();
		fontSize = prevState.getFontSize();
	}

	public Document(String content, String fontName, int fontSize) {
		this.content = content;
		this.fontName = fontName;
		this.fontSize = fontSize;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	@Override
	public String toString() {
		return "Document [content=" + content + ", fontName=" + fontName + ", fontSize=" + fontSize + "]";
	}

}
