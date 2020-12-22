<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentication</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}
</style>
</head>
<body>
<form:form action="Auth" method="post" modelAttribute="lgpw">
<table>
  <tr>
    <td>Login: </td>
    <td><form:input path="login" /></td>
  </tr>
  <tr>
    <td>Password: </td>
    <td><form:input path="password" /></td>
   </tr>
   <tr>
     <td colspan="2"><input type="submit" value="Auth"></td>
   </tr>
</table>
</body>
</html>