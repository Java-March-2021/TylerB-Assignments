<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>New Product</title>
</head>
<body>
	<div class="container">
		<h1>New Product</h1>
		<form:form action="/products/new" method="POST" modelAttribute="product">
			<div>
				<form:label path="name">Name: </form:label>
				<form:errors path="name"/>
				<form:input path="name"/>
			</div>
			<div>
				<form:label path="description">Description: </form:label>
				<form:errors path="description"/>
				<form:input path="description"/>
			</div>
			<div>
				<form:label path="price">Price: $</form:label>
				<form:errors path="price"/>
				<form:input path="price"/>
			</div>
			
			<form:button>Create</form:button>
		</form:form>
	</div>
</body>
</html>