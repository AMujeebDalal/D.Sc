

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet2
 */
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("pass").equalsIgnoreCase("few"))
		{
			request.getRequestDispatcher("home.jsp").forward(request,response);
		}
		else 
		{
			request.setAttribute("msg","password not correct");
			request.getRequestDispatcher("index.jsp").forward(request,response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		

}
