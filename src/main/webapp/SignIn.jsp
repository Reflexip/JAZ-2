<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign In</title>
</head>
<body>
<center>
<form action="EngineSignIn" method="get">
  Login:<br><input type="text" placehold="Login" name="login"><br>
  Password:<br><input type="password" placehold="Password" name="password"><br><br>
  <input type="submit" value="Sign In">
  <a href="SignUp.jsp"><button type="button">Sign Up</button>
  <a href="SignUp.jsp"><button name = "guest" type="button">Sign in as Guest</button>
</form>
</center>

</body>
</html>