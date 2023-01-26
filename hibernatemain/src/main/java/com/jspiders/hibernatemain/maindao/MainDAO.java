package com.jspiders.hibernatemain.maindao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernatemain.maindto.MainDTO;

public class MainDAO {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		MainDTO dto=new MainDTO();
		
		dto.setId(1);
		dto.setName("RAKHI");
		dto.setSallary(1909090l);
		dto.setCity("Pune");
		
		entityManager.persist(dto);
		entityTransaction.commit();
		
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
