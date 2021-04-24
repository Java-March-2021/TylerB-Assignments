<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>New Question</h1>
		<form:form action="/ask" method = "POST" modelAttribute="newQuestion">
			<form:label path="question">Question:</form:label>
			<form:errors path="question"/>
			<form:textarea path="question"/>
			
			<label for="tag">Tags:</label>
			<form:errors path="tags"/>
			<input type="text" name="tag" />
			
			<button>submit</button>
		</form:form>
	</div>
</body>
</html>