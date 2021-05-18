<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
	<center>
		<h1>Welcome to Online Help Services</h1>

		<form:form action="/register" method="post" modelAttribute="register">
			<table>
				<tr>
					<td>UserName:</td>
					<td><form:input path="userName" id="userName" /></td>
					<td><form:errors path="userName" /></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><form:input path="contactNumber" id="contactNumber" /></td>
					<td><form:errors path="contactNumber" /></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input path="emailId" id="emailId" /></td>
					<td><form:errors path="emailId" /></td>
				</tr>
				<tr>
					<td>Confirm Email Id</td>
					<td><form:input path="confirmEmailId" id="confirmEmailId" /></td>
					<td><form:errors path="confirmEmailId" /></td>
				</tr>
				<tr>
					<td><form:checkbox path="status" id="status" /></td>
					<td>I agree</td>
					<td><form:errors path="status" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register" name="submit" /></td>
					<td><input type="reset" value="Cancel" /></td>
				</tr>
			</table>
		</form:form>
	</center>



</body>
</html>
