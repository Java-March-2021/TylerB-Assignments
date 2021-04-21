<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Product Details</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${ product.name }"/></h1>
		<div>
			<h3>Categories: </h3>
			<ul>
				<c:forEach items="${ product.categories }" var="category" varStatus="loop">
					<li>${category.name}</li>
				</c:forEach>
			</ul>
		</div>
		<div>
			<form action="/products/add/${product.id}" method="POST">
				<select name="category">
					<c:forEach items="${categories}" var="category" varStatus="loop">
						<option value="${category.id}">${category.name}</option>
					</c:forEach>
				</select>
				<button>Add</button>
			</form>
		</div>
	</div>
</body>
</html>