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
	static String id1;
	static String name1;
	static String email1;
	static String contact1;
	static String branch1;
	static String city1;%>

%>
<body>
		<div id="">
		<form action="./UpdateDirectOperation.jsp" method="post">

			<table align="center" id="table">
				<caption>
					<h1 style="background-color: pink; color: black;">Student Details.....!</h1>
					<h3 id="caption">Please Enter The Student Details....!</h3>

				</caption>
				<tr>
					<td id="id"><b>Student Roll_No. :</b></td>
					<td><input type="text" name="id"
						placeholder="Please set your id once"></td>
				</tr>
				<tr>
					<td id="name"><b>Student Name :</b></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td id="email"><b>Student E-Mail :</b></td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td id="contact"><b> Student Contact :</b></td>
					<td><input type="text" name="contact"></td>
				</tr>

				<tr>
					<td id="username"><b>Branch :</b></td>
					<td><input type="text" name="branch"></td>
				</tr>

				<tr>
					<td id="password"><b> City :</b></td>
					<td><input type="text" name="city"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" name="login" value="ADD INFO..!"
						id="log"></td>
				</tr>



			</table>

		</form>
	</div>
	
</body>

<style>
body {
	background-image:
		url("https://cdn.pixabay.com/photo/2022/11/27/12/41/krems-7619682__340.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	backg
}

#parent {
	display: inline-flex;
	margin-left: 600px;
	height: 40px;
	width: 500px;
	align-items: center;
}

button {
	height: 10px;
	width: 60px;
}

#parent1 {
	background-color: red;
	border: 1px solid black;
	height: 55px;
	align-content: center;
	align-items: center;
	align-self: center;
}

#out, #remo, #ho, #sea, #ad, #up {
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

body {
	background-image:
		url("https://cdn.pixabay.com/photo/2022/11/27/12/41/krems-7619682__340.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}

table {
	background-color: "DodgerBlue";
	margin: auto;
	margin-top: 100px;
	height: 250px;
	width: 350px;
	color: red;
}

#log {
	background-color: blue;
	color: white;
	margin-left: -10px;
	margin-top: 20px;
	font-size: 20px;
}
form {
	font-size: 20px;
	color: black;
	background-color:rgb(180,180,180);
	width: 380px;
	margin: auto;
	margin-top: 150px;
	height: 460px;
	
}


</style>
</html>