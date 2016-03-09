<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank as new Web Bank</title>
</head>
<body>
	<form action="HelloForm" method="POST">
		Client <input type="text" name="client" value="${requestScope.client}"> 
		<br />
		 Current amount <input type="text" name="currentAmount" value="${requestScope.currentAmount}"/> 
		 <br /> 
		 Operation <input type="text" name="operation" /> 
		 <br />
		  Amount <input type="text" name="amount" />
		  <br />
		   Currency <input type="text" name="currency" />
		  <br />
		   <input type="submit" value="Submit" />
	</form>
</body>
</html> 
