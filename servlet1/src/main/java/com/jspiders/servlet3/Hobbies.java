package com.jspiders.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hobbies")
public class Hobbies extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Hobbies() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String[] values = request.getParameterValues("hoby");
		writer.println("<h1> Your Hobbeis Are :</h1>");

		for (String string : values) {

			writer.println("<h1>" + string + "</h1><br>");

		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
