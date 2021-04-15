<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/></h1>
<p>License Number: <c:out value="${person.license.number}"/> </p>
<p>Expiration Date: <fmt:formatDate value="${person.license.expirationDate}" pattern="MMM dd, yyyy"/></p>
</body>
</html>