<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Title</title>
</head>
<body>
     <h3> Current user is : <%= request.getSession().getAttribute("currentUser") %>></h3>
     
     <h4> Another current user is : <%= application.getAttribute("currentUser") %>></h4>
     
     <h5> Project name is : <%=application.getContextPath()%></h5>
     
     <h6> Project version name is : <%=application.getMajorVersion()%></h6>
</body>
</html>