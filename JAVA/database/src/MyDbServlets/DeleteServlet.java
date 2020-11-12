package MyDbServlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s=request.getSession(false);
	String u=(String)	s.getAttribute("username");
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			
			PreparedStatement ps=con.prepareStatement("delete from login where username=?");
			ps.setString(1, u);
			
			
			
	int i=	ps.executeUpdate();
		if(i>0){
			request.setAttribute("msg", "username "+u+" deleted");
			request.getRequestDispatcher("Home.jsp").forward(request, response);
			
			
			//response.sendRedirect("Home.jsp");
			
		}else{
			request.setAttribute("msg", "username and password not correct");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}


			
			
				}
				catch(Exception e){
					e.printStackTrace();
				}
			
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
