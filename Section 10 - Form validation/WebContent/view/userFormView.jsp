<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User form</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
	<h4>Submit your information</h4>
	<hr>
	<form:form action="displayUserInfo" modelAttribute="user">
Name:<form:input path="name" placeholder="Enter name" required="true" /><br>
	<form:errors path="*" cssStyle="color:red"/>
		<br>
		Gender:Male <form:radiobutton path="gender" value="male"
			required="true" />
	   Female <form:radiobutton path="gender" value="female"
			required="true" />
		<br>

Country: <form:select path="country" required="true">
			<form:option value="Serbia"></form:option>
			<form:option value="USA" label="United States"></form:option>
			<form:option value="Germany"></form:option>
			<form:option value="Russia"></form:option>
		</form:select>
		<br>
Introduction:		<form:textarea path="introduction" required="true" />
		<br>
		<!-- form options also can be used - similar logics as for radiobutton/radiobuttons -->
Visited countries:	Hungary	<form:checkbox path="visitedCountries"
			value="Hungary" />
		Austria <form:checkbox path="visitedCountries" value="Austria" />
		Czech Republic <form:checkbox path="visitedCountries"
			value="Czech Republic" />
		Greece <form:checkbox path="visitedCountries" value="Greece" />
		Germany <form:checkbox path="visitedCountries" value="Germany" />
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>