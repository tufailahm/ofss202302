package com.training.spring.pms.model;

import org.springframework.stereotype.Component;

@Component
public class Message {

	public Message() {
		System.out.println("Message Default Constructor called");
	}

	public String sayHello() {
		return "Hi from message";
	}
}
