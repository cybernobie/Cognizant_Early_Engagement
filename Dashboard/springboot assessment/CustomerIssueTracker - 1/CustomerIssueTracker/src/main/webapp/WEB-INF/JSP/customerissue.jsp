<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Issue Details</title>
</head>
<body> 

<h3 id="cust">Customer Issue Details</h3>

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
			<td>${issueobj.getCustIssueId()}</td>
			<td>${issueobj.getIssueReportDate()}</td>
			<td>${issueobj.getCustId()}</td>
			<td>${issueobj.getCategory()}</td>
			<td>${issueobj.getDescription()}</td>
			<td>${issueobj.getIssueStatus()}</td>
			<td>${issueobj.getCcRepId()}</td>
		</tr>
	</table>
	<br />
	<a href="login1" id="login">Back to Login Page</a> <br />
	<a href="customerform" id="customerform">Back To Customer's Page</a>

</body>
</html>