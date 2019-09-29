<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form"
    prefix="sf"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Save Page</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
</head>
<body>
 	<p>
 		TASK ID: <b>No validation.</b><br/>
 		TASK NAME: <b>Size 3-20, Pattern: [a-z-A-Z]*</b><br/>
 		STATUS:<b>Numeric.Minimum 15000/-</b><br/>
 		<!-- Age: <b>Range 18-60</b><br/>
 		Contact No: <b>NotNull, NotBlank, Pattern: [0-9]*</b><br/>
 		Email: <b>Not Null, NotBlank, Email</b><br/> -->
 	</p>
    <sf:form method="POST" commandName="emp" action="submitForm">
        <table>
            <tr>
                <td>Task ID:</td>
                <td><sf:input path="empNo" /></td>
                <td><sf:errors path="empNo" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Task Name:</td>
                <td><sf:input path="empName" /></td>
                <td><sf:errors path="empName" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Task Status:</td>
                <td><sf:input path="empSal" /></td>
                <td><sf:errors path="empSal" cssClass="error" /></td>
            </tr>
            <%-- <tr>
            	<td>Contact Number:</td>
                <td><sf:input path="contactNo" /></td>
                <td><sf:errors path="contactNo" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Employee Email:</td>
                <td><sf:input path="email" /></td>
                <td><sf:errors path="email" cssClass="error" /></td>
            </tr> --%>
            <%-- <tr>
                <td>Employee Role:</td>
                <td><springForm:select path="role">
                        <springForm:option value="" label="Select Role" />
                        <springForm:option value="ceo" label="CEO" />
                        <springForm:option value="developer" label="Developer" />
                        <springForm:option value="manager" label="Manager" />
                    </springForm:select></td>
                <td><springForm:errors path="role" cssClass="error" /></td>
            </tr> --%>
            <tr>
                <td colspan="3"><input type="submit" value="Save"></td>
            </tr>
        </table>
 
    </sf:form>
 
</body>
</html>



