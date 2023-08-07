package com.training.spring.pms;

import com.training.spring.pms.model.Product;

public class Client {

	public static void main(String[] args) {
		Product product = new Product(1,"Lakme",99,100);
		System.out.println(product);

	}

}
