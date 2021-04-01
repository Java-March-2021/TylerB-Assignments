<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>Dojo Survey</title>
</head>
<body>
	<div class="container">
		<form class="" action="/submit" method="POST">
			<div class="mb-3">
				<label for="name" class="form-label">Your Name:</label>
				<input type="text" name="name" class="form-control">
			</div>
			<div class="mb-3">
				<label for="location" class="form-label">Dojo Location</label>
				<select name="location" class="form-select mb-3">
					<option value="San Jose">San Jose</option>
					<option value="Seattle">Seattle</option>
					<option value="Portland">Portland</option>
				</select>
			</div>
			<div class="mb-3">
				<label for="language">Favorite Language</label>
				<select name="language" class="form-select mb-3">
					<option value="Python">Python</option>
					<option value="Java">Java</option>
					<option value="C++">C++</option>
				</select>
			</div>
			<div class="mb-3">
				<label for="comment" class="form-label">Comment (optional):</label>
				<textarea class="form-control" name="comment" cols="30" rows="10"></textarea>
			</div>
			<input class="btn btn-primary" type="submit" value="Submit">
		</form>
	</div>
</body>
</html>