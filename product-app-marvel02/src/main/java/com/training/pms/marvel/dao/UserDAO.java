package com.training.pms.marvel.dao;

import javax.persistence.EntityManager;

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
}
