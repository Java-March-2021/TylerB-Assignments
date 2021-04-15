<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>${ dojo.name } Location Ninjas</h1>
		<table class="table tabledark">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<c:forEach items="${ninjas}" var="ninja" varStatus="loop">
				<tr>
					<td>${ninja.firstName}</td>
					<td>${ninja.lastName}</td>
					<td>${ninja.age}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>