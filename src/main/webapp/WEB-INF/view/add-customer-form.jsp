<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="/add-customer-style.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
</head>
<body>

 <form:form method="POST" modelAttribute="customer" action="saveCustomer">
 
 <form:hidden path="id"/>
<table>

<tbody>

<tr>
			<td><label>First Name:</label></td>
            <td><form:input path="firstName"/></td>
</tr>
<tr>
			<td><label>Last Name: </label></td>
			<td><form:input path="lastName"></form:input></td>
</tr>
<tr>
			<td><label>Email: </label></td>
			<td><form:input path="email"></form:input></td>
</tr>
<tr>
			<td><label></label></td>
			<td><input type="submit" value="Save"></td>
</tr>
</tbody></table>
		

</form:form>
</body>
</html>