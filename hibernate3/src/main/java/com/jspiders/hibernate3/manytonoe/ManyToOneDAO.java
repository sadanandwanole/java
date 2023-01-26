package com.jspiders.hibernate3.manytonoe;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToOneDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void openConnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("student");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
	}
	
	public static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
		
		
	}
	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();
		
		
		
		
		ManyDTO manyDTO=new ManyDTO();
		manyDTO.setId(1);
		manyDTO.setName("naman");
		manyDTO.setSallary(22000);
		manyDTO.setCity("Nanded");
		entityManager.persist(manyDTO);
		
		ManyDTO manyDTO1=new ManyDTO();
		manyDTO1.setId(2);
		manyDTO1.setName("chiku");
		manyDTO1.setSallary(20000);
		manyDTO1.setCity("Nanded");
		entityManager.persist(manyDTO1);
		
		ManyDTO manyDTO2=new ManyDTO();
		manyDTO2.setId(3);
		manyDTO2.setName("rakhi");
		manyDTO2.setSallary(200000);
		manyDTO2.setCity("vardha");
		entityManager.persist(manyDTO2);
		
		List<ManyDTO> asList = Arrays.asList(manyDTO,manyDTO1,manyDTO2);
		
		
		OneDTO oneDTO=new OneDTO();
		oneDTO.setId(1);
		oneDTO.setName("Capgimini.");
		oneDTO.setCity("pune");
		oneDTO.setDtos(asList);
		entityManager.persist(oneDTO);
		
		entityTransaction.commit();
		closeConnection();
		
		
		
		
		
	}

}
