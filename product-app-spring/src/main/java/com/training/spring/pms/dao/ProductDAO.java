package com.training.spring.pms.dao;

import org.springframework.stereotype.Repository;

import com.training.spring.pms.model.Product;

@Repository
public class ProductDAO {

	public ProductDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveProduct(Product product)
	{
		//code to write product object in DB
		System.out.println("###ProductDAO output : Product with product name , "+product.getProductName()+ "saved in DB");
	}

}
