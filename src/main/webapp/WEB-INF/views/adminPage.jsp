
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
    &nbsp;&nbsp;<a href="<c:url value="/forms/helloworld.html" />">Powrot do strony glownej</a>
  </div>
  </sec:authorize>
  <sec:authorize access="hasRole('ROLE_USER')">
</div>
</sec:authorize>


<br><br>

<div id="content">
<h1 style="text-align: center;">Panel Administratora</h1>

  <table class="table table-bordered">
    <thead>
    <tr>
      <th>userName</th>
      <th>userPassword</th>
      <th>Type of user</th>
      <th>Usun uzytkownika</th>
      <th>Wyslij wiadomosc</th>
      <th>Edytuj dane</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="list" items="${lists}" varStatus="status">
      <tr>
        <td><c:out value="${list.userName}"/></td>
        <td><c:out value="${list.userPassword}"/></td>
        <td><c:out value="${list.role.role}"/></td>
        <td><a href="/admin_panel?usun=1&id=${list.id}">Usun uzytkownika</a></td>
        <td><a href="/admin_panel?wyslij=1&id=${list.id}">Wyslij wiadomosc</a></td>
        <td><a href="/admin_panel?edytuj=1&id=${list.id}">Edytuj wiadomosc</a></td>
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