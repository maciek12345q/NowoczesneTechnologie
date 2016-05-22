
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

  <form:form method="Post" action="registrationform.html"
             commandName="registration">
  <div class="form-group">
    <table>
      <tr>
        <td>User Name:<FONT color="red"><form:errors
                path="userName" /></FONT></td>
      </tr>
      <tr>
        <td><form:input path="userName" cssClass="form-control" value="${list.userName}" /></td>
      </tr>

      <tr>
        <td>Password:<FONT color="red"><form:errors
                path="password" /></FONT></td>
      </tr>
      <tr>
        <td><form:password path="password" cssClass="form-control"  value="${list.userPassword}"/></td>
      </tr>

      <tr>
        <td>Confirm Password:<FONT color="red"><form:errors
                path="confirmPassword"  /></FONT></td>
      </tr>
      <tr>
        <td><form:password path="confirmPassword" cssClass="form-control"  /></td>
      </tr>




      <tr>
        <td>Funkcja(administrator itp.):<FONT color="red"><form:errors path="role" /></FONT></td>
      </tr>
      <tr>
        <td><form:input path="role" cssClass="form-control" value="${list.role.role}" /></td>
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