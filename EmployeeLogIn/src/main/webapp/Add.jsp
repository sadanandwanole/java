<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="">
		<form action="./AddOperation.jsp" method="post">

			<table align="center">
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
	<style>
body {
	background-image:
		url("https://cdn.pixabay.com/photo/2022/11/27/12/41/krems-7619682__340.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	backg
}

table {
	background-color: "DodgerBlue";
	margin: auto;
	margin-top: 100px;
	height: 250px;
	width: 350px;
}

#log {
	background-color: blue;
	color: white;
	margin-left: -10px;
	margin-top: 20px;
	font-size: 20px;
}

#username {
	color:
}

#caption {
	color: black;
}

a {
	color: blue;
	margin-left: 70px;
}

#create {
	margin-top: 60px;
	background-color: MediumSeaGreen;
	color: blue;
	font-size: 25px;
	margin-left: -60px;
}

form {
	font-size: 20px;
	color: red;
	background-color:aqua;
	width: 500px;
	margin: auto;
	margin-top: 150px;
	height: 460px;
	
}
</style>

</body>
</html>