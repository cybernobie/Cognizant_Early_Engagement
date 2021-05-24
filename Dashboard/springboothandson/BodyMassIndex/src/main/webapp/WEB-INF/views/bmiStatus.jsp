<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Status</title>
</head>
<body>
	<h2 id="status">
		Id:${user.userId}<br> Name: ${user.name}<br> Height:
		${user.height}CM<br> Weight: ${user.weight}KG<br> BMI:
		${bmi}<br> Status: ${bmiStatus}
	</h2>
</body>
</html>
