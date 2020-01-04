<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Step 2</title>
</head>
<body>
<h1>Registration Step 2</h1>
<hr>

<form name="form1" action="registration.spring" method="post">
First Name: <input type="text" name="fname" id="fname"/><br>
Last Name: <input type="text" name="lname" id="lname"/><br>
Middle Name(Initial): <input type="text" name="initial" id="initial"/><br>
DOB: <input type="text" name="dob" id="dob"/><br>
Mobile: <input type="text" name="mobile" id="mobile"/><br>
Phone: <input type="text" name="phone" id="phone"/><br>

<input type="submit" name="Submit" value="Next&gt;">
<input type="hidden" name="_page" value="2">




</form>

</body>
</html>