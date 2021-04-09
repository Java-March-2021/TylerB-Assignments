<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1><c:out value="${language.name}"/></h1>
<p>Creator: <c:out value="${language.creator}"/></p>
<p>Version: <c:out value="${language.version}"/></p>
<a href="/languages/edit/${language.id}">Edit Language</a>
	<form action="/languages/delete/${language.id}" method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="delete">
    </form>
</body>
</html>