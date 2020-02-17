<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="UTF-8">
<title>Emp List</title>
</head>
<body>

<h2>Employee Search Result</h2>
<hr>

<c:if test="${not empty searchResultList}">
	<table border="1" >
		<tr>
			<th>Emp No</th>
			<th>Emp Name</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>
		<c:forEach items="${searchResultList}" var="result">
			<tr>
				<td>${result.no}</td>
				<td>${result.name}</td>
				<td>${result.salary}</td>
				<td>${result.desg}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>