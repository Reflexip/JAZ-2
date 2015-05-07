<%@page import="classes.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Premium manager</title>
</head>
<body>


<form action="EngineSetPremium" method="get">
Set premium<br>
  Login:<br><input type="text" placehold="Login" name="username">
  <input type="submit" value="Set Premium"> 
 </form>
 <form action="EngineDisablePremium" method="get">
Disable premium<br>
  Login:<br><input type="text" placehold="Login" name="username">
  <input type="submit" value="Disable premium"> 
 </form><br>
 
  <a href = "EngineMySite"><button type = "button">My Site</button></a>
  <br><br>
  <%
  ArrayList<User> users = new ArrayList<User>();
  users = (ArrayList<User>) request.getAttribute("usersList");
  for(User user : users){
	  out.println("|Login: " + user.getLogin() + "|");%><br><%
	  out.println("|Account Type: " + user.getAccType() + " |");
	%><br>---------------------------<br><br><%}
	%>
 

</body>
</html>