<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login to SRKA</title>
</head>
<body>
<center><h4>Login</h4></center>
<form name="loginForm" method="post" action="/SRKA/login" >
Enter a Username : <input type="text" name="username"><br />
Enter a Password : <input type="password" name="password"><br />
<input type="submit" value="Submit">
<br />
<a href="register.jsp">New User?</a>
</form>
</body>
</html>