<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
</head>
<body>
<center>
<form action="EngineSignUp" method="get">
 
  Login:<br>			<input type="text" 		placehold="Login"	 	name="login"><br>
  Password:<br>			<input type="password" 	placehold="Password" 	name="password"><br><br>
  Confirm password:<br>	<input type="password" 	placehold="Password" 	name="passConfirm"><br><br>
  Email:<br>			<input type="email" 	placehold="email" 		name="email"><br><br>
  
  <input type="submit" value="Sign Up">
  <input type="reset" value="Clear form">
</form>
</center>
</body>
</html>