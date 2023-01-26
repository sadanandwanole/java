<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>
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
	static String id;
	static String name;
	static String email;
	static String contact;
	static String branch;
	static String city;%>
<body>
<%

PrintWriter writer = response.getWriter();
 String id1 = request.getParameter("student_id");
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?", "root", "root");
	statement = connection.prepareStatement("delete from  student_details where id=? ");
	statement.setString(1, id1);
	int set = statement.executeUpdate();
	writer.println("<h3 id='font'> Student Detail Deleted...!!!!</h3>");
	connection.close();
} catch (ClassNotFoundException e) {
	e.printStackTrace();
} 
catch (SQLException e) {
	// TODO Auto-generated catch block
	writer.println("Please Enter Valid ID........");
}
%>
 <a href="http://localhost:8080/EmployeeLogIn/Home.jsp"> <input type="button" id="btn" value="HOME PAGE" ></a>
<style>
#btn{
color: red;
margin: auto;
margin-top: 20px;
margin-left: 560px;
}
#font{
color: red;
background-color: yellow;
width: 700px;
text-align: center;
margin: auto;
margin-top: 200px;
}
body{
background-image: url("https://cdn.pixabay.com/photo/2021/02/26/01/48/shanghai-6050481__340.jpg");
background-repeat: no-repeat;
background-size: cover;
}
</style>
</body>
</html>