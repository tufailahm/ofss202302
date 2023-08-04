package com.training.pms.marvel.jms;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ProductJMSSender {

	Properties properties ;
	Context context = null;
	ConnectionFactory factory = null;
	Connection connection = null;
	Destination destination = null;
	Session session = null;
	MessageProducer producer = null;
	
	public ProductJMSSender() {
		properties = JMSUtil.getJMSProperties();
	}
	
	
	public String  sendProductOutOfStockMessage(String msg) {
			try {
				context = new InitialContext(properties);
				factory = (ConnectionFactory) context.lookup("ConnectionFactory");
				destination = (Destination) context.lookup("queueSampleQueue");		//create it 
				connection = factory.createConnection();
				session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
				producer = session.createProducer(destination);
				connection.start();
				
				TextMessage textMessage = session.createTextMessage();
				
				textMessage.setText(msg);
				
				System.out.println("Your message has been sent successfully !!");
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return "Your message has been sent successfully !!";
		
	}
	

}
