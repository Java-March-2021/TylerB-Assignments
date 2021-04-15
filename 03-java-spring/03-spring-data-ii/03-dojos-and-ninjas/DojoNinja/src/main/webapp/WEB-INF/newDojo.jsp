<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Create Dojo</title>
</head>
<body>
	<div class="container">
		<h1>New Dojo</h1>
		<form:form action="/dojos/new" method="POST" modelAttribute="dojo">
			<form:label path="name">Name: </form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
			<form:button>Create!</form:button>
		</form:form>
	</div>
</body>
</html>