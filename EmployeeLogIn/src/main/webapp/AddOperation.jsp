<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%!static Connection connection;
	static PreparedStatement statement;
	static String driver;
	int result;
    boolean value = true;
	String id;
	String name;
	String email;
	String contact;
	String branch;
	String city;
	%>

<meta charset="ISO-8859-1">
<title>Adding Details</title>
</head>
<body>
<div id=parent1>
		<div id="parent">
			<div id="home">
				<a href="http://localhost:8080/EmployeeLogIn/Home.jsp"> <input
					type="button" value="HOME" name="home" id="ho">
				</a>
			</div>
			<div id="search">
				<a href="http://localhost:8080/EmployeeLogIn/Search.jsp"> <input
					type="button" value="Search" name="search" id="sea">
				</a>

			</div>
			<div id="add">
				<a href="http://localhost:8080/EmployeeLogIn/AddDetail.jsp"> <input
					type="button" value="ADD" name="add" id="ad">
				</a>
			</div>
			<div id="update">
			<a href="http://localhost:8080/EmployeeLogIn/Update.jsp">
				<input type="button" value="Update" name="update" id="up">
				</a>
			</div>
			<div id="remove">
				<a href="http://localhost:8080/EmployeeLogIn/Delete.jsp"> <input
					type="button" value="Remove" name="remove" id="remo">
				</a>
			</div>
			<div id="logout">
				<a href="http://localhost:8080/EmployeeLogIn/AdminLogIn.jsp"> <input
					type="button" value="LOG OUT" name="logout" id="out">
				</a>

			</div>


		</div>
	</div>
	<style>
body {
	background-image:url("https://cdn.pixabay.com/photo/2022/11/27/12/41/krems-7619682__340.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	backg
}
#parent{
display: inline-flex;
margin-left: 400px;
height: 40px;
width: 500px;
align-items: center;
}
button{
height: 10px;
width: 60px;

}
#parent1{
background-color: red;
border: 1px solid black;
height: 55px;
align-content: center;
align-items: center;
align-self: center;

}

#out,#remo,#ho,#sea,#ad,#up{
height: 40px;
width: 100px;
background-color: red;
color: white;
text-decoration: none;
outline: none;
font-style: bold;
border: 2px solid yellow;
font-size: 15px;
margin-top: 15px;



}
</style>
	<%
	PrintWriter writer = response.getWriter();
 id = request.getParameter("id");
 name = request.getParameter("name");
 email = request.getParameter("email");
 contact = request.getParameter("contact");
 branch = request.getParameter("branch");
 city = request.getParameter("city");
	if(id.equals(" ")){
		writer.println("Please Enter Valid Id.....");
	}
	else{
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?", "root", "root");
			statement = connection.prepareStatement("insert into student_details values(?,?,?,?,?,?)");
			statement.setString(1, id);
			statement.setString(2, name);
			statement.setString(3, email);
			statement.setString(4, contact);
			statement.setString(5, branch);
			statement.setString(6, city);

			result = statement.executeUpdate();
			writer.println("<h3 id='add2'>Student Detail Added Successful.........!!!</h3>");
			

		} catch (Exception e) {
			out.println("<h1 id='error'>The Given Id Is Already Present........please try Another Id.....</h1>");
		}
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
            <td ><%=id %></td>
            <td ><%=name %></td>
            <td ><%=email %></td>
            <td ><%=contact %></td>
            <td ><%=branch %></td>
            <td ><%=city %></td>
            
          </tr>
        </tbody>
      </table>

</body>


<style>
#add2{
background-color: yellow;
color: blue;
text-align: center;
margin: auto;
margin-top: 20px;

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
#h1{
color: red;
margin: auto;
margin-top: 50px;
margin-left: 90px;

}
body{
background-image: url("https://cdn.pixabay.com/photo/2021/02/26/01/48/shanghai-6050481__340.jpg");
background-repeat: no-repeat;
background-size: cover;
}
#error{
background-color: lime;
color: red;
margin: auto;
margin-left: 100px;
margin-top: 40px;
text-align: center;

}
</style>

</html>