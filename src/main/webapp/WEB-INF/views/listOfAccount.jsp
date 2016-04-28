
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
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

	<div style="text-align:right;margin-right:80px;"><a href="<c:url value="/logout" />">Wyloguj sie</a>

		<sec:authorize access="hasRole('ROLE_ADMIN')">
		&nbsp;&nbsp;<a href="<c:url value="/admin_panel" />">PanelAdministratora</a>
	</div>
	</sec:authorize>
	<sec:authorize access="hasRole('ROLE_USER')">
</div>
</sec:authorize>
	
		<div id="navigation">

			
			main menu
			
			<hr />

			<a href="helloworld.html" class="navigation">Main Information</a><a href="BookRegistration.html" class="navigation">Add book</a><a href="/forms/listOfAccount.html" class="navigation">List of Account</a><a href="sendEmail.html" class="navigation">SendEmail</a><a href="registrationform.html" class="navigation">Registration Account</a><a href="SearchBook.html" class="navigation">Search book</a>

		</div>
		
<br><br>

		<div id="content">
		
			<h1>Szukanie ksiazki</h1>
			<p>Prosze skorzystac z ponizszego formularza aby znalesc interesujaco cie pozycje.</p>
			
			
     <form:form class="form-inline"  method="post" action="listOfAccount.html" role="form" commandName="listOfAccount">
  <div class="form-group">
   <table>
	
		<tr>
			<td><input cssClass="btn btn-default" type="submit" value="Pokaz uzytkownikow" /></td>
		</tr>
		
	</table>
	</div>
</form:form>

		 <table class="table table-bordered">
		  <thead>
      <tr>
        <th>userName</th>
        <th>userPassword</th>
        <th>Type of user</th>
      </tr>
    </thead>
    <tbody>
	<c:forEach var="list" items="${lists}" varStatus="status">
	<tr>
    <td><c:out value="${list.userName}"/></td>
    <td><c:out value="${list.userPassword}"/></td>
    <td><c:out value="${list.role.role}"/></td>
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