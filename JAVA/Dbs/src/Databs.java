import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Databs extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Name=request.getParameter("userName");
		String Password=request.getParameter("userPass");
		String Email=request.getParameter("userEmail");
		String Country=request.getParameter("userCountry");
		try
		{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			/**Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:xe","system","12345");*/
			Connection con=DriverManager.getConnection("jdbc:db2://5.10.125.192:50000/SQLDB","user04286","iDddDiX1c0ug");
			PreparedStatement ps=con.prepareStatement("insert into registeruser values(?,?,?,?)");
			ps.setString(1, Name);
			ps.setString(2, Password);
			ps.setString(3, Email);
			ps.setString(4, Country);
			int i=ps.executeUpdate();
			if(i>0)
			out.print("you are successfully registered");
		}   catch(Exception e2)
			{
				System.out.println(e2);
			}
			out.close();
			
		}
}
