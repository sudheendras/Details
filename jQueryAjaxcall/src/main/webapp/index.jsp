<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>Login</title>
<script>
	$(document).ready(function(){
		 $('#button1').click(function(){
			 $.ajax({
				type: "GET",
				url: "login",
				cache: false,				
				data:'firstName='+$("#user").val(),
				dataType : "json",
			    contentType: "application/json",
				success: function(response){
					console.log(response.no);
					console.log(response.username);
					console.log(response.password);
					$("#result").html(response.no);
					$("#result").append(response.username);
					$("#result").append(response.password);
				},
				error: function(){						
					alert('Error while request..');
				}
			});
		 });	 
		$('#ibutton').click(function(){
			var obj = { "ino":$("#ino").val(),"iuser":$("#iuser").val(), "ipass":$("#ipass").val()}; // javascript object
			var myJSON = JSON.stringify(obj);
			alert(myJSON);
			$.ajax({
				type:"POST",
				url:"insert",
				cache:false,
				data:{ test : JSON.stringify({ "ino":$("#ino").val(),"iuser":$("#iuser").val(), "ipass":$("#ipass").val()})},
				dataType : "json",
			    contentType: "application/json",
				success: function(response){
					console.log(response);
					$("#result").html(response);
				},
				error:function(){
					alert('Error while request..');
				}
			});
		});
	});
</script>
</head>
<body>
	<div align="center">
        <form>
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Login Page</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td><td><input type="text" id="user" /></td>
                    <td colspan="2" align="center"><button id="button1" type="button">Fetch</button></td>  
                </tr>
            </table>
        </form>
        <!-- <form name="LoginForm">
        	<table border="0">
        		<tr>
                	<td>No:</td><td><input type="text" id="ino"/></td>
                	<td>User Name:</td><td><input type="text" id="iuser"/></td>
                	<td>Password:</td><td><input type="text" id="ipass"/></td>
                	<td><button id="ibutton" type="button">Insert</button></td>
                </tr>
        	</table>
        </form> -->
        <div id="result"></div>
    </div>
</body>
</html>