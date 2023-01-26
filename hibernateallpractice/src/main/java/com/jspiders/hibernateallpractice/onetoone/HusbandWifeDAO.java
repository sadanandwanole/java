package com.jspiders.hibernateallpractice.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HusbandWifeDAO {

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
		HusbandDTO4 dto=new HusbandDTO4();
		dto.setId(1);
		dto.setName("jethalal");
		dto.setAge(35);
		manager.persist(dto);
		
		HusbandDTO4 dto1=new HusbandDTO4();
		dto1.setId(2);
		dto1.setName("Ayyer");
		dto1.setAge(30);
		manager.persist(dto1);
		
		
		HusbandDTO4 dto2=new HusbandDTO4();
		dto2.setId(3);
		dto2.setName("TARAK");
		dto2.setAge(25);
		manager.persist(dto2);
		
		
		WifeDTO4 wifeDTO=new WifeDTO4();
		wifeDTO.setId(1);
		wifeDTO.setAge(24);
		wifeDTO.setName("Daya");
		wifeDTO.setHusband(dto1);
		
		manager.persist(wifeDTO);
		
		
	transaction.commit();
	closeConnection();
		
		
	}
}
