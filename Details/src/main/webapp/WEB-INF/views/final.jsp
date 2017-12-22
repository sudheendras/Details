<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Final</title>
</head>
<body>
	<div align="center">
		<form:form action="fin" method="post" commandName="finalForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Final Page</h2></td>
                </tr>
                <tr>
                	<td>First Name:</td>
                	<td><form:input path="fn"/></td>
                </tr>
                 <tr>
                    <td>Current Employer:</td>
                    <td><form:input path="ce" /></td>
                </tr>
                <tr>
                	<td>Expected CTC (x,xx,xxx.xx):</td>
                	<td><form:input path="ectc"/></td>
                </tr>
                 <tr>
                	<td>Current CTC (x,xx,xxx.xx):</td>
                	<td><form:input path="cctc"/></td>
                </tr>
                 <tr>
                	<td>Notice Period:</td>
                	<td><form:input path="np"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save &amp Close" /></td>
                </tr>
            </table>
         </form:form>
	</div>
</body>
</html>