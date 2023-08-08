package com.training.pms.marvel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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

	public Product findProductById(int productId)
	{
		entityManager.getTransaction().begin();		//DML requires
		Product product = entityManager.find(Product.class, productId);			//finding product with productId
		entityManager.getTransaction().commit();
		return product;
	}
	
	public boolean isProductExists(int productId)
	{
		entityManager.getTransaction().begin();		//DML requires
		Product product = entityManager.find(Product.class, productId);			//finding product with productId
		entityManager.getTransaction().commit();
		if (product == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public List<Product> searchByProductName(String productName)
	{
		List<Product> products = new ArrayList<Product>();
		entityManager.getTransaction().begin();		//DML requires
		//select * from product where productName = 'Aroma'
		products = entityManager.createQuery("from Product where productName = '"+productName+ "'").getResultList();	
		entityManager.getTransaction().commit();
		return products;
	}
	
	
	
	
	
	public List<Product> showAllProducts()
	{
		List<Product> products = new ArrayList<Product>();
		entityManager.getTransaction().begin();		

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);	// select *
		criteriaQuery.from(Product.class);  // from product
		
		products = entityManager.createQuery(criteriaQuery).getResultList();	
		entityManager.getTransaction().commit();
		return products;
	}
	
	public List<Product> searchByProductNameUsingCriteria(String productName)
	{
		List<Product> products = new ArrayList<Product>();
		entityManager.getTransaction().begin();		

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);	// select *
		Root root = criteriaQuery.from(Product.class);  // from product
				
		criteriaQuery.select(root).where(criteriaBuilder.like(root.get("productName"), productName));

		products = entityManager.createQuery(criteriaQuery).getResultList();	
		entityManager.getTransaction().commit();
		return products;
	}
	

	public List<Product> searchByProductName(String productName,int lowerRange,int upperRange)
	{
		List<Product> products = new ArrayList<Product>();
		entityManager.getTransaction().begin();		

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
		Root<Product> root = criteriaQuery.from(Product.class);
		
		Predicate predicate = criteriaBuilder.and(criteriaBuilder.equal(root.get("productName"), productName),
        								criteriaBuilder.between(root.get("price"), lowerRange,upperRange)); 
	
		 criteriaQuery.where(predicate);
		 
		products = entityManager.createQuery(criteriaQuery).getResultList();	
		entityManager.getTransaction().commit();
		return products;

	}
	
	
	
	
	public void deleteProduct(int productId)
	{
		entityManager.getTransaction().begin();		//DML requires
		Product product = entityManager.find(Product.class, productId);			//finding product with productId
		entityManager.remove(product);			
		entityManager.getTransaction().commit();//detached
	}
	
	
	public void deleteProduct(Product product)
	{
		entityManager.getTransaction().begin();		//DML requires
		//product = entityManager.find(Product.class, product.getProductId());			//finding product with productId
		entityManager.remove(product);
		entityManager.getTransaction().commit();
	}

	public void updateProduct(Product newProduct) {
		entityManager.getTransaction().begin();		//DML requires
		//new 
		Product oldProduct = entityManager.find(Product.class, 
				newProduct.getProductId());			//finding product with productId
		//managed
		oldProduct.setQuantityOnHand(newProduct.getQuantityOnHand());
		oldProduct.setProductName(newProduct.getProductName());
		oldProduct.setPrice(newProduct.getPrice());
		entityManager.getTransaction().commit();
		// detached
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
