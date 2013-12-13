package com.ideais.estagio.web;

public class Message {

	private String owner;
	private String text;
	
	public Message(String owner, String text) {
		this.owner = owner;
		this.text = text;
	}

	public String getOwner() {
		return owner;
	}

	public String getText() {
		return text;
	}
	
}
