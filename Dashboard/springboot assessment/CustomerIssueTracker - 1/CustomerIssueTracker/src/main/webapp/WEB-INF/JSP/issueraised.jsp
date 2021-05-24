<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Following Issue Is Raised</title>
</head>
<body> 
	<h3 id="issueR">Following ISsue Is Raised....</h3>

<!-- TYPE YOUR CODE HERE -->
	<table border="1">
		<tr>
			<th>Issue Id</th>
			<th>Issue Report Date</th>
			<th>Customer Id</th>
			<th>Category</th>
			<th>Description</th>
			<th>Status</th>
			<th>CC Rep Id</th>
		</tr>
		<tr>
			<td>${issue.getCustIssueId()}</td>
			<td>${issue.getIssueReportDate()}</td>
			<td>${issue.getCustId()}</td>
			<td>${issue.getCategory()}</td>
			<td>${issue.getDescription()}</td>
			<td>${issue.getIssueStatus()}</td>
			<td>${issue.getCcRepId()}</td>
		</tr>
	</table>
	<br />
	<a href="login1" id="back">Back to Login Page</a><br />
	<a href="customerform" id="fback">Back To Customer's Page</a>


</body>
</html>