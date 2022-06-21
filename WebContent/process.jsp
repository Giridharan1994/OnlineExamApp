<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="person" class="com.java.beans.Person" scope="application"></jsp:useBean>  
 <!-- creates of object of the bean -->
<jsp:setProperty property="*" name="person"/> 
<%-- <jsp:setProperty property="name" name="person" value="<%= request.getParameter("name")%>"/> --%>

Name: <jsp:getProperty property="name" name="person"/></br>
password : <jsp:getProperty property="password" name="person"/></br>
Email:<jsp:getProperty property="email" name="person"/>
</body>
</html>