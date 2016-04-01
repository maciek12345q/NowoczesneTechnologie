<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="<c:url value="/resources/bootstrap.min.css" />" rel="stylesheet">
 <link href="<c:url value="/resources/css.css" />" rel="stylesheet">
 	<link href="<c:url value="/resources/app.css" />" rel="stylesheet">
 <style>
 label {
    padding-left:26px;
    width:125px;
    text-transform: uppercase;
    display:inline-block
}
 </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteka Rzeszow</title>
</head>
<body>
<div id="main">

	
		<div id="top-nav">
		<center>Biblioteka Wojewodzka w Rzeszowie</center>
		</div>
		<div id="login">
		</div>

	
		<div id="header">
		
			<img src="../images/biblio.jpg" alt="" width="720" height="160" />
			
		</div>
		

	
		<div id="navigation">

			
			main menu
			
			<hr />
			
			<a href="helloworld.html" class="navigation">Main Information</a><a href="BookRegistration.html" class="navigation">Add book</a><a href="registrationform.html" class="navigation">Registration Account</a><a href="SearchBook.html" class="navigation">Search book</a>

		</div>
		
<br><br>

		<div id="content">
		
			<h1>Rejestracja konta</h1>
			<p>Prosze wpisac dane do rejestracji konta</p>
			
			
    <form:form method="Post" action="registrationform.html"
	commandName="registration">
	<div class="form-group">
	<table>
		<tr>
			<td>User Name:<FONT color="red"><form:errors
				path="userName" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="userName" cssClass="form-control" /></td>
		</tr>

		<tr>
			<td>Password:<FONT color="red"><form:errors
				path="password" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="password" cssClass="form-control" /></td>
		</tr>

		<tr>
			<td>Confirm Password:<FONT color="red"><form:errors
				path="confirmPassword"  /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="confirmPassword" cssClass="form-control" /></td>
		</tr>

		<tr>
			<td>Email:<FONT color="red"><form:errors path="email" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="email" cssClass="form-control" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" cssClass="btn btn-default" /></td>
		</tr>
	</table>
	<div class="form-group">
</form:form>
</div>

	
		<div id="footer">

			<hr />

	Copyright &copy; 2016 Maciej Grzesiuk | All Rights Reserved

		</div>
</div>
</body>
</html>