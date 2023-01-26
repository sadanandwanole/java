package com.jspiders.sirservletproject.class1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoPostMethod extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1> hello world </h1>");
		writer.println("<h1> what is the ......</h1>");
	
	}

}
