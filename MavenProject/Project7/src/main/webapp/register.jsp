<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#f2f2f2;
}

.container{
    width:500px;
    margin:40px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 10px gray;
}

h2{
    text-align:center;
    color:#0066cc;
    margin-bottom:20px;
}

table{
    width:100%;
}

td{
    padding:10px;
}

input[type=text],
input[type=number]{

    width:100%;
    padding:10px;
    border:1px solid #ccc;
    border-radius:5px;
    font-size:16px;

}

input[type=submit]{

    width:100%;
    padding:12px;
    background:#0066cc;
    color:white;
    border:none;
    border-radius:5px;
    font-size:18px;
    cursor:pointer;

}

input[type=submit]:hover{
    background:#004a99;
}

a{
    text-decoration:none;
    color:#0066cc;
    font-weight:bold;
}

.message{
    text-align:center;
    color:red;
    margin-bottom:15px;
}

</style>

</head>
<body>

<div class="container">

<h2>Student Registration Form</h2>

<%
String message = (String)request.getAttribute("message");
if(message != null){
%>

<div class="message">
    <%= message %>
</div>

<%
}
%>

<form action="addStudent" method="post">

<table>

<tr>
    <td>Student ID</td>
    <td>
        <input type="number" name="id" required>
    </td>
</tr>

<tr>
    <td>Student Name</td>
    <td>
        <input type="text" name="name" required>
    </td>
</tr>

<tr>
    <td>Age</td>
    <td>
        <input type="number" name="age" required>
    </td>
</tr>

<tr>
    <td>City</td>
    <td>
        <input type="text" name="city" required>
    </td>
</tr>

<tr>
    <td colspan="2">
        <input type="submit" value="Register Student">
    </td>
</tr>

</table>

</form>

<br>

<center>

<a href="index.jsp">Home</a>

&nbsp;&nbsp;&nbsp;&nbsp;

<a href="viewStudent">View Students</a>

</center>

</div>

</body>
</html>