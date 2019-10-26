<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
Name: ${user.name}<br>
Gender: ${user.gender}<br>
Country: ${user.country}<br>
Introduction: ${user.introduction}<br>
Visited countries: 
<ul>
<c:forEach items="${user.visitedCountries}" var="country">
<li>${country}</li>
</c:forEach>
</ul>
</body>
</html>