<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
	<table>
		<!-- set action to appropriate controller's name  -->
		<form:form modelAttribute="user" action="addUser">
			<tr>
				<td>Name: <form:input path="name" /></td>
				<form:errors path="name" cssStyle="color:red;"></form:errors>
			</tr>
			<tr>
				<td>Email: <form:input path="email" /></td>
				<form:errors path="*" cssStyle="color:red;"></form:errors>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</form:form>
	</table>
</body>
</html>