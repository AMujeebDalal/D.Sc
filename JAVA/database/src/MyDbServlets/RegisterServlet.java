package MyDbServlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			
			PreparedStatement ps=con.prepareStatement("insert into login(username,password,email) values(?,?,?) ");
			ps.setString(1, request.getParameter("uname"));
			ps.setString(2, request.getParameter("pname"));
			ps.setString(3, request.getParameter("email"));
			
			
		int rs=	ps.executeUpdate();
		if(rs>0){
			request.setAttribute("msg", "Succesfully Registered..please login once");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			//response.sendRedirect("Home.jsp");
			
		}else{
			request.setAttribute("msg", "Not changed");
			request.getRequestDispatcher("Home.jsp").forward(request, response);
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
