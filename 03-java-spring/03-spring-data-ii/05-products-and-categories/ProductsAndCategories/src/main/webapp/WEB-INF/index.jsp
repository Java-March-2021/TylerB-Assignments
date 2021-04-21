<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Home Navigation Page</title>
</head>
<body>
	<div class="container">
		<h1>What Would You Like To Do?</h1>
		<h3><a href="/products/new">Create a Product</a></h3>
		<h3><a href="/categories/new">Create a Category</a></h3>
		<h3>See Product Details:</h3>
		<%-- <form action="/products/${product.id}" method="GET">
			<select name="product"> --%>
				<c:forEach items="${products}" var="product" varStatus="loop">
					<a href="/products/${product.id}">${ product.name }</a>
				</c:forEach>
			<%-- </select>
			<button>See Product</button>
		</form> --%>
		<h3>See Category Details:</h3>
		<%-- <form action="/categories/${category.id}" method="GET">
			<select name="category"> --%>
				<c:forEach items="${categories}" var="category" varStatus="loop">
					<a href="categories/${category.id}">${ category.name }</a>
				</c:forEach>
			<%-- </select>
			<button>See Product</button>
		</form> 
		
		Seemed like a good idea. Would love to see how I could actually get this to work
		
		--%> 
	</div>
</body>
</html>