

import java.io.*;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check1
 */
public class Check1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Check1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String u=request.getParameter("uname");
		String p=request.getParameter("pass");
		String e=request.getParameter("email");
		PrintWriter out=response.getWriter();
		out.print("username:"+u+" password:"+p+" email:"+e);
	
		/**if(p.equalsIgnoreCase("admin"))
		{
			out.print("successful");
		}
		else
		{
			out.println("Invalid Login");
		}
		String r=" ";
		// TODO Auto-generated method stub
		String u=request.getParameter("uname");
		String p=request.getParameter("pass");
		String c=request.getParameter("country");
		String h[]=request.getParameterValues("hobbies");
		String g=request.getParameter("gender");
		String e=(String)request.getAttribute("email");
		PrintWriter out=response.getWriter();
		for(String i:h)
		{
			r=r+i+",";
		}
		out.print("<table border=1>");
		
		out.print("<tr>");
		out.print("<td>username</td>");
		out.print("<td>password</td>");
		out.print("<td>country</td>");
		out.print("<td>hobbies</td>");
		out.print("<td>gender</td>");
		out.print("<td>email</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>"+u+"</td>");
		out.print("<td>"+p+"</td>");
		out.print("<td>"+c+"</td>");
		out.print("<td>"+r+"</td>");
		out.print("<td>"+g+"</td>");
		out.print("<td>"+e+"</td>");
		out.print("</table>");
	

		response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
