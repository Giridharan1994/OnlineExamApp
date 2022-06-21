<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
</head>
<body>
<%!   // declaration tag
		Connection con;
		Statement stmt;
		ResultSet rs;
	%>


<% // scriptlet code
try{
Class.forName("com.mysql.jdbc.Driver");

//System.out.println("registered the driver");

Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","root");
System.out.println("connection created");
Statement stmt = con.createStatement();
String sql ="select * from employee";
ResultSet rs = stmt.executeQuery(sql);
%>

<table border='1' style='width:100%'>
<tr><td>EmpId</td><td>EmpName</td><td>empAge</td><td>EmpSal</td></tr>
	
	<% while (rs.next()){ %>
			<tr>
			<td><%= rs.getInt(1)%></td>
			<td><%= rs.getString(2)%></td>
			<td><%= rs.getInt(3)%></td>
			<td><%= rs.getInt(4)%></td>
			
			</tr>

	<% } %>
	</table>
	
	<%
		rs.close();
		stmt.close();
		con.close();
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
	%>
</body>
</html>