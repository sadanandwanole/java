<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	<form action="./submit">
		<table>
			<thead>

				<tr>
					<td>name</td>
					<td>contact</td>

				</tr>

			</thead>
			<tbody>
				<tr>
					<td>name</td>
					<td><input type="text" placeholder="name" name="name"></td>

				</tr>
				<tr>
					<td>contact</td>
					<td><input type="tel" placeholder="contact" name="contact"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" placeholder="name" name="submit" value="submit"></td>

				</tr>
				<tr>
					<td></td>
					<td><input type="reset" placeholder="name" name="submit" value="Reset"></td>

				</tr>

			</tbody>
		</table>
	</form>
</body>
</html>