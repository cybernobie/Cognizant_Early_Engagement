<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

	<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="ISO-8859-1">
			<title>BMI Calculator</title>
		</head>

		<body>
			<center>
				<h1 id="heading">BMI Calculator</h1>
				<table>
					<caption style="font-weight: bolder;">Body Mass Index
						Calculator Form</caption>
					<sf:form action="getBMI" modelAttribute="user" method="GET" name="form">
						<tr>
							<td>Enter Name:</td>
							<td>
								<sf:input path="name" id="name" name="name" />
								<sf:errors style="color:red" path="name"></sf:errors>
							</td>
						</tr>
						<tr>
							<td>Phone Number:</td>
							<td>
								<sf:input path="phoneNumber" id="phoneNumber" name="phoneNumber" />
								<sf:errors style="color:red" path="phoneNumber"></sf:errors>
							</td>
						</tr>
						<tr>
							<td>Height in CM:</td>
							<td>
								<sf:input path="height" id="height" name="height" />
								<sf:errors style="color:red" path="height"></sf:errors>
							</td>
						</tr>

						<tr>
							<td>Weight in KG:</td>
							<td>
								<sf:input path="weight" id="weight" name="weight" />
								<sf:errors style="color:red" path="weight"></sf:errors>
							</td>
						</tr>

						<tr>
							<td>Gender:</td>
							<td>
								<sf:select path="genderType" items="${genderList}" id="genderType" name="genderType">
								</sf:select><br>
								<sf:errors path="genderType"></sf:errors>
							</td>
						</tr>
						<tr>
							<td><input type="submit" id="submit" name="calculateBMI" value="CalculateBMI"></td>
							<td><input type="reset" id="Clear" name="Clear" value="Clear"></td>
						</tr>
					</sf:form>
				</table>
			</center>
		</body>

		</html>