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
String u=(String)request.getAttribute("msg");
if(u!=null)
{%>
<h3 style="color:green;"><%=u %></h3>
<%} %>
<form action="MyServlet">
<input type="text" name=uname>
<input type="password" name="pass">
<input type="submit" value="login">
</form>
</body>
</html>