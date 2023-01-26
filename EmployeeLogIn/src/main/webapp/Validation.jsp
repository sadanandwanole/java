<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.lang.ClassNotFoundException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN DATABASE</title>
</head>
<%!static Connection connection;
	static Statement statement;
	static String driver;
	int result;
	 boolean value=true;
	%>


<body>
<a href=""></a>
	<form action="./Home.jsp" method="post">
		<%
		
	PrintWriter writer = response.getWriter();
	String user = request.getParameter("username1");
	String password = request.getParameter("password1");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?", "root", "root");
		statement = connection.createStatement();
		ResultSet set = statement.executeQuery("select * from  admin_detail ");

		while (set.next()) {
			//writer.println(set.getString(5) + "||" + set.getString(6));

			if( user.equals(set.getString(5))  && password.equals(set.getString(6))) {
				
				writer.println("<h1 style='color:red;background-color:yellow; '> WELOCME  "+set.getString(2)+" ......!</h1>");
				writer.println("<h1 id='ok'>You are Succesufully Log In Please click here to Go Home Page :..!</h1>");
				writer.println("<h3> <a href='http://localhost:8080/EmployeeLogIn/Home.jsp'><input type='submit' value='Go To Home Page....!' id='submit'></a></h3>");

			value=false;
			}
	}
		if(value==true ){
				writer.println("<h3 id='error'>Your User Name Or Password Does Not Match.....!! Pease Try Again!</h3>");
		}
		

	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	%>


	</form>
</body>

<style>
#submit {
	background-color: blue;
	color: white;
	height: 40px;
	width: 200px;
	text-align: center;
	margin: auto;
	margin-top: 10px;
	margin-left: 470px;
	border: 1px solid red;
}

#ok {
	color: black;
	margin: auto;
	margin-top: 100px;
	margin-left: 100px;
	background-color: pink;
	width: 1000px;
	text-align: center;
}
body{
background-image: url("https://cdn.pixabay.com/photo/2016/12/03/15/41/fireworks-1880042__340.jpg");
background-repeat: no-repeat;
background-size: cover;
}
#error{
background-color: yellow;
color: red;
width: 700px;
text-align: center;
margin-left: 100px;
}
</style>
</html>