package corm.jspiders.sirspringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import corm.jspiders.sirspringmvc.pojo.StudentPOJO;

@Controller
public class Student {
	@Autowired
	private Service service;
	
	@GetMapping("home")
	public String home() {
		return "Home";
	}
	
}
