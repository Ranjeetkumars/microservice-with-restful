<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="saveData" method="POST">

		<table>
			<tr>
				<td>Book Name:</td>
				<td><input type="text" name="bookName" /></td>
			</tr>
			<tr>
				<td>Book Author Name:</td>
				<td><input type="text" name="authorName" /></td>
			</tr>
			<tr>
				<td>Book Price :</td>
				<td><input type="text" name="bookPrice" /></td>
			</tr>
          
          <tr>
				<td></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>


		</table>


	</form>
</body>
</html>