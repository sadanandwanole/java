package com.jspiders.hibernateallpractice.cteatetable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TableDAO {
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("AllPractice");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
//		TableDTO dto=new TableDTO();
//		dto.setId(1);
//		dto.setName("sadanad");
//		dto.setContact(9090909090l);
//		dto.setCity("pune");
//		manager.persist(dto);
		
		
//		TableDTO dto=new TableDTO();
//		dto.setId(2);
//		dto.setName("mohini");
//		dto.setContact(808080808l);
//		dto.setCity("Nanded");
//		manager.persist(dto);
//		
//		
//		TableDTO dto1=new TableDTO();
//		dto1.setId(3);
//		dto1.setName("Rakhi");
//		dto1.setContact(1234567890l);
//		dto1.setCity("Amravati");
//		manager.persist(dto1);
//		transaction.commit();
		
		
		//Delete
		
//		TableDTO find = manager.find(TableDTO.class, 1);
//		manager.remove(find);
		
		//update
		
		TableDTO find=manager.find(TableDTO.class, 2);
		find.setName("sadanand");
		
		transaction.commit();
		
		//clos connection
		
		factory.close();
		manager.close();
//		transaction.rollback();
	}

}
