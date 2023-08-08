package com.training.pms.marvel.jms;

import java.util.Properties;

import javax.naming.Context;

public class JMSUtil {
	
	public static Properties getJMSProperties() {
		Properties initialProperties = new Properties();
		
		initialProperties.put(Context.INITIAL_CONTEXT_FACTORY,"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		initialProperties.put(Context.PROVIDER_URL, "tcp://localhost:61616");
		initialProperties.put("queue.queueSampleQueue", "queueSampleQueue");
		
		return initialProperties;
	}
}
