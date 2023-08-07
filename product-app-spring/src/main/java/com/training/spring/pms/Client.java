package com.training.spring.pms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.pms.model.Employee;
import com.training.spring.pms.model.Message;

public class Client {

	public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		/*
		 *
		 * Product product1 = (Product) ctx.getBean("p"); System.out.println(product1);
		 * // 101891 -- Aroma -- with spring -- IOC
		 */		
		
		  Message m = (Message) ctx.getBean("message");
		  System.out.println(m.sayHello());
		 
		  
		  Employee e = (Employee) ctx.getBean("employee");
		  System.out.println(e);
	}
}
















