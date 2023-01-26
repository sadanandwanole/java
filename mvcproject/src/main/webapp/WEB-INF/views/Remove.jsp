<%@page import="java.util.List"%>
<%@page import="com.jspiders.mvcproject.pojo.StudentPOJO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
List <StudentPOJO> students = (List <StudentPOJO>) request.getAttribute("students");
String msg = (String) request.getAttribute("msg");
%>
<jsp:include page="NavBar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Removing....</title>
</head>
<body>
	<form action="./remove" method="post">
		<fieldset>
			<legend> :::Student Details ::</legend>
			<table>
				<tr>
					<td>Please Enter Student ID :</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Remove"></td>
				</tr>



			</table>


		</fieldset>

	</form>
	<%if(msg != null) {%>
	<h2 align="center">
	<%=msg %>
	</h2>
	
	<%} %>
	<%
	if (students != null) {
	%>
	<table border="1px solid">
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
		for(StudentPOJO student :students) {
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
	%>

</body>
</html>