package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")   // annotation
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html"); 
		
		PrintWriter out=response.getWriter(); 
		out.print("<html><body>");
		out.print("<h2>Welcome to the Httpservlets..</h2>");
		ServletConfig config=getServletConfig(); 
		String user = config.getInitParameter("userName");
		out.print("<h2>Init param values="+user+"</h2>");
		
		ServletContext context=getServletContext();
		
		String driver = context.getInitParameter("dname");
		String username = context.getInitParameter("userName");
		String pwd = context.getInitParameter("password");
		
		out.print("<h2>context param values="+driver+"</h2>");
		out.print("<h2>context param values="+username+"</h2>");
		out.print("<h2>context param values="+pwd+"</h2>");
		
		
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
