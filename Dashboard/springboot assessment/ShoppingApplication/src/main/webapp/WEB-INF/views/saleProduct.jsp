<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Zara Shopping</center></h1>
<div style="text-align: center;">
<form:form action="viewDiscountedPrice" modelAttribute="saleProductObj" method="POST">
<label>Product Type</label>
<form:select path="productList" id="productType" items="${productList}" /> 
<br /> <label>Product Price</label>
<form:input path="productPrice" id="productPrice"  />
<form:errors path="productPrice" />
<br>
<input type="submit" value="Calculate Discounted Price" name="submit" id="submit" />
</form:form>
</div>
</body>
</html>	 	  	    	    	     	      	 	
