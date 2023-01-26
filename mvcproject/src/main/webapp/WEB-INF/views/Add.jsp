<%@page import="com.jspiders.mvcproject.pojo.StudentPOJO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:include page="NavBar.jsp"></jsp:include>
	<% StudentPOJO student=(StudentPOJO)request.getAttribute("student"); 
	String msg=(String)request.getAttribute("msg");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<form action="./add" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td> <input type="text" name="name"> </td>
			</tr>
			<tr>
				<td>E-Mail :</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Contact :</td>
				<td><input type="text" name="contact"></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Username :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td> <input type="submit" value="Submit"> </td>
			</tr>


		</table>

	</form>
	<%
	if(msg != null){
	%>
	<h3 align="center">
	<%=msg %>
	</h3>
	<%} %>
</body>
</html>