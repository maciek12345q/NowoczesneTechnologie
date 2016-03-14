
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
		
			<img src="images/biblio.jpg" alt="" width="720" height="160" />
			
		</div>
		

	
		<div id="navigation">

			
			main menu
			
			<hr />
			
			<a href="forms/helloworld.html" class="navigation">Ogólnie o bibliotece</a><a href="forms/simpleForm.html" class="navigation">Szukaj książki</a><a href="forms/validationform.html" class="navigation">Dodaj ksiazke</a><a href="forms/BookRegistration.html" class="navigation">Zaloguj się do biblioteki</a><a href="forms/registrationform.html" class="navigation">Rejestracja do biblioteki</a>
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
			<td><label for="email">Autor :</label><form:input cssClass="form-control" path="author" /></td>
		</tr>

		<tr>
			<td><FONT color="red"><form:errors
				path="nubmerOfBook" /></FONT></td>
		</tr>
		<tr>
			<td><label for="email">Liczba ksiazek:</label><form:input cssClass="form-control" path="nubmerOfBook" /></td>
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
			<td><label  for="email">Kategoria:</label><form:input cssClass="form-control" path="category" /></td>
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