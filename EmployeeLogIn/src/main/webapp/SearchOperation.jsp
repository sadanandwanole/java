<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Statement"%>
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
	String id1;
	String name;
	String email;
	String contact;
	String branch;
	String city;
	static boolean value = true;%>
<body>
	<%
	PrintWriter writer = response.getWriter();
		String id = request.getParameter("student_id");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?", "root", "root");
			statement = connection.prepareStatement("select * from  student_details where id=? ");
			statement.setString(1, id);
			ResultSet set = statement.executeQuery();
			writer.println("<h3 id='font'> Details Of Student which You Are Select The Id...!!!!</h3>");
			
			while (set.next()) {
				
				id1 = set.getString(1);
				name = set.getString(2);
				email = set.getString(3);
				contact = set.getString(4);
				branch = set.getString(5);
				city = set.getString(6);
				}
				
				
		//writer.println("<table border=1px solid > <tr><td>" + "<h3>STUDENT ID </h3></td><td><h3>" + set.getString(1)
			//	+ "</h3></td></tr>" + "<tr><th>" + "<h3> STUDENT NAME </h3></th><td><h3>" + set.getString(2)
				//+ "</h3></td></tr>" + "<tr><th>" + "<h3>STUDENT Email </h3></th><td><h3>" + set.getString(3)
				//+ "</h3></td></tr>" + "<tr><th>" + "<h3> STUDENT Contact </h3></th><td><h3>" + set.getString(4)
				//+ "</h3></td></tr>" + "<tr><th>" + "<h3> STUDENT Branch </h3></th><td><h3>" + set.getString(5)
				//+ "</h3></td></tr>" + "<tr><th>" + "<h3> STUDENT City </h3></th>><td><h3>" + set.getString(6)
				//+ "</h3></td></tr></table>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			writer.println("Please Enter Valid ID........");
		}
	%>
	<table class="table" border="1px solid">
        <thead>
          <tr>
            <th >ID</th>
            <th >NAME</th>
            <th >Email</th>
            <th >CONTACT</th>
            <th >BRANCH</th>
            <th >CITY</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td ><%=id1 %></td>
            <td ><%=name %></td>
            <td ><%=email %></td>
            <td ><%=contact %></td>
            <td ><%=branch %></td>
            <td ><%=city %></td>
            
          </tr>
        </tbody>
      </table>
      <a href="http://localhost:8080/EmployeeLogIn/Home.jsp"> <input type="button" id="btn" value="HOME PAGE" ></a>
</body>
<style>
#btn{
color: red;
margin: auto;
margin-top: 20px;
margin-left: 560px;
}
.table{
    background-color:aqua;
    border: 1px solid black;
    height: 50px;
    width: 900px;
    text-align: center;
    margin: auto;
    margin-top: 70px;
}
th{
    background-color: blue;
}
</body>

<style>
#btn{
background-color: blue;
color: red;
margin: auto;
margin-top: 200px;
}
#font{
color: red;
margin: auto;
align-self: center; 
margin-left: 600px;
}
table{
margin: auto;
align-self: center;
align-content: center;
background-color: orange;
}
#font{
background-color: yellow;
color: red;
text-align: center;
margin: auto;
margin-left: 200px;
margin-top: 50px;

}
body{
background-image: url("https://cdn.pixabay.com/photo/2022/12/17/15/20/ice-cream-7661889__340.jpg");
background-repeat: no-repeat;
background-size: cover;
height: 350px;
width: 1100px;
}
</style>
</html>