<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.raiseissue {
	align-content: center;
}
table
{
	margin:0 auto;
}
</style>
<title>RAISE ISSUE</title>
</head>
<body>

	<!-- TYPE YOUR CODE HERE -->

	<form action="/raiseissue" method="post">
		<table>
			<tr>
				<td><b>Issued Id:</b></td>
				<td><input type="text" name="custIssueId" value="${custIssueId}" ></td>
			</tr>
			<tr>
				<td><b>Issued Report Date:</b>Format:yyyy-mm-dd</td>
				<td><input type="text" name="issueReportDate" ></td>
			</tr>
			<tr>
				<td><b>Customer Id:</b></td>
				<td><input type="text" name="custId" ></td>
			</tr>
			<tr>
				<td><b>Category:</b></td>
				<td><input type="text" name="category" ></td>
			</tr>
			<tr>
				<td><b>Description:</b></td>
				<td><textarea rows="5" cols="20" name="descr" ></textarea>  </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" name="Submit" ></td>
			</tr>
		</table>
	</form>

</body>
</html>