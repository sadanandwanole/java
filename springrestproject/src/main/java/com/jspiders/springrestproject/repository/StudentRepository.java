package com.jspiders.springrestproject.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jspiders.springrestproject.pojo.StudentPOJO;

@Repository
public class StudentRepository {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static String jpql;
	private static Query query;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("WEJM4REST");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
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

	public StudentPOJO add(StudentPOJO student) {

		StudentPOJO pojo=new StudentPOJO();
		openConnection();
		transaction.begin();
		manager.persist(pojo);
		transaction.commit();
		closeConnection();
		
		return pojo;
	}

	public StudentPOJO search(int id) {

		openConnection();
		transaction.begin();
		StudentPOJO find = manager.find(StudentPOJO.class, id);
		transaction.commit();
		closeConnection();
		
		return find;
	}

	public StudentPOJO delete(int id) {

		openConnection();
		transaction.begin();
		StudentPOJO find = manager.find(StudentPOJO.class, id);
		manager.remove(find);
		transaction.commit();
		closeConnection();
		return find;
	}

}
