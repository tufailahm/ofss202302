package com.training.pms.marvel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.training.pms.marvel.model.Product;
import com.training.pms.marvel.utility.EntityManagerUtil;

public class ProductDAO {

	EntityManager  entityManager = EntityManagerUtil.getEntityManager();
	public void saveProduct(Product product)
	{
		entityManager.getTransaction().begin();		//DML requires transaction
		entityManager.merge(product);				//save the product in db
		entityManager.getTransaction().commit();
	}
	
	public void updateProduct(Product product)
	{
		entityManager.getTransaction().begin();		//DML requires transaction
	//	entityManager.up(product);				//save the product in db
		entityManager.getTransaction().commit();
	}
	
	
	public void deleteProduct(int productId)
	{
		entityManager.getTransaction().begin();		//DML requires
		Product product = entityManager.find(Product.class, productId);			//finding product with productId
		entityManager.remove(product);			//detached
		entityManager.getTransaction().commit();
	}
	
	
	public void deleteProduct(Product product)
	{
		entityManager.getTransaction().begin();		//DML requires
		product = entityManager.find(Product.class, product.getProductId());			//finding product with productId
		entityManager.remove(product);
		entityManager.getTransaction().commit();
	}
	
	
	//Fetch all the data from db
	public List<Product> getProducts()
	{
		List<Product> products = new ArrayList<Product>();
		entityManager.getTransaction().begin();		//DML requires transaction
		products = entityManager.createQuery("from Product").getResultList();
		entityManager.getTransaction().commit();
		return products;
	}
}
