<%@ page import="java.util.*" %>
<%@ taglib prefix="ct" tagdir="/WEB-INF/Tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><ct:Header title="Course page"/></title>
</head>
<body>
   <h2><%= new Date()%></h2>
<table border ="Solid Black">
 <thead>
      <tr>
          <th>Model</th>
          <th>4x4</th> 
      </tr>
 </thead>
</table>
<ct:Footer/>
</body>
</html>