package com.training.spring.pms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.spring.pms.model.Product;

@Repository
public class ProductDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public ProductDAO() {
		
	}
	
	public void saveProduct(Product product)
	{
		 String query="insert into product200 values("+product.getProductId() +",'"+product.getProductName()+ "'," + product.getQuantityOnHand()+","+ product.getPrice()+")";  
		//code to write product object in DB
		jdbcTemplate.update(query);
		System.out.println("3.###ProductDAO output : Product with product name , "+product.getProductName()+ "saved in DB");
	}
}
