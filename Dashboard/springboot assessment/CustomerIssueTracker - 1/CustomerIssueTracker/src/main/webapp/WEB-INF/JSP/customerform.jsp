<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer's Page</title>
</head>
<body style='margin-left: 30px'>
	
		<h2 id="heading3">Welcome To Customer Page</h2>
		
		

			<!-- TYPE YOUR CODE HERE -->
			<form name="form" modelAttribute="customer" action="customerform" method=post >
			<table>
				<tr>
				<td>Please Select Your Option: </td>
				<td><input type="radio" id="ri" name="option" value="ri"  />Raise Issue</td>
				<td><input type="radio" id="vi" name="option" value="vi" />View Issue Status</td>
				<td>Enter Id of Issue You Wish to See</td>
				<td><input type="text" id="issueid"  name="issueid" /></td>
				</tr>
				
				<tr>
					<td><input type="submit" id="sub1" name="submit" value="Submit" /></td>
				</tr>
			</table>
			</form>

		
	
</body>

</html>