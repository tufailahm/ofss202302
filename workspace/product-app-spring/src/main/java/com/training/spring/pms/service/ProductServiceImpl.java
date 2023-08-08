package com.training.spring.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.pms.dao.ProductDAO;
import com.training.spring.pms.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired(required = false)
	ProductDAO dao;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public void saveProduct(Product product) {
		//save in oracle db
		//code for logging
		//check authentication
		System.out.println("2.ORACLE ###ProductService output : Product with product name , "+product.getProductName()+ "saved in DB");
		dao.saveProduct(product);
		//logging 
	}
	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
}
