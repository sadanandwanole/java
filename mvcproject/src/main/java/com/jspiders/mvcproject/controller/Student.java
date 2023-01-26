package com.jspiders.mvcproject.controller;

import java.util.List;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.protobuf.Service;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import com.jspiders.mvcproject.pojo.StudentPOJO;
import com.jspiders.mvcproject.services.StudentService;

@Controller
public class Student {

	@Autowired
	private StudentService service;

	@GetMapping("/home")
	public String home() {
		return "Home";

	}

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	@PostMapping("/login")
	public String loginData(HttpServletRequest request, @RequestParam String username, @RequestParam String password, ModelMap map) {
		StudentPOJO student = service.login(username, password);
		if (student != null) {
			HttpSession session = request.getSession();
			session.setAttribute("login", student);
			session.setMaxInactiveInterval(60);
			return "Home";
		}
		map.addAttribute("msg", "Invalid User Or Password.....!!");

		return "Login";
	}

	@GetMapping("/nav")
	public String nawBar() {
		return "NavBar";
	}

	// Add form controller
	@GetMapping("/add")
	public String add(@SessionAttribute(name = "login",required = false) StudentPOJO login, ModelMap map) {
		if (login != null) {
			return "Add";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";
	}

	@PostMapping("/add")
	public String addStudent( @SessionAttribute(name = "login",required = false) StudentPOJO login, 
			@RequestParam String name, @RequestParam String email, @RequestParam long contact,
			@RequestParam String city, @RequestParam String username, @RequestParam String password, ModelMap map) {
		if (login != null) {
			StudentPOJO student = service.add(name, email, contact, city, username, password);
			if (student != null) {
				map.addAttribute("student", student);
				map.addAttribute("msg", "Student Added Succesufully.....!");
			} else {
				map.addAttribute("msg", "Student Not Added Succesufully Please Try Again....!!");
			}
			return "Add";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";
		
	}

	@GetMapping("/search")
	public String search(@SessionAttribute(name = "login",required = false) StudentPOJO login, ModelMap map) {
		if (login != null) {
			return "Search";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";
		
	}

	@PostMapping("/search")
	public String searchData(@SessionAttribute(name = "login",required = false) StudentPOJO login,@RequestParam int id, ModelMap map) {
		if (login != null) {
			StudentPOJO student = service.search(id);
			if (student != null) {
				map.addAttribute("student", student);
				return "Search";
			}
			map.addAttribute("msg", "Student Details Does Not Exists....!!!");

			return "Search";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";

	}

	@GetMapping("/update")
	public String update( @SessionAttribute(name = "login",required = false) StudentPOJO login, ModelMap map) {
		if (login != null) {
			
			List <StudentPOJO> students =service.displayAll();
			map.addAttribute("students", students);
			return "Update";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";

	}
	@PostMapping("/update")
	public String updateData(@SessionAttribute(name = "login",required = false) StudentPOJO login,@RequestParam int id,ModelMap map) {
		if (login != null) {
			StudentPOJO student=service.search(id);
			if (student != null) {
				map.addAttribute("student", student);
//				map.addAttribute("msg", "Details::::");
//				return "Update";
			}
			List <StudentPOJO> students = service.displayAll();
			map.addAttribute("students", students);
			map.addAttribute("msg", "Student Does Not Exists...!!");
			return "Update";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";
		

	}
	@PostMapping("/updateData")
	public String updateData1(@SessionAttribute(name = "login",required = false) StudentPOJO login, @RequestParam int id,@RequestParam String name, @RequestParam String email, @RequestParam long contact, @RequestParam String city,
			@RequestParam String username, @RequestParam String password, ModelMap map) {
	
		if (login != null) {
		
		StudentPOJO student=service.updateData1(id,name,email,contact,city,username,password);
//		StudentPOJO student=service.update(id);
		
		if (student != null) {
//			map.addAttribute("student", student);
			map.addAttribute("msg", "Student Detail Updated Succesufully....!!");
			List<StudentPOJO> students = service.displayAll();
			map.addAttribute("students",students);
			
			
			return "Update";
			
		}
		List<StudentPOJO> students=service.displayAll();
		map.addAttribute("students",students);
		map.addAttribute("msg", "Student Detail Does Not Updated....!");
		return "Update";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";

	}
	

	@GetMapping("/remove")
	public String remove(@SessionAttribute(name = "login",required = false) StudentPOJO login, ModelMap map) {
		if (login != null) {
			
			List <StudentPOJO> student =service.displayAll();
			map.addAttribute("students", student);
			return "Remove";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";

	}
	@PostMapping("/remove")
	public String removeData( @SessionAttribute(name = "login",required = false) StudentPOJO login,@RequestParam int id,ModelMap map) {
		
		if (login != null) {
			StudentPOJO student =service.remove(id);
			if (student != null) {
				List<StudentPOJO> students=service.displayAll();
				map.addAttribute("students",students);
				map.addAttribute("msg","student Removed Successfully.....!!!");
				return "Remove";
			}
			List<StudentPOJO> students=service.displayAll();
			map.addAttribute("students",students);
			map.addAttribute("msg","Student Data Does not Exist.....!!!");
			return "Remove";
		}
		map.addAttribute("msg", "Login To Proceed....!");
		return "Login";

	}

	@GetMapping("/logout")
	public String logOut(HttpSession session,ModelMap map ) {
		session.invalidate();
		map.addAttribute("msg", "Logged out successfully......!");
		
		return "Login";
	}
}
