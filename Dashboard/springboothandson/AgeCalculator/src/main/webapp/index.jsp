<%@ page import="java.io.PrintWriter" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<center>
    <form action="AgeCalculator" name="form">
        <table>
            <caption>Age Calculator</caption>
            <tr>
                <td>
                    <label for="name">Enter Name :</label>
                </td>
                <td>
                    <input type="text" id="name" name="name" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="dob">Select Birth Date :</label>
                </td>
                <td>
                    <input type="date" name="dob" id="dob" required>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Calculate Age" name="calculateAge">
                </td>
                <td>
                    <input type="reset" value="Cancel">
                </td>
            </tr>
        </table>
    </form>
    <br><br>
    <h2 id="result">
        <%
            if (request.getAttribute("age") != null) {
                String name = (String) request.getAttribute("name");
                String age = (String) request.getAttribute("message");
                ((JspWriter) out).print(name + " " + age);
            }
        %>
    </h2>
</center>
</body>
</html>