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
		<form action="./SubmitDetail.jsp" method="post">

			<table align="center">
				<caption>
					<h1 style="background-color: pink; color: black;">Admin Log In</h1>
					<h3 id="caption">New Admin Please Fill The Details
						Ones....!!!!!!!</h3>

				</caption>
				<tr>
					<td id="id"><b>ID :</b></td>
					<td><input type="text" name="id" placeholder="Please set your id once"></td>
				</tr>
				<tr>
					<td id="name"><b> Name :</b></td>
					<td><input type="text" name="name1"></td>
				</tr>
				<tr>
					<td id="email"><b> E-Mail :</b></td>
					<td><input type="email" name="email1"></td>
				</tr>
				<tr>
					<td id="contact"><b> Contact :</b></td>
					<td><input type="text" name="contact1"></td>
				</tr>

				<tr>
					<td id="username"><b>User Name :</b></td>
					<td><input type="text" name="username1"></td>
				</tr>

				<tr>
					<td id="password"><b> Password :</b></td>
					<td><input type="text" name="password1"></td>
				</tr>

				<tr>
					<td id="password1"><b>Conform Password:</b></td>
					<td><input type="text" name="password2"></td>
				</tr>



				<tr>
					<td></td>
					<td><input type="submit" name="login" value="Submit Detail"
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
	height: 200px;
	width: 350px;
}

#log {
	background-color: blue;
	color: white;
	margin-left: -10px;
	margin-top:20px;
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
	background-color: yellow;
	width: 500px;
	margin: auto;
	margin-top: 150px;
	height: 460px;
}
</style>
</body>
</html>