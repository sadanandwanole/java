package com.jspiders.springrestproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springrestproject.pojo.StudentPOJO;
import com.jspiders.springrestproject.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public StudentPOJO add(StudentPOJO student) {

		StudentPOJO pojo = repository.add(student);

		return pojo;
	}

	public StudentPOJO search(int id) {
		// TODO Auto-generated method stub
		StudentPOJO student = repository.search(id);
		return student;
	}

	public StudentPOJO remove(int id) {
		StudentPOJO pojo = repository.delete(id);

		return pojo;
	}

}
