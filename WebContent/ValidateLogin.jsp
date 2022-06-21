<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page errorPage="error.jsp" %>  
</head>
<body>

<%
		int  n1 = Integer.parseInt(request.getParameter("n1"));
		int  n2 = Integer.parseInt(request.getParameter("n2"));
 	    int n3 = n1/n2;       
 %>
		
<a href="WelcomeUser.jsp">Go to Welcome Page</a>
<%-- Welcome <%= user%> --%>
</body>
</html>