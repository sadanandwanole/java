package com.jspiders.springrestproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springrestproject.pojo.StudentPOJO;
import com.jspiders.springrestproject.response.StudentResponse;
import com.jspiders.springrestproject.service.StudentService;

@RestController
public class StudentController {
//	@Autowired
//	private StudentService service;
//
//	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, 
//								produces = MediaType.APPLICATION_JSON_VALUE
//
//	)
//	public ResponseEntity<StudentResponse> addStudent(@RequestBody StudentPOJO student) {
//		StudentPOJO pojo = service.add(student);
////		StudentResponse response=new StudentResponse();
//		if (pojo != null) {
//			// status success
//			return new ResponseEntity<StudentResponse>(
//					new StudentResponse("ok", "Studend added succesfully...!", pojo, null), HttpStatus.OK);
////			response.setStatus("suceess");
////			response.setDescription("Student data added successfully.....!");
////			response.setData(pojo);
//		}
//		// failure
////		response.setStatus("failure..");
////		response.setDescription("Student data not added....!!!");
//
//		return new ResponseEntity<StudentResponse>(new StudentResponse("failure", "Studend not added...!", null, null),
//				HttpStatus.BAD_REQUEST);
//
//	}
//	@GetMapping(path = "/search{id}", 
//			consumes = MediaType.APPLICATION_JSON_VALUE, 
//			produces = MediaType.APPLICATION_JSON_VALUE )
//	public ResponseEntity<StudentResponse> addStudent(@PathVariable int id) {
//		StudentPOJO pojo = service.search(id);
//		if (pojo != null) {
//			// status success
//			return new ResponseEntity<StudentResponse>(
//					new StudentResponse("ok", "Studend added succesfully...!", pojo, null), HttpStatus.OK);
////			response.setStatus("suceess");
////			response.setDescription("Student data added successfully.....!");
////			response.setData(pojo);
//		}
//		// failure
////		response.setStatus("failure..");
////		response.setDescription("Student data not added....!!!");
//
//		return new ResponseEntity<StudentResponse>(new StudentResponse("failure", "Studend not added...!", null, null),
//				HttpStatus.BAD_REQUEST);
//	}

	@Autowired
	private StudentService service;
	
	@PostMapping(path = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> addStudent
				(@RequestBody StudentPOJO student) {
		StudentPOJO pojo = service.add(student);
		if (pojo != null) {
			//success
			return new ResponseEntity<StudentResponse>
			(new StudentResponse("SUCCESS", "Student added successfully",
					pojo, null), HttpStatus.OK);
		}
		//failure
		return new ResponseEntity<StudentResponse>
		(new StudentResponse("FAILURE", "Student not added",
				null, null), HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(path = "/search{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> search(@PathVariable int id) {
		StudentPOJO student = service.search(id);
		if (student != null) {
			//success
			return new ResponseEntity<StudentResponse>
						(new StudentResponse
						("FOUND", "Student data found successfully..!!",
						student, null), HttpStatus.OK);
		}
		//failure
		return new ResponseEntity<StudentResponse>
		(new StudentResponse
		("NOT FOUND", "Student data not found..!!",
		null, null), HttpStatus.BAD_REQUEST);
	}
	//delete
	@DeleteMapping(path = "/delete",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<StudentResponse> delete(@PathVariable int id) {
		StudentPOJO student = service.remove(id);
		if (student == null) {
			//success
			return new ResponseEntity<StudentResponse>
						(new StudentResponse
						("FOUND", "Student data deleted successfully..!!",
						student, null), HttpStatus.OK);
		}
		//failure
		return new ResponseEntity<StudentResponse>
		(new StudentResponse
		("NOT FOUND", "Student data not found..!!",
		null, null), HttpStatus.BAD_REQUEST);
	}
	
	
		
			
}
