<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Status</title>
</head>
<body>
	<h2 id="status">
		Your order has been successfully placed, <br/>
		Order Id is: ${orderId} <br/>
		Order Date: ${orderDate} <br/>
		Amount in dollar: $${cake.getPrice()} <br/>
		Amount in Rupees: Rs.${indianPrice} <br/>
	</h2>
</body>
</html>
