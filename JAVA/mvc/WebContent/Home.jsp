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
String user=request.getParameter("uname");
if(user!=null){
 %>


Hello <%=user %>
<br>

<%} %>

<%if(msg!=null){ %>
<%=msg %>
<%} %>



<a href="SelectAllServlet">See All Students</a>
<a href="UpdatePassword.jsp"> Update Password</a>
<a href="DeleteServlet">Delete Account</a>
<a href="LogoutServlet">Logout Account</a>



</body>
</html>