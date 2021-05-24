<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
<center>
<h1>ZEE-ZEE Web Portal</h1>
</center>


 <sf:form method="post" modelAttribute="login" action="/submitlogin">
 
 <sf:label path="userName">UserName</sf:label>
 <sf:input path="userName"/>
 <sf:label path="password">Password</sf:label>
 <sf:password path="password"/>
 <input type="submit" value="Submit" name="submit" />
 <input type="reset" value="Cancel" name="cancel" />
</sf:form>












</body>
</html>
