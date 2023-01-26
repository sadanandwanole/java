package com.jspiders.hibernate3.onetoonehusbandwife.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate3onetoone.HusbandDTO;
import com.jspiders.hibernate3onetoone.WifeDTO;

public class HusbantWifeDAO {
	
	private static EntityManagerFactory factory;
	
	private static EntityManager manager;
	
	private static EntityTransaction transaction;
	
	
	
	public static void main(String[] args) {
		
	factory=Persistence.createEntityManagerFactory("student");
	manager=factory.createEntityManager();
	transaction=manager.getTransaction();
	
	transaction.begin();
	
	WifeDTO dto=new WifeDTO();
	dto.setId(1);
	dto.setContact(90909090l);
	dto.setAge(22);
	dto.setName("Monali");
	
	manager.persist(dto);
	transaction.commit();
	
	
	
	transaction.begin();
	
	HusbandDTO dto2=new HusbandDTO();
	
	dto2.setId(1);
	dto2.setContact(87878787l);
	dto2.setAge(24);
	dto2.setName("mona");
	dto2.setWifeDTO(dto);
	
	manager.persist(dto2);
	transaction.commit();
	
	
		
	}

}
