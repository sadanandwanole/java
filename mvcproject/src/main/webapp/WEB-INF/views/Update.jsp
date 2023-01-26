<%@page import="java.util.List"%>
<%@page import="com.jspiders.mvcproject.pojo.StudentPOJO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
List<StudentPOJO> students = (List<StudentPOJO>) request.getAttribute("students");
String msg = (String) request.getAttribute("msg");
StudentPOJO student1 = (StudentPOJO) request.getAttribute("student");
%>
<jsp:include page="NavBar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
</head>
<body>
	<%
	if (student1 != null) {
	%>
	
	<form action="./updateData" method="post">
		<table border="1px solid" align="center">
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" value="<%=student1.getId()%>">  </td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input type="text" name="name" value="<%=student1.getName()%>"></td>
			</tr>
			<tr>
				<th>E-Mail</th>
				<td><input type="text" name="email" value="<%=student1.getEmail()%>"></td>
			</tr>
			<tr>
				<th>Contact</th>
				<td><input type="text" name="contact" value="<%=student1.getContact()%>"></td>
			</tr>
			<tr>
				<th>City</th>
				<td><input type="text" name="city"  value="<%=student1.getCity()%>"></td>
			</tr>
			<tr>
				<th>Username</th>
				<td><input type="text" name="username" value="<%=student1.getUsername()%>"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="text" name="password" value="<%=student1.getPassword()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
			</tr>

		</table>
	</form>

	<%
	} else {
		
	%>
	<fieldset>
		<legend>Update Details...</legend>
		<form action="./update" method="post">
			<table border="1px solid" align="center">
				<tr>
					<td>Enter Student Id :</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Select"></td>
				</tr>
			</table>
		</form>

	</fieldset>
	<%
	if(msg != null){%>
	<h3 align="center" style="color: red;"><%=msg %></h3>	
	<% }%>
	<%
	if (students != null) {
	%>
	<table border="1px solid" align="center">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>E-Mail</th>
			<th>Contact</th>
			<th>City</th>
			<th>Username</th>
			<th>Password</th>
		</tr>

		<%
		for (StudentPOJO student : students) {
		%>
		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getEmail()%></td>
			<td><%=student.getContact()%></td>
			<td><%=student.getCity()%></td>
			<td><%=student.getUsername()%></td>
			<td><%=student.getPassword()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	}
	}
	%>


</body>
</html>