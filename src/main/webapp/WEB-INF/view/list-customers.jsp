<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Customers</title>

<link type="text/css" rel="stylesheet" href="/style.css">
</head>
<body>
	<div id ="wrapper">
		<div id="header">
			<h2>Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		
		
		<input type="button" value="Add customer" onclick="window.location.href='showFormForAdd';return false;">
		
		
		<table>
			<tr>
				<th>Customer Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>	
			
			</tr>
			
			<c:forEach var="tempCustomer" items="${customers}">
			<!-- Construct a delete link with customerId -->
			
			<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${tempCustomer.id}"></c:param>
			</c:url>
			<tr>
				<td>${tempCustomer.id}</td>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td><a href="${deleteLink}">Delete</a></td>
			</tr>
			</c:forEach>
			
		</table>
		
	</div>
</body>
</html>