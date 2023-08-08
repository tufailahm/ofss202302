package com.training.pms.marvel.client;

import com.training.pms.marvel.jms.ProductJMSReciever;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Starting reading message :: ");
		ProductJMSReciever jmsReciever = new ProductJMSReciever();
		String msg = jmsReciever.recieveMessage();
		System.out.println("Message recvd is :"+msg);
	}

}
