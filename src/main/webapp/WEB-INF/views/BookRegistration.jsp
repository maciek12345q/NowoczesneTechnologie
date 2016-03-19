
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="<c:url value="/resources/bootstrap.min.css" />" rel="stylesheet">
 <link href="<c:url value="/resources/css.css" />" rel="stylesheet">
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
			
			<a href="BookRegistration.html" class="navigation">Add book</a><a href="registrationform.html" class="navigation">Registration Account</a><a href="loginform.html" class="navigation">Login Form</a><a href="SearchBook.html" class="navigation">Search book</a>
		</div>
		
<br><br>

		<div id="content">
		
			<h1>Dodawanie nowej ksiazki</h1>
			<p>Prosze skorzystac z ponizszego formularza aby dodac interesujaco pozycje do ksiegozbioru</p>
			
			
     <form:form class="form-inline"  method="post" action="BookRegistration.html" role="form" commandName="bookRegistration">
  <div class="form-group">
   <table>
   
		<tr>
			<td><FONT color="red"><form:errors
				path="title" /></FONT></td>
		</tr>
		<tr>
			<td><label for="title">Tytul ksiazki:</label><form:input cssClass="form-control" path="title" /></td>
		</tr>

		<tr>
			<td><FONT color="red"><form:errors
				path="author" /></FONT></td>
		</tr>
		<tr>
			<td><label for="author">Autor :</label><form:input cssClass="form-control" path="author" /></td>
		</tr>

		<tr>
			<td><FONT color="red"><form:errors
				path="numberOfBook" /></FONT></td>
		</tr>
		<tr>
			<td><label for="numberOfBook">Liczba ksiazek:</label><form:input cssClass="form-control" path="numberOfBook" /></td>
		</tr>

		<tr>
			<td><FONT color="red"><form:errors path="category" /></FONT></td>
		</tr>
		
		
		<tr>
			<td><label for="nsbn">nsbn:</label><form:input cssClass="form-control" path="nsbn" /></td>
		</tr>

		<tr>
			<td><FONT color="red"><form:errors path="nsbn" /></FONT></td>
		</tr>
		
		<tr>
			<td><label  for="category">Kategoria:</label><form:input cssClass="form-control" path="category" /></td>
		</tr>
		<tr>
			<td><input cssClass="btn btn-default" type="submit" value="Dodaj ksiazke" /></td>
		</tr>
	</table>
	</div>
</form:form>
</div>

	
		<div id="footer">

			<hr />

	Copyright © 2016 Maciej Grzesiuk | All Rights Reserved

		</div>
</div>
</body>
</html>