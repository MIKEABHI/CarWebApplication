<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.javacode.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center"><font><strong>Car Details</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr>
<td><b>Car Name</b></td>
<td><b>Model</b></td>
<td><b>Color</b></td>
<td><b>Brand</b></td>
<td><b>Company</b></td>
<td><b>Myear</b></td>
</tr>

<% 
CarDao carDao = new CarDao();
ResultSet rs = carDao.showDetail();
while(rs.next()){
%>
<tr>
<td><%=rs.getString("cname") %></td>
<td><%=rs.getString("model") %></td>
<td><%=rs.getString("color") %></td>
<td><%=rs.getString("brand") %></td>
<td><%=rs.getString("company") %></td>
<td><%=rs.getString("myear") %></td>
</tr>

<%}%>


</table>
</body>
</html>