package com.jspiders.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Student() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		String query = request.getParameter("query");
		
		writer.println(""
				
				+ "<h1> NAME OF STUDENT : "+name +"</h1><br>"+
				"<h1> EMAIL OF STUDENT : "+email +"</h1><br>"+
				"<h1> Contact OF STUDENT : "+contact +"</h1><br>"+
				"<h1> CITY OF STUDENT : "+city +"</h1><br>"+
				"<h1> Query OF STUDENT : "+query +"</h1><br>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
