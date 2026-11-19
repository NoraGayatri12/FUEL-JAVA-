
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial;
}

body{
    background:#eef2f7;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container{
    width:400px;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 15px rgba(0,0,0,.2);
}

h2{
    text-align:center;
    color:#dc3545;
    margin-bottom:20px;
}

input{
    width:100%;
    padding:10px;
    margin:10px 0;
    font-size:16px;
}

input[type=submit]{
    background:#dc3545;
    color:white;
    border:none;
    cursor:pointer;
}

a{
    text-decoration:none;
}

</style>

</head>

<body>

<div class="container">

<h2>Delete Employee</h2>

<form action="DeleteEmployeeServlet" method="post">

<input type="number" name="id" placeholder="Enter Employee ID" required>

<input type="submit" value="Delete Employee">

</form>

<br>

<center>
<a href="index.jsp">Back to Home</a>
</center>

</div>

</body>
</html>
