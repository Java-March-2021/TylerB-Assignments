<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Survey Result</title>
</head>
<body>
	<div class="container">
		<h1>Submitted Info</h1>
		<table class="table table-borderless">
			<tbody>
				<tr>
					<td>Name:</td>
					<td><c:out value="${ name }"/></td>
				</tr>
				<tr>
					<td>Dojo Location:</td>
					<td><c:out value="${ location }"/></td>
				</tr>
				<tr>
					<td>Favorite Language:</td>
					<td><c:out value="${ language }"/></td>
				</tr>
				<tr>
					<td>Comment:</td>
					<td><c:out value="${ comment }"/></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>