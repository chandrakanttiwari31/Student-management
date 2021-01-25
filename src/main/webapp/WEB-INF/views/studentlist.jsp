<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="showaddStudent">
<input type="submit" value="ADD">
</form>


  <h1 align="center">Student list</h1>
  <table border="1" align="center">
    <thead>
    <tr>
    <td>id</td>
      <td>name</td>
        <td>mobile</td>
          <td>country</td>
          </tr>
    </thead>
  <c:forEach  var="stu" items="${students }">
  <tr>
      <td> ${stu.id}</td>
      <td>${stu.name}</td>
       <td>${stu.mobile}</td>
      <td>${stu.country}</td>
      <td><a  onclick="return confirm('Do you want to Update this food')" href="/student-management/updateStudent?userid=${stu.id}">Update</a></td>
      <td><a onclick="return confirm('Do you want to Delete this Student')" href="/student-management/deleteStudent?userid=${stu.id}">Delete</a></td>
  </tr>
  </c:forEach>
    </table>
</body>
</html>