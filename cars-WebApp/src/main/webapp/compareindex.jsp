<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method="post" action="comparecars.jsp" >
  <label for="cars">Choose a car:</label>
  <select name="cat" id="cat">
      <option value="myear">myear</option>
      <option value="color">color</option>
      <option value="brand">brand</option>
      <option value="model">model</option>
      <option value="company">company</option>
  </select>
Car 1:<b>
<input type="text" name="search1">
</b>
 Car 2:<b>
<input type="text" name="search2">
</b>
Show cars :<b>
<input type="submit" value="submit">
</b>
</form>

</body>
</html>