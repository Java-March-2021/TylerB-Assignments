<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <title>Registration Page</title>
</head>
<body>
<div class="container">
	<div class="row">
			<div class="col">
				<h1>Register!</h1>
		    	<form:form method="POST" action="/register" modelAttribute="user">
		    		<div class="form-group">
		            	<form:label path="firstName">First Name:</form:label>
		            	<form:errors path="firstName"/>
		            	<form:input class="form-control" type="firstName" path="firstName"/>
		        	</div>
		        	<div class="form-group">
		            	<form:label path="lastName">Last Name:</form:label>
		            	<form:errors path="lastName"/>
		            	<form:input class="form-control" type="lastName" path="lastName"/>
		        	</div>
		        	<div class="form-group">
		            	<form:label path="email">Email:</form:label>
		            	<form:errors path=""/>
		            	<form:input class="form-control" type="email" path="email"/>
		        	</div>
		        	<div class="form-group">
		            	<form:label path="password">Password:</form:label>
		            	<form:errors path="password"/>
		            	<form:password class="form-control" path="password"/>
		        	</div>
		        	<div class="form-group">
		            	<form:label path="confirmPassword">Password Confirmation:</form:label>
		            	<form:errors path="confirmPassword"/>
		            	<form:password class="form-control" path="confirmPassword"/>
		        	</div>
		        	<div class="form-group">
		        		<input class= "btn btn-primary" type="submit" value="Register!"/>
		        	</div>
		        	
		    	</form:form>
			</div>
		    
		    <div class="col">
		    	<h1>Login</h1>
		    	<p><c:out value="${error}" /></p>
		    	<form method="post" action="/login">
		        	<div class="form-group">
		            	<label type="email" for="email">Email</label>
		            	<input class="form-control" type="text" id="email" name="email"/>
		        	</div>
		        	<div class="form-group">
		            	<label for="password">Password</label>
		            	<input class="form-control" type="password" id="password" name="password"/>
		        	</div>
		        	<div class="form-group">
		        		<input class="btn btn-primary" type="submit" value="Login!"/>
		        	</div>
		        	
		    </form>    
		    </div>
	</div>
</div>
</body>
</html>