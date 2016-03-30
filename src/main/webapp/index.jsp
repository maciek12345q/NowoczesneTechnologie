<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="<c:url value="/resources/bootstrap.min.css" />" rel="stylesheet">
 <link href="<c:url value="/resources/css.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4, MVC Examples</title>
</head>
<body>
<div id="main">

	
		<div id="top-nav">
		<center>Biblioteka Wojewodzka w Rzeszowie</center>
		</div>
		<div id="login">
		</div>

	
		<div id="header">
		
			<img src="images/biblio.jpg" alt="" width="720" height="160" />
			
		</div>
		



		
		
				<div id="content">
				
			<form:form action="login" method="GET" >
	<table>
	
		<tr>
			<td><input class="btn btn-primary btn-lg" type="submit" value="Zaloguj sie" /></td><td>&nbsp;&nbsp;&nbsp;</td><td><input class="btn btn-primary btn-lg" type="submit" value="Zarejestruj sie" /></td>
		</tr>
		
		
	</table>
</form:form>
	
</div>
		
	

	
		<div id="footer">

			<hr />

	Copyright © 2016 Maciej Grzesiuk | All Rights Reserved

		</div>
</div>
</body>
</html>