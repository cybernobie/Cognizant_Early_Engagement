<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
	<center>
		<h1>Internationalization</h1>
	</center>

	<form:form method="post" modelAttribute="customer">

		<table>
			<tr>
				<td id="id1"><spring:message code="label.custName" /></td>
				<td><form:input name="customerName" path="customerName" /></td>
			</tr>

			<tr>
				<td id="id2"><spring:message code="label.emailId" /></td>
				<td><form:input name="emailid" path="emailid" /></td>
			</tr>
			<tr>
				<td id="id3"><spring:message code="label.address" /></td>
				<td><form:input name="address" path="address" /></td>
			</tr>

			<tr>
				<td><input type="submit"
					value="<spring:message code='label.submit'/>" name="submit" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>

		</table>
	</form:form>


</body>
</html>