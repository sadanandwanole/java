<%@page import="java.sql.SQLException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%!static Connection connection;
	static PreparedStatement statement;
	static String driver;
	int result;
	static boolean value = true;
	static String id1;
	static String name1;
	static String email1;
	static String contact1;
	static String branch1;
	static String city1;%>
<body>
	<%
	PrintWriter writer = response.getWriter();
    id1 = request.getParameter("id1");
	name1 = request.getParameter("name1");
	email1 = request.getParameter("email1");
	contact1 = request.getParameter("contact1");
	branch1 = request.getParameter("branch1");
	city1 = request.getParameter("city1");
	

	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?", "root", "root");
		statement = connection.prepareStatement("update student_details set name=?,email=?,contact=?,branch=?,city=? where id=?");
		
		statement.setString(1, name1);
		statement.setString(2, email1);
		statement.setString(3, contact1);
		statement.setString(4, branch1);
		statement.setString(5, city1);
		statement.setString(6, id1);

		
		result = statement.executeUpdate();
		
		
		
		writer.println("<table border=1px solid id='table1'> <caption> Update Details </caption>	<tr> <tr><td>"
		+ "ID OF STUDENT :" + "<input type='text' value=" + id1 + " " + "</td></tr>" + "<tr><td>"
		+ "NAME OF STUDENT :" + "<input type='text' value=" + name1 + " " + "</td></tr>" + "<tr><td>"
		+ "EMAIL OF STUDENT :" + "<input type='text' value=" + email1 + " " + "</td></tr>" + "<tr><td>"
		+ "CONTACT OF STUDENT :" + "<input type='text' value=" + contact1 + " " + "</td></tr>" + "<tr><td>"
		+ "BRANCH OF STUDENT :" + "<input type='text' value=" + branch1 + " " + "</td></tr>" + "<tr><td>"
		+ "CITY OF STUDENT :" + "<input type='text' value=" + city1 + " " + "</td></tr>" + "</tr>" + "<tr><td>"
	    + "</td></tr>" + "</table>");

		
		writer.println("Student Details Update Succesfully...!!!" + result);

	} catch (Exception e) {
		out.println(e);
	}
	%>
	<%= id1 %>
	<%= name1 %>
	<%= email1 %>
	<%= contact1 %>
	<%= city1 %>
	<%= branch1 %>

</body>
</html>