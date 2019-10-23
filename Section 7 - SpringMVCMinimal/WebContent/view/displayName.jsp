<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Name</title>
</head>
<body>
	Current datetime: ${date}<br>
	<%-- Hello <%= request.getAttribute("firstName") %> --%>
	Hello ${firstName}
	______________________<br>
	List of team members:<br>
	<c:forEach var="temp" items="${team}">
		${temp}<br>
	</c:forEach>
</body>
</html>