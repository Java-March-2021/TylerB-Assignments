<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create a New License</title>
</head>
<body>
<h1>New License</h1>
	<form:form action="/licenses/addLicense" method="POST" modelAttribute="license">
		<form:label path="person">Person: </form:label>
		<form:errors path="person"/>
		<form:select path="person">
			<c:forEach items="${persons}" var="person" varStatus="loop">
				<form:option value="${person.id}">${person.firstName} ${person.lastName}</form:option>
			</c:forEach>
		</form:select>
		
		<form:label path="state">State: </form:label>
		<form:errors path="state"/>
		<form:input path="state"/>
		
		<form:label path="expirationDate">Expiration Date: </form:label>
		<form:errors path="expirationDate"/>
		<form:input type="date" path="expirationDate"/>
		
		<form:button>Submit</form:button>
	</form:form>
</body>
</html>