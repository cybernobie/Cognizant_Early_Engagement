<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<form action="AgeCalculator" name="form" method="GET">
		<table>
			<tr>
				<td>Enter Name :</td>
				<td><input type="text" id="name" required pattern="[A-Z]{1}[a-zA-Z]+"/></td>
			</tr>
			<tr>
				<td>Select Birth Date :</td>
				<td><input type="date" id="dob" required /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Calculate Age" name="calculateAge" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	<h2 id="result">${name} ${message}</h2>

</body>
</html>