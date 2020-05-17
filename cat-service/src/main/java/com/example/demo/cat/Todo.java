package com.example.demo.cat;

public class Todo {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public Todo(String text) {
		this.text = text;
	}
	
	public Todo() {}
}
