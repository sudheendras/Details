<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Details</title>
</head>
<body>
	<div align="center">
        <form:form action="pers" method="post" commandName="pers">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Personal Page</h2></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><form:input path="fn" /></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><form:input path="ln" /></td>
                </tr>
                <tr>
                    <td>Father's Full Name:</td>
                    <td><form:input path="ffn" /></td>
                </tr>
                <tr>
                    <td>Mother's Full Name:</td>
                    <td><form:input path="mfn" /></td>
                </tr>
                <tr>
                    <td>Phone No:</td>
                    <td><form:input path="pno" /></td>
                </tr>
                <tr>
                    <td>email Id:</td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save &amp Close" name="saveclose"/>&nbsp;&nbsp;&nbsp;<input type="submit" value="Save &amp Next" name="savenext"/></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>