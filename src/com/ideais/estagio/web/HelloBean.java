package com.ideais.estagio.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="hello")
@SessionScoped
public class HelloBean {

	private Message message;
	
	public HelloBean(){
		message = new Message("JSF", "Hello World");
	}
	
	public Message getMessage(){
		return message;
	}
	
}
