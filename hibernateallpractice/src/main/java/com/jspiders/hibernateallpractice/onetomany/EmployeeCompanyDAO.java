package com.jspiders.hibernateallpractice.onetomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeCompanyDAO {
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
		EmployeeDTO4 emp1=new EmployeeDTO4();
		emp1.setId(1);
		emp1.setName("sada");
		emp1.setSallary(50000);
		manager.persist(emp1);
		
		EmployeeDTO4 emp2=new EmployeeDTO4();
		emp2.setId(2);
		emp2.setName("rakhi");
		emp2.setSallary(40000);
		manager.persist(emp2);
		
		EmployeeDTO4 emp3=new EmployeeDTO4();
		emp3.setId(3);
		emp3.setName("jadu");
		emp3.setSallary(30000);
		manager.persist(emp3);
		
		List<EmployeeDTO4> list = Arrays.asList(emp1,emp2,emp3);
		
		CompanyDTO4 company =new CompanyDTO4();
		company.setId(1);
		company.setName("WIPRO");
		company.setCity("Pune");
		company.setEmployee(list);
		manager.persist(company);
		
	transaction.commit();
	closeConnection();
		
		

	}
}
