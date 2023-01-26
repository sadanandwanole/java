<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<% String msg= (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log IN</title>
</head>
<body>
	<fieldset>
		<legend>:::Student Details::</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>UserName :</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Log In"></td>
				</tr>

			</table>


		</form>

	</fieldset>
	<%
	if(msg != null){%>
		<h2 align="center">
		<%=msg %>
		</h2>
	<% }%>
</body>
</html>