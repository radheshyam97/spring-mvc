<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>

<div style="color: red;">
	<form:errors path="EmpDetails.name"/><br>
	<form:errors path="EmpDetails.deptNo"/><br>
</div>

<form action="addEmployee.spring" method="post">
Employee Number: <input type="text" name="empNo"/><br>
Employee Name: <input type="text" name="name"/><br>
Job: <input type="text" name="job"/><br>
Manager ID:<input type="text" name="mgr"/><br>
Salary: <input type="text" name="sal"/><br>
Commition: <input type="text" name="comm"/><br>
Dept No: <input type="text" name="deptNo"/><br>
<input type="submit" value="Add Employee">
</form>
	
</body>
</html>