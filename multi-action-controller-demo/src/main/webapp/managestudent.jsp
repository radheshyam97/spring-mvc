<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>

<%@ page isELIgnored="false" %>

<meta charset="UTF-8">
<title>Student Management Panel</title>
</head>
<body>
<h2>Student Management Panel</h2>
<hr>



<form action="./student.htm" method="post">

Roll Number: <input type="text" name="rollno" value="${stu.rollno}"><br>
Student Name: <input type="text" name="sname" value="${stu.sname}"><br>
Marks: <input type="text" name="marks" value="${stu.marks}"><br>

<br>
<input type="submit" name="manage" value="add"> 
<input type="submit" name="manage" value="update"> 
<input type="submit" name="manage" value="delete"> 
<input type="submit" name="manage" value="get">

 <br>
 <br>
 
 <%=request.getAttribute("msg") %><br>

<br>
M1: <c:out value="${msg}"></c:out><br>
M2: ${msg} <br>


</form> 

</body>
</html>