<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Site</title>
</head>
<body>
Username:${requestLogin} <br></br>
Email:${requestEmail} <br></br>
<a href = "Premium.jsp"><button type = "button">Premium Site</button></a>
<a href = "EnginePremiumManager"><button type = "button">Premium Manager</button></a>
<a href = "EngineLogout"><button type = "button">Logout</button></a>
</body>
</html>