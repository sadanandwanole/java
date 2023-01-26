package com.jspiders.hibernate3.manytonoe;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToManyDAO {
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
		
		
		ManyDTO manyDTO1=new ManyDTO();
		manyDTO1.setId(2);
		manyDTO1.setName("chiku");
		manyDTO1.setSallary(20000);
		manyDTO1.setCity("Nanded");
		
		ManyDTO manyDTO2=new ManyDTO();
		manyDTO2.setId(3);
		manyDTO2.setName("rakhi");
		manyDTO2.setSallary(200000);
		manyDTO2.setCity("vardha");
		
		List<ManyDTO> asList = Arrays.asList(manyDTO,manyDTO1,manyDTO2);
		
		OneDTO oneDTO=new OneDTO();
		oneDTO.setId(1);
		oneDTO.setName("Capgimini.");
		oneDTO.setCity("pune");
		oneDTO.setDtos(asList);
		entityManager.persist(oneDTO);
		
		OneDTO oneDTO1=new OneDTO();
		oneDTO1.setId(2);
		oneDTO1.setName("Wipro");
		oneDTO1.setCity("Nagpur");
		oneDTO1.setDtos(asList);
		entityManager.persist(oneDTO1);
		
		OneDTO oneDTO3=new OneDTO();
		oneDTO3.setId(3);
		oneDTO3.setName("HCL");
		oneDTO3.setCity("Nashik");
		oneDTO3.setDtos(asList);
		entityManager.persist(oneDTO3);
		
		List<OneDTO> asList2 = Arrays.asList(oneDTO,oneDTO1,oneDTO3);
		
		manyDTO.setOnedtos(asList2);
		manyDTO1.setOnedtos(asList2);
		manyDTO2.setOnedtos(asList2);
		entityManager.persist(manyDTO);
		entityManager.persist(manyDTO1);
		entityManager.persist(manyDTO2);
		
		entityTransaction.commit();
		closeConnection();
		
		
		
		
		
	}


}
