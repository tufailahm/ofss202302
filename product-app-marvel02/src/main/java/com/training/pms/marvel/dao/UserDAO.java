package com.training.pms.marvel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.training.pms.marvel.model.Product;
import com.training.pms.marvel.model.UserDetails;
import com.training.pms.marvel.utility.EntityManagerUtil;

public class UserDAO {

	EntityManager  entityManager = EntityManagerUtil.getEntityManager();
	public void saveUser(UserDetails userDetails)
	{
		entityManager.getTransaction().begin();		//DML requires transaction
		entityManager.merge(userDetails);				//save the product in db
		entityManager.getTransaction().commit();
	}
	
	public boolean checkValidUser(String username,String password)
	{
		entityManager.getTransaction().begin();		

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<UserDetails> criteriaQuery = criteriaBuilder.createQuery(UserDetails.class);
		Root<UserDetails> root = criteriaQuery.from(UserDetails.class);
		
		Predicate predicate = criteriaBuilder.and(criteriaBuilder.equal(root.get("username"), username),
        								criteriaBuilder.equal(root.get("password"), password)); 
	
		 criteriaQuery.where(predicate);
		 
		List<UserDetails> result = entityManager.createQuery(criteriaQuery).getResultList();	
		
		System.out.println("###result :    "+result);
		entityManager.getTransaction().commit();
		if(result.size() ==0)
			return false;
		else
			return true;
	}
	
}

