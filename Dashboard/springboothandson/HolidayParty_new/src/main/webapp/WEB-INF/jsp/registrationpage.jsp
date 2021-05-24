<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
	<h1>
		<center>Welcome to Online Help Services</center>
	</h1>

	<form:form modelAttribute="register" action="/register" method="post">
		<spring:message code="error.userName" text="UserName" />
		<%-- <form:label path="userName" name="userName" >UserName</form:label> --%>
		<form:input path="userName" id="userName" name="userName" />
		<form:errors path="userName"></form:errors>
		<br>
		<spring:message code="error.contactNumber" text="Contact Number" />
		<%-- <form:label path="contactNumber" name="contactNumber">Contact Number</form:label> --%>

		<form:input path="contactNumber" id="contactNumber"
			name="contactNumber" />
		<form:errors path="contactNumber"></form:errors>
		<br>
		<spring:message code="error.emailId" text="Email Id" />
		<%-- <form:label path="emailId" name="emailId">Email Id</form:label> --%>
		<form:input path="emailId" id="emailId" name="emailId" />
		<form:errors path="emailId"></form:errors>
		<br>
		<spring:message code="error.confirmEmailId" text="Confirm Email Id" />
		<%-- <form:label path="confirmEmailId" name="confirmEmailId">Confirm Email Id</form:label>
		 --%>
		<form:input path="confirmEmailId" id="confirmEmailId"
			name="confirmEmailId" />
		<form:errors path="confirmEmailId"></form:errors>
		<br>
		<form:checkbox path="status" id="status" name="status" />
	<%-- 	<form:label path="status" name="status">I agree</form:label> --%>
		<spring:message code="error.status" text="I agree" />

		<form:errors path="status"></form:errors>
		<br>
		<input type="submit" value="Register" name="submit">

	</form:form>


</body>
</html>


