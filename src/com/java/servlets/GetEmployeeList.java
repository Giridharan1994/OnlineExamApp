package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetEmployeeList
 */
@WebServlet("/GetEmployeeList")
public class GetEmployeeList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeList() {
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
		
        ServletContext context=getServletContext();
		
		String driver = context.getInitParameter("dname");
		String username = context.getInitParameter("userName");
		String pwd = context.getInitParameter("password");
		String url = context.getInitParameter("url");
		
		try {
			Class.forName(driver);
			System.out.println("registered the driver");
			
			Connection con=DriverManager.getConnection(  
						url,username,pwd);
			System.out.println("connection created");
			
			Statement stmt=con.createStatement();
			String sql ="select * from employee";
			ResultSet rs = stmt.executeQuery(sql);
			
			out.print("<html><body>");
			out.print("<table border='1' style='width:100%'>");
			out.print("<tr><td>EmpId</td><td>EmpName</td><td>empAge</td><td>EmpSal</td></tr>");
			while(rs.next()){
				out.print("<tr>");
				//System.out.println(rs.getInt(1) + " ==" + rs.getString(2) + "==" + rs.getInt(3));
				out.print("<td>"+rs.getInt(1)+"</td>");
				out.print("<td>"+rs.getString(2)+"</td>");
				out.print("<td>"+rs.getInt(3)+"</td>");
				out.print("<td>"+rs.getInt(4)+"</td>");
				out.print("</tr>");
			}
			out.print("</table></body></html>");
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
