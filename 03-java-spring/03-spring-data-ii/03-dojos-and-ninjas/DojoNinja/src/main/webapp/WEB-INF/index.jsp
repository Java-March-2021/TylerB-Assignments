<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Navigation Page</title>
</head>
<body>
	<div class="container">
		<h1>What Would You Like To Do?</h1>
		<a href="/dojos/new">Create a Dojo</a>
		<a href="/ninjas/new">Create a Ninja</a>
		<div>
			<h3>View a Dojo:</h3>
				<c:forEach items="${dojos}" var="dojo" varStatus="loop">
					<a href="/dojos/${dojo.id}">${dojo.name}</a>
				</c:forEach>
		</div>
	</div>
</body>
</html>