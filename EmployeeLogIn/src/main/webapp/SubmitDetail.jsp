<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN DETAILS</title>
</head>
<body>
	<%!Connection connection;
	PreparedStatement statement;
	int result;%>
	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name1");
	String email = request.getParameter("email1");
	String contact = request.getParameter("contact1");
	String username1 = request.getParameter("username1");
	String password1 = request.getParameter("password1");
	String password2 = request.getParameter("password2");

	PrintWriter writer = response.getWriter();

	if (password1.equals(password2))
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?", "root", "root");
			statement = connection.prepareStatement("insert into admin_detail values(?,?,?,?,?,?,?)");
			statement.setString(1, id);
			statement.setString(2, name);
			statement.setString(3, email);
			statement.setString(4, contact);
			statement.setString(5, username1);
			statement.setString(6, password1);
			statement.setString(7, password2);

			result = statement.executeUpdate();
			writer.println("Record Added Successfully........!");
			writer.println("click here to Go log in page....");
			

		} catch (Exception e) {
			out.println(e);

		}
	else {

		writer.println("Password Does Not Match...!!! Please Try Again.....");
	}
	%>
<a href="http://localhost:8080/EmployeeLogIn/AdminLogIn.jsp"> <input type="button" value="Log In Page"></a>
</body>
</html>