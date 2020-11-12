<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String msg=(String)request.getAttribute("msg");
if(msg!=null){
 %>


<%=msg %>


<%} %>
<form action="LoginServlet">
Username
<input type="text" name="uname">
Password
<input type="password" name="pname">
<input type="submit" value="Login">
</form>
<a href="Register.jsp">click here to register</a>

</body>
</html>