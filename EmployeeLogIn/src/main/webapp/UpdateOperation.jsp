<%@page import="java.sql.ResultSet"%>
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
	String id = request.getParameter("student_id");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm4?", "root", "root");
		statement = connection.prepareStatement("select * from  student_details where id=? ");
		statement.setString(1, id);
		ResultSet set = statement.executeQuery();
		writer.println("<h3 id=font> Details Of Student...!!!!</h3>");

		while (set.next()) {
			id = set.getString(1);
			name = set.getString(2);
			email = set.getString(3);
			contact = set.getString(4);
			branch = set.getString(5);
			city = set.getString(6);
			//writer.println("<table border=1px solid > <tr><td>" + "<h3>STUDENT ID </h3></td><td><h3>" + set.getString(1)
			//+ "</h3></td></tr>" + "<tr><th>" + "<h3> STUDENT NAME </h3></th><td><h3>" + set.getString(2)
			//+ "</h3></td></tr>" + "<tr><th>" + "<h3>STUDENT Email </h3></th><td><h3>" + set.getString(3)
			//+ "</h3></td></tr>" + "<tr><th>" + "<h3> STUDENT Contact </h3></th><td><h3>" + set.getString(4)
			//+ "</h3></td></tr>" + "<tr><th>" + "<h3> STUDENT Branch </h3></th><td><h3>" + set.getString(5)
			//+ "</h3></td></tr>" + "<tr><th>" + "<h3> STUDENT City </h3></th>><td><h3>" + set.getString(6)
			//+ "</h3></td></tr></table>");

		}
	} catch (Exception e) {
		out.println(e);

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
      <style>
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
</style>
	<form action="./UpdateDirectOperation.jsp" method="post">

		<table align="center" id="table">
			<caption>
				<h1 style="background-color: pink; color: black;">Student
					Details.....!</h1>
				<h3 id="caption">Please Enter The Update Records ....!</h3>

			</caption>
			<tr>
				<td id="id"><b>Student Roll_No. :</b></td>
				<td><input type="text" name="id" value="<%=id%>"
					placeholder="Please set your id once"></td>
			</tr>
			<tr>
				<td id="name"><b>Student Name :</b></td>
				<td><input type="text" name="name" value="<%=name%>"></td>
			</tr>
			<tr>
				<td id="email"><b>Student E-Mail :</b></td>
				<td><input type="email" name="email" value="<%=email%>"></td>
			</tr>
			<tr>
				<td id="contact"><b> Student Contact :</b></td>
				<td><input type="text" name="contact" value="<%=contact%>"></td>
			</tr>

			<tr>
				<td id="username"><b>Branch :</b></td>
				<td><input type="text" name="branch" value="<%=branch%>"></td>
			</tr>

			<tr>
				<td id="password"><b> City :</b></td>
				<td><input type="text" name="city" value="<%=city%>"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" name="login" id="login"  value="UPDATE...!"
					id="log"></td>
			</tr>



		</table>

	</form>


	</form>

</body>

<style>
#table {
	margin: auto;
	margin-top: 100px;
	color: red;
}
#login{
background-color:blue;
border: 2px solid rgb(220,90,200);
}
body{
background-image: url("https://cdn.pixabay.com/photo/2021/02/26/01/48/shanghai-6050481__340.jpg");
background-repeat: no-repeat;
background-size: cover;
}
</style>
</html>