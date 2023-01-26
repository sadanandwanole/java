<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./Validation.jsp" method="post">
		
		<table align="center">
		<caption> <h1 style="background-color: pink; color: black;"> Admin Log In</h1>
		<h3>Please log in here....!!!</h3>
		
		</caption>
			<tr>
				<td id="username"><b>User Name :</b> </td>
				<td><input type="text" name="username1"></td>
			</tr>

			<tr>
				<td id="password"> <b> Password :</b></td>
				<td><input type="text" name="password1"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" name="login" value="Log In" id="log"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><a href="#"> Forget Password ? </td>
			</tr>
			
			<tr>
				<td></td>
				<td><a href="http://localhost:8080/EmployeeLogIn/Resistration.jsp"><input type="button" name="login" value="Create New Account " id="create"></a></td>
			</tr>
			
		</table>

	</form>
	<style>
	
	body{
	background-image: url("https://cdn.pixabay.com/photo/2022/11/27/12/41/krems-7619682__340.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	backg
	}
	
	table{
	background-color:"DodgerBlue";
	margin: auto;
	margin-top: 200px;
	height: 100px;
	width: 350px;
	
	}
	#log{
	
	background-color: "black";
	color: red;
	margin-left: 40px;
	
	}
	#username{
	color: 
	}
	a{
	color: blue;
	margin-left: 70px;
	font-size: 20px;
	}
	#create{
	margin-top: 60px;
	background-color: yellow;
	color: blue;
	font-size: 25px;
	margin-left: -140px;
	
	}
	
	
	
	
	
	
	
	
</style>

<script >

function dark() {
	body.style.background-color="black";
}

</script>
</body>
</html>