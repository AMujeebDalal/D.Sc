

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Check2
 */
public class Check2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Check2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession s=request.getSession(false);
		response.setContentType("text/html");
		try
		{
		String u=(String)s.getAttribute("username");
	
		out.println("u r logged in "+u);
		ServletContext sc=getServletContext();
		String sm= sc.getInitParameter("some");
		String f= sc.getInitParameter("few");
		out.print("hi user"+" "+u+" "+sm+" "+f);
		
	
		}
		catch(Exception e)
		{
		   response.sendRedirect("Login.html");
		}
		out.println("<a href=home.html>go back</a>");
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
