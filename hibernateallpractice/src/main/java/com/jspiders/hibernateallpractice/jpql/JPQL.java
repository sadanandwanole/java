package com.jspiders.hibernateallpractice.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jspiders.hibernateallpractice.onetoone.WifeDTO4;

public class JPQL {
	private static EntityManagerFactory factory;

	private static EntityManager manager;

	private static EntityTransaction transaction;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("AllPractice");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

	}

	public static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}

	}

	public static void main(String[] args) {
		openConnection();
		transaction.begin();
		
		String jpql="from wifedto4";
		Query query=manager.createQuery(jpql);
		
		List <WifeDTO4>resultList = query.getResultList();
		
		for (WifeDTO4 object : resultList) {
			System.out.println(object);
			
		}

	}
}
