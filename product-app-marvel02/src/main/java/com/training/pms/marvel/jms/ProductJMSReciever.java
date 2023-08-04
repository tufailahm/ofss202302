package com.training.pms.marvel.jms;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ProductJMSReciever {

	Properties properties;
	Context context = null;
	ConnectionFactory factory = null;
	Connection connection = null;
	Destination destination = null;
	Session session = null;
	MessageConsumer consumer = null;

	public ProductJMSReciever() {
		properties = JMSUtil.getJMSProperties();
	}

	public String recieveMessage() {
		String msg=null;
		try {
			context = new InitialContext(properties);
			factory = (ConnectionFactory) context.lookup("ConnectionFactory");
			destination = (Destination) context.lookup("queueSampleQueue"); // create it
			connection = factory.createConnection();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			consumer = session.createConsumer(destination);
			connection.start();

			Message message = consumer.receive();
			if (message instanceof TextMessage) {
				TextMessage text = (TextMessage) message;
				msg =  text.getText();
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				session.close();
				consumer.close();
				connection.close();
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return msg;

	}

}
