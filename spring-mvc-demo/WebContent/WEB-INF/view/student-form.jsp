<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		FirstName : <form:input path="firstName"/>
		<br></br>
		
		Last Name : <form:input path="lastName"/>
		<br></br>
		
		Country : <form:select path="country">
<%-- 			<form:options items="${theCountryOptions}"/>
 --%>	
		<form:options items="${student.countryOptions}"/>
		</form:select>
		<%-- 	<form:option value="India" label="India"></form:option>
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="US" label="US"></form:option>
			<form:option value="UK" label="UK"></form:option>
			<form:option value="UAE" label="UAE"></form:option>
			<form:option value="Australia" label="Australia"></form:option>
			<form:option value="NewZeland" label="NewZeland"></form:option> --%>
		<br></br>
		
		Favourite Language:
			<form:radiobuttons path="favouriteLanguage" items="${student.favoriteLanguageOptions}"/>
			<%-- Java <form:radiobutton path="favouriteLanguage" value="Java"/>
			C# <form:radiobutton path="favouriteLanguage" value="C#"/>
			PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
			Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
			Python <form:radiobutton path="favouriteLanguage" value="Python"/> --%>
		
		<br></br>
			
		Operating System : 
			Linux <form:checkbox path="operatingSystem" value="Linux"/>
			Mac OS <form:checkbox path="operatingSystem" value="Mac OS"/>
			Ms Windows <form:checkbox path="operatingSystem" value="Ms Windows"/>
			
			
		<input type="submit" value="submit">
		
	</form:form>
	
	
</body>
</html>