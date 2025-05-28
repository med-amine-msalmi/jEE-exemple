<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>persons list</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/index.css">
</head>
<body>
	<table >
		<thead>
			<tr>
				<th>FullName</th>
				<th>Email</th>
				<th>BirthDate</th>
				<th>Age</th>
				<th>Gender</th>
				<th>MaritalStatus</th>				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="person" items="${Persons }">
				<tr>
					<td>${person.getFulName()}</td>
					<td>${person.getEmail() }</td>
					<td>${person.getBirthDate() }</td>
					<td>${person.getAge() }</td>
					<td>${person.getGender() }</td>
					<td>${person.getMaritalStatus() }</td>
					<td><button>Delete</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>