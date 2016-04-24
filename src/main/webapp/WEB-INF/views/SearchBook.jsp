
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
		
<div style="text-align:right;margin-right:80px;"><a href="<c:url value="/logout" />">Wyloguj sie</a></div>
	
		<div id="navigation">

			
			main menu
			
			<hr />
			
		<a href="helloworld.html" class="navigation">Main Information</a><a href="BookRegistration.html" class="navigation">Add book</a><a href="registrationform.html" class="navigation">Registration Account</a><a href="sendEmail.html" class="navigation">SendEmail</a><a href="SearchBook.html" class="navigation">Search book</a>

		</div>
		
<br><br>

		<div id="content">
		
			<h1>Szukanie ksiazki</h1>
			<p>Prosze skorzystac z ponizszego formularza aby znalesc interesujaco cie pozycje.</p>
			
			
     <form:form class="form-inline"  method="post" action="SearchBook.html" role="form" commandName="searchBook">
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
			<td><input cssClass="btn btn-default" type="submit" value="Szukaj ksiazki" /></td>
		</tr>
		
	</table>
	</div>
</form:form>

		 <table class="table table-bordered">
		  <thead>
      <tr>
        <th>Title</th>
        <th>Author</th>
        <th>nsbn</th>
        <th>nubmer of book</th>
        <th>Buy</th>
      </tr>
    </thead>
    <tbody>
	<c:forEach var="list" items="${lists}" varStatus="status">
	<tr>
    <td><c:out value="${list.title}"/></td>
    <td><c:out value="${list.author}"/></td>
    <td><c:out value="${list.nsbn}"/></td>
    <td><c:out value="${list.numberOfBook}"/></td>
    <td> <form:form action="BuyBook.html?id=${list.id}" method="POST"><input type="submit" value="Buy it"/></form:form></td>
    </tr>
    </c:forEach>
	</tbody>
	</table>
</div>

	
		<div id="footer">

			<hr />

		Copyright &copy; 2016 Maciej Grzesiuk | All Rights Reserved

		</div>
</div>
</body>
</html>