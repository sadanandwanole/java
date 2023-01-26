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
	static String name1;
	static String email1;
	static String contact1;
	static String branch1;
	static String city1;%>
<body>
<%


PrintWriter writer = response.getWriter();
String id1 = request.getParameter("id");
name1 = request.getParameter("name");
email1 = request.getParameter("email");
contact1 = request.getParameter("contact");
branch1 = request.getParameter("branch");
city1 = request.getParameter("city");


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
writer.println("<h3 id='add3'>Student Details updated.....</h3>");
	
	result = statement.executeUpdate();
} catch (Exception e) {
	out.println(e);
}


%>
<a href="http://localhost:8080/EmployeeLogIn/Home.jsp"> <input type="button" id="btn" value="HOME PAGE" ></a>

</body>



<style>
#btn{
color: red;
margin: auto;
margin-top: 20px;
margin-left: 560px;
}
#add3{
background-color: yellow;
color: red;
text-align: center;
margin: auto;
margin-top: 10px;


}
</style>
</html>