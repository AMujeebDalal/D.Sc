package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
String d=request.getParameter("uname");
String e=request.getParameter("pname");
String f=request.getParameter("email");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
PreparedStatement ps=con.prepareStatement("insert into login(username,password,email) values(?,?,?)");

ps.setString(1,d);
ps.setString(2,e);
ps.setString(3,f);
int i=ps.executeUpdate();
if(i>0)
{
	out.println("sucessfully registered");
}
	}
catch(Exception x)
{
	x.printStackTrace();
}

	}
}
