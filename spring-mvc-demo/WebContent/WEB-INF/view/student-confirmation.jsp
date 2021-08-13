<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation page</title>
</head>
<body>

The Student is Confirmed : ${student.firstName} ${student.lastName}

<br></br>

Country : ${student.country}

<br></br>

Favourite language : ${student.favouriteLanguage}

<br></br>

Operating System : 

<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
	<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>