<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h3>Customer Registrattion Form</h3>

	<h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST" 
          action="customer" modelAttribute=customer>



		<table>
			<tr>
				<td>Customer Name :</td>
				<td><form:input path="customerName" /></td>
			</tr>


			<tr>
				<td>Customer Email :</td>
				<td><form:input path="customerEmail" /></td>
			</tr>


			<tr>
				<td>Customer Phno :</td>
				<td><form:input path="customerPhoneNumber" /></td>
			</tr>


			<tr>
				<td></td>
				<td><input type="submit" value="Save Customer" /></td>
			</tr>


		</table>

	</form:form>

</body>
</html>