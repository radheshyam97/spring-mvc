<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Final Stemp</title>
</head>
<body>


<h1>Registration Final Step</h1>
<hr>

<form name="form1" action="registration.spring" method="post">
Address 1: <input type="text" name="addr1" id="addr1"/><br>
Street: <input type="text" name="street" id="street"/><br>
City: <input type="text" name="city" id="city"/><br>
State: <input type="text" name="state" id="state"/><br>
Country: <input type="text" name="country" id="country"/><br>
<input type="submit" name="Submit" value="Finish">
<input type="hidden" name="_finish" value="finish">
</form>



</body>
</html>