<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
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
</style>
<body>
	<div id=parent1>
		<div id="parent">
			<div id="home">
				<a href="http://localhost:8080/EmployeeLogIn/Home.jsp">
		<input type="button" value="HOME" name="home" id="ho">
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
	<form action="./DeleteOperation.jsp" method="post">

		<table>
			<caption>
				<b> Please Enter Student Id Which Record You Want To
					Delete....!!</b>
			</caption>
			<div>
				<tr>
					<td><h3 id="text">Please Enter Student Id :</h3></td>
					<td><input type="text" name=student_id id="sid"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="button" value="Delete Record..." id="sub">
					</td>
				</tr>
		</table>

	</form>
</body>
<style>
caption {
	margin: auto;
	margin-left: 200px;
	background-color: threedhighlight;
	margin-top: 50px;
	
}

form {
	align-self: center;
	margin: auto;
	margin-top: 40px;
	margin-left: 370px;
}

#text {
	margin: auto;
	margin-left: 200px;
	background-color: gray;
}

#sub {
	margin: auto;
	margin-left: 50pxx;
	background-color: blue;
	color: white;
}

#sid {
	margin: auto;
	color: red;
}
caption {
	background-color: red;
	color: white;
}
</style>
</html>