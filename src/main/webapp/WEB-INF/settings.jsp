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
<form:form action="/changeSetup" method="get" modelAttribute="String">
<table border="1" cellpadding="5">
        <tr>
            <th>City</th>
        </tr>

        <c:forEach items="${gc}" var="gc">
        <tr>
            <td><input type="radio" id="ct" name="City" value="${gc}">${gc}</td>
        </tr>
        </c:forEach>

</table>
<table border="1" cellpadding="5">
        <tr>
            <th>Resourse</th>
        </tr>

        <c:forEach items="${gs}" var="gs">
        <tr>
            <td><input type="radio" id="rs" name="Resource" value="${gs}">${gs}</td>
        </tr>
        </c:forEach>

</table>
<td>
        <a href="/save">Save</a>
</td>
</body>
</html>