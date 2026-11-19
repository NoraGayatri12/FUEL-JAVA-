<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.example.model.Student" %>

<%
Student student=(Student)request.getAttribute("student");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>

<style>

body{
    font-family:Arial;
    background:#f2f2f2;
}

.container{

    width:450px;
    margin:40px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 10px gray;

}

h2{

    text-align:center;
    color:#0066cc;

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

</style>

</head>

<body>

<div class="container">

<h2>Edit Student</h2>

<form action="updateStudent" method="post">

<table>

<tr>

<td>ID</td>

<td>

<input type="number"
name="id"
value="<%=student.getId()%>"
readonly>

</td>

</tr>

<tr>

<td>Name</td>

<td>

<input type="text"
name="name"
value="<%=student.getName()%>"
required>

</td>

</tr>

<tr>

<td>Age</td>

<td>

<input type="number"
name="age"
value="<%=student.getAge()%>"
required>

</td>

</tr>

<tr>

<td>City</td>

<td>

<input type="text"
name="city"
value="<%=student.getCity()%>"
required>

</td>

</tr>

<tr>

<td colspan="2">

<input type="submit"
value="Update Student">

</td>

</tr>

</table>

</form>

<br>

<center>

<a href="viewStudent">Back to Student List</a>

</center>

</div>

</body>
</html>