<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div align="center">
        <form:form action="login" method="post" commandName="log">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Login Page</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><form:input path="user" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="pass" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>