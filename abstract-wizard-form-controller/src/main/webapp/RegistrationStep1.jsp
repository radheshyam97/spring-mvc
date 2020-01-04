<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Step 1</title>
</head>
<body>
<h1>Registration Step 1</h1>
<hr>

<form name="form1" action="registration.spring" method="post">
User Name: <input type="text" name="uname" id="uname"/><br>
Password: <input type="password" name="pass" id="pass"/><br>
Re-Password: <input type="password" name="repass" id="repass"/><br>
Email: <input type="text" name="email" id="email"/><br>
<input type="submit" name="Submit" value="Next&gt;">
<input type="hidden" name="_page" value="1">




</form>


</body>
</html>