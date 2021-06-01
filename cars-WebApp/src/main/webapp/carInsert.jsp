<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@page import="com.javacode.*"%>
<%@page import="com.Database.CarDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Car Details</title>
</head>
<body>

 <%
 String cname=request.getParameter("cname");
 String model=request.getParameter("model");
 String color=request.getParameter("color");
 String brand=request.getParameter("brand");
 String company=request.getParameter("company");
 String myear=request.getParameter("myear");
 
  CarDetails cars = new CarDetails(cname,model,color,brand,company,myear);
  
  CarDao carDao = new CarDao();
  int status = carDao.insertDetails(cars);
  if (status > 0) {
   out.print("You are successfully registered");
  }
  else 
	  out.print("failed registered");
 %>
</body>
</html>