package MyDbServlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Driver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String u=	request.getParameter("uname");
	String p=	request.getParameter("pname");
		try{
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	
	PreparedStatement ps=con.prepareStatement("select * from login where username=? and password=?");
	ps.setString(1, u);
	ps.setString(2, p);
	
	
ResultSet rs=	ps.executeQuery();
if(rs.next()){
	
	
	HttpSession s=request.getSession(true);
	s.setAttribute("username",u);
	
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
