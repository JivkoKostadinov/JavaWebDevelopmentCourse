<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<c:set var="version" value="1.2.3"/>
<c:set var="projectName" value="ContainersAndFilters"/>
<c:set var="usr" value="<%= session.getAttribute(\"username\") %>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Hello <c:if test="${usr!=null}">
		, <%= session.getAttribute("username") %>.
		</c:if>
	</h1>
	
	<h10>
		This is <c:out value="${version}"/> with version <c:out value="${projectName}"/>
	</h10>
</body>
</html>