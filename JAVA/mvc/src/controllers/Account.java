package controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Account
 */
public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			
			PreparedStatement ps=con.prepareStatement("select * from login ");
			
			
			
		ResultSet rs=	ps.executeQuery();
		if(rs.next()){
			rs.previous();
			request.setAttribute("data", rs);
		
			request.getRequestDispatcher("ShowStudents.jsp").forward(request, response);
			
			//response.sendRedirect("Home.jsp");
			
		}else{
			request.setAttribute("msg", "No Students Found");
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}


			
			
				}
				catch(Exception e){
					e.printStackTrace();
				}
			
		
		
		
		
		
	}


}
