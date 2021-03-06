package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.AppLogic;
import models.InsertData;

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
		
		InsertData data=new InsertData();
		data.setUsername(request.getParameter("uname"));
		data.setPassword(request.getParameter("pname"));
		data.setEmail(request.getParameter("email"));
		
		
	int i=	AppLogic.insertData(data);
	if(i>0){
		request.setAttribute("msg", "Succesfully Registered..please login once");
		request.getRequestDispatcher("login.jsp").forward(request, response);
		//response.sendRedirect("Home.jsp");
		
	}else{
		request.setAttribute("msg", "Not Registered");
		request.getRequestDispatcher("Register.jsp").forward(request, response);
	}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
