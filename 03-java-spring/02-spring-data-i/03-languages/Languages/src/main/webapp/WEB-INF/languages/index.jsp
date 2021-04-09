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
<h1>Languages</h1>
<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${languages}" var="language" varStatus="loop"> 
			<tr>    
    			<td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
   				<td><c:out value="${language.creator}"/></td>
    			<td><c:out value="${language.version}"/></td>
    			<td>
    				<form action="/languages/edit/${language.id}" method="get">
    					<input type="submit" value="Edit">
    				</form>  
    				<form action="/languages/delete/${language.id}" method="post">
    					<input type="hidden" name="_method" value="delete">
    					<input type="submit" value="Delete">
    				</form>  
    			</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<h1>Add Language</h1>

<form:form action="/languages" method="post" modelAttribute="newLanguage">
	<p>
		<form:label path="name">Name</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
	</p>
	<p>
		<form:label path="creator">Creator</form:label>
		<form:errors path="creator"/>
		<form:input path="creator"/>
	</p>
	<p>
		<form:label path="version">Version</form:label>
		<form:errors path="version"/>
		<form:input path="version"/>
	</p>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>