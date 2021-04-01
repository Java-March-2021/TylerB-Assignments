<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<p class="text-danger"><c:out value="${ errors }"/></p>
		<form class="row g-3" method="POST" action="/code">
		<label class="form-label" for="code">What is the Code?</label>
		<input class="form-control" type="text" name="code">
		<input class="btn btn-primary col-2" type="submit" value="Try Code"/>
		</form>
	</div>
</body>
</html>