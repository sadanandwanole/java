<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
		<div id="">
		<form action="./AddOperation.jsp" method="post">

			<table align="center" id="table">
				<caption>
					<h1 style="background-color: pink; color: black;">Student Details.....!</h1>
					<h3 id="caption" style="background-color:yellow; color: red;">Please Enter The Student Details....!</h3>

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
	margin-left: 400px;
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
	background-color:pink;
	margin: auto;
	margin-top: 100px;
	height: 250px;
	width: 350px;
	color: black;
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
	background-color:gray);
	width: 380px;
	margin: auto;
	margin-top: 150px;
	height: 460px;
	
}


</style>
</html>