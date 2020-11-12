

import java.io.*;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check
 */
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String u=request.getParameter("uname");
		String p=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		/**response.sendRedirect("Check1");
		RequestDispatcher rd=request.getRequestDispatcher("Check1");
		rd.forward(request,response);
		request.setAttribute("email","abcd@example.com");
		String r=" ";
		 
		String u=request.getParameter("uname");
		String p=request.getParameter("pass");
		String c=request.getParameter("country");
		String h[]=request.getParameterValues("hobbies");
		String g=request.getParameter("gender");
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
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>"+u+"</td>");
		out.print("<td>"+p+"</td>");
		out.print("<td>"+c+"</td>");
		out.print("<td>"+r+"</td>");
		out.print("<td>"+g+"</td>");
		out.print("</table>");
	*/
		if(u.equalsIgnoreCase("admin") && p.equalsIgnoreCase("admin"))
		{
			
			out.print("<form action=Check1>");
			out.print("<input type=hidden name=uname value="+u+">");
			out.print("<input type=hidden name=pass value="+p+">");
			out.print("Email<input type=text name=email>");
			out.print("<input type=submit>");
			out.print("</form>");
		}
		else
		{
			response.sendRedirect("login.html");
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}


}
