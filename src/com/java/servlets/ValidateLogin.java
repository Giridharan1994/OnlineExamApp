package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateLogin
 */
@WebServlet("/ValidateLogin")
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    String name=request.getParameter("userName");  
	    String pwd=request.getParameter("userPass");
	    
	    if(pwd.equals("admin")){ 
	    	
	    	HttpSession session = request.getSession(true);
	    	session.setAttribute("user", name);
	    	session.setAttribute("password", pwd);
	        /*RequestDispatcher rd=request.getRequestDispatcher("welcomeUser");  
	        rd.forward(request, response); */ 
	    	
	    	response.sendRedirect("welcomeUser");
	    } else{
	    	  out.print("Sorry UserName or Password Error!");  
	    	 RequestDispatcher rd=request.getRequestDispatcher("/LoginPage.html");  
		     rd.include(request, response); 
	    }
	}

}
