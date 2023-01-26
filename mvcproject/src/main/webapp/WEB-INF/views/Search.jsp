<%@page import="com.jspiders.mvcproject.pojo.StudentPOJO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
	StudentPOJO student=(StudentPOJO) request.getAttribute("student");
	String msg=(String) request.getAttribute("msg");
	%>
	
<jsp:include page="NavBar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
<fieldset>
	<legend>:::Search Student Details::::</legend>
	<form action="./search" method="post">
		<table>

			<tr>
				<td>Enter Student ID :</td>
				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Search"></td>
			</tr>

		</table>

	</form>
	</fieldset>
	<% if(student != null){ %>
	<table id="table"  border="1px solid" align="center">
	<tr>
	<th> ID </th>
	<th>Name </th>
	<th>E-Mail</th>
	<th>Contact</th>
	<th>City</th>
	<th>Username</th>
	<th>Password</th>
	
	
	</tr>
	<tr>
	<td><%=student.getId() %></td>
	<td><%=student.getName() %></td>
	<td><%=student.getEmail() %></td>
	<td><%=student.getContact() %></td>
	<td><%=student.getCity() %></td>
	<td><%=student.getUsername() %></td>
	<td><%=student.getPassword() %></td>
	</tr>
	<%} %>
	
	
	</table>
	<%if (msg != null){ %>
	<h3><%=msg %></h3>
	<%} %>
	

</body>
<style>
#table{
align-self: center;
align-items: center;
align-content: center;
text-align: center;
background-color: gray;
border:1px solid;
color: white;
}

</style>
</html>