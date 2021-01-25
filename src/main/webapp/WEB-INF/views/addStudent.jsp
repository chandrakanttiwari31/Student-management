<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">

	<h3>Add Student</h3>

	<form:form action="saveStudent" method="post" modelAttribute="student">
	   <form:hidden path="id"/>
	
		<label>Name</label>
		<form:input path="name" />

		<br>
		<label>Mobile</label>
		<form:input path="mobile" />

		<br>
		<label>Country</label>
		<form:input path="country" />
		<br>
		<input type="submit" value="Submit" />

	</form:form>
</div>
</body>
</html>