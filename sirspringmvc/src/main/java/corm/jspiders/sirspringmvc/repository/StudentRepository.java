package corm.jspiders.sirspringmvc.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	private static EntityManagerFactory factory;
	
	private static EntityManager manager;
	private static EntityTransaction transaction;	
	private static String jpql;
	private static Query query;
	public static void openConnection() {
		
		factory=Persistence.createEntityManagerFactory("WEJM4MVC");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	
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
	

}
