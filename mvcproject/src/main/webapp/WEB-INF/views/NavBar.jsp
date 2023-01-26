<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
ul {
	list-style-type: none;
	background-color: black;
	overflow: hidden;
	background-color: #333;
}
li {
	float: right;
	
}
li a {
	display: block;
	margin: 0px;
	padding: 15px;
}
li a:hover {
	background-color: red;
	color: blue;
}
</style>
<body>
<ul>
<li><a style="color: white;" href="./logout">Logout</a></li>
<li><a style="color: white;" href="./search">Search</a></li>
<li><a style="color: white;" href="./add">Add</a></li>
<li><a style="color: white;" href="./update">Update</a></li>
<li><a style="color: white;" href="./remove">Remove</a></li>
<li><a style="color: white;" href="./home">Home</a></li>

</ul>


</body>
</html>