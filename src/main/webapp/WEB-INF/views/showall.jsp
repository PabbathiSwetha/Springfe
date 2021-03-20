<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<thead>
<tr><th>Id</th><th>Name</th><th>Mail</th><th>City</th>
</tr>
</thead>
<tbody>
<c:forEach items="${customers}" var="c">
<tr><td>${c.id}</td><td>${c.cname}</td><td>${c.mailid}</td><td>${c.city}</td>
<td><a href="update?id=${c.id}&name=${c.cname}">Update</a></td><td><a href="delete?id=${c.id}&name=${c.cname}">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="add">Click here to add Customer</a>
</body>
</html>