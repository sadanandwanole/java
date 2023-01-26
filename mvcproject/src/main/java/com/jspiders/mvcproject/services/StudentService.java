package com.jspiders.mvcproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.mvcproject.pojo.StudentPOJO;
import com.jspiders.mvcproject.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public StudentPOJO add(String name, String email, long contact, String city, String username, String password) {

		StudentPOJO student = repository.add(name, email, contact, city, username, password);

		return student;

	}

	public StudentPOJO login(String username, String password) {

		StudentPOJO student = repository.login(username, password);

		return student;
	}

	public StudentPOJO search(int id) {

		StudentPOJO student = repository.search(id);
		return student;
	}

	public List <StudentPOJO> displayAll() {
		List<StudentPOJO> students =repository.displayAll();
		
		return students ;

	}

	public StudentPOJO remove(int id) {

		StudentPOJO student=repository.remove(id);
		
		return student;
	}

	public StudentPOJO update(int id) {

	 StudentPOJO students=repository.update(id);
		return students;
	}

	public StudentPOJO updateData1(int id, String name, String email, long contact, String city, String username,
			String password) {
		StudentPOJO student=repository.updateData1(id,name,email,contact,city,username,password);
		return student;
	}

}
