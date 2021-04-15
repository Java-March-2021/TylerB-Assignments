<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>New Ninja</h1>
		
		<form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
			<div>
				<form:label path="dojo">Dojo: </form:label>
				<form:errors path="dojo"/>
				<form:select path="dojo">
					<c:forEach items="${ dojo }" var="dojo" varStatus="loop">
						<form:option value="${dojo.id}">${ dojo.name }</form:option>
					</c:forEach>
				</form:select>
			</div>
			<div>
				<form:label path="firstName">First Name: </form:label>
				<form:errors path="firstName"/>
				<form:input path="firstName"/>
			</div>
			<div>
				<form:label path="lastName">Last Name: </form:label>
				<form:errors path="lastName"/>
				<form:input path="lastName"/>
			</div>
			<div>
				<form:label path="age">Age: </form:label>
				<form:errors path="age"/>
				<form:input path="age"/>
			</div>
			<form:button>Create!</form:button>
		</form:form>
	</div>
</body>
</html>