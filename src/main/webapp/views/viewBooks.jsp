<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saved Books</title>
</head>
<body>

	<table>

		<thead>
			<tr>
				<th>Book Id</th>
				<td>Book Name</td>
				<td>Book Price</td>
				<td>Author Name</td>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${books})" var="b">
				<tr>
					<td>${b.bookId}</td>
					<td>${b.bookName}</td>
					<td>${b.bookPrice}</td>
					<td>${b.authorName}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>