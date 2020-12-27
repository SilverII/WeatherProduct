<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}
</style>
</head>
<body>

<script type="text/javascript">
    setInterval(location.reload, 180000)
</script>

<form:form action="/main" method="get" modelAttribute="datamodel">
<c:set var="login" value="${login}"/>
<c:set var="city" value="${city}"/>
<c:set var="temp" value="${temp}"/>
<c:set var="press" value="${pressure}"/>
<c:set var="wind" value="${wind_speed}"/>

<table border="1" cellpadding="5">
        <tr>
            <th>Login</th>
            <th>City</th>
            <th>Temp</th>
            <th>Pressure</th>
            <th>Wind speed</th>
        </tr>
        <tr>
            <td>${login}</td>
            <td>${city}</td>
            <td>${temp}</td>
            <td>${press}</td>
            <td>${wind}</td>
        </tr>
    </table>
    <h3><a href="/changeSetup">Change Settings</a></h3>
</body>
</html>