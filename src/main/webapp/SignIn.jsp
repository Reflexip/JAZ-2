<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formularz logowania</title>
</head>
<body>
<form action="EngineSignIn" method="get">
  Login:<br><input type="text" placehold="Login" name="login"><br>
  Password:<br><input type="text" placehold="Password" name="password"><br><br>
  <input type="submit" value="Sign In">
  <a href="SignUp.jsp"><button type="button">Sign Up</button>
</form>


</body>
</html>