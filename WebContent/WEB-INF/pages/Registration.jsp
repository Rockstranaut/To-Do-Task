<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="submitForm" method="POST">
		<label id="empNo">Enter Employee Number</label>
		<input id="empNo" type="number" name="empNo" required>

		<label id="empName">Enter Employee Name</label>
		<input id="empName" type="text" name="empName" required>
		
		<label id="salary">Enter Salary</label>
		<input id="salary" type="number" name="salary" required>
		
		<input type="submit" value="GO">


</form> 

</body>
</html>