<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<%@ taglib prefix= "form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="update1" method="POST">
<form:input path="id" value="${id}" />
<form:input path="cname" value="${name}"/>
<form:input path="mailid"/>
<form:input path="city"/>
<button type="submit">Update</button>
</form:form>
</body>
</html>
