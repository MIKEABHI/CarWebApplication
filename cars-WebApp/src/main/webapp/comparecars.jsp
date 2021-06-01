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
String cat = request.getParameter("cat");
String search1 = request.getParameter("search1");
String search2 = request.getParameter("search2");

CarDao carDao = new CarDao();
ResultSet[] rs = carDao.compareCar(cat, search1, search2);
for(int i=0;i<rs.length;i++)
{
while(rs[i].next()) {
%>
<tr>
<td><% out.print(rs[i].getString("cname")); %></td>
<td><% out.print(rs[i].getString("model")); %></td>
<td><% out.print(rs[i].getString("color")); %></td>
<td><% out.print(rs[i].getString("brand")); %></td>
<td><% out.print(rs[i].getString("company"));%></td>
<td><% out.print(rs[i].getString("myear")); %></td>
</tr>

<%}
}%>


</table>
</body>
</html>