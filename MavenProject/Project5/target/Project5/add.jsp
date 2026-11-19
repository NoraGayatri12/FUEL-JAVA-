<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#f0f4f8;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container{
    width:420px;
    background:white;
    padding:35px;
    border-radius:12px;
    box-shadow:0 0 15px rgba(0,0,0,0.2);
}

h2{
    text-align:center;
    color:#0d6efd;
    margin-bottom:25px;
}

label{
    font-weight:bold;
}

input[type="number"],
input[type="text"]{
    width:100%;
    padding:10px;
    margin-top:8px;
    margin-bottom:18px;
    border:1px solid #ccc;
    border-radius:6px;
    font-size:16px;
}

input[type="submit"]{
    width:100%;
    padding:12px;
    background:#0d6efd;
    color:white;
    border:none;
    border-radius:6px;
    cursor:pointer;
    font-size:17px;
}

input[type="submit"]:hover{
    background:#0b5ed7;
}

.back{
    display:block;
    text-align:center;
    margin-top:18px;
    text-decoration:none;
    color:#0d6efd;
    font-weight:bold;
}
</style>

</head>
<body>

<div class="container">

<h2>Add Employee</h2>

<form action="AddEmployeeServlet" method="post">

<label>Employee ID</label>
<input type="number" name="id" required>

<label>Employee Name</label>
<input type="text" name="name" required>

<label>Salary</label>
<input type="number" name="salary" required>

<input type="submit" value="Add Employee">

</form>

<a href="index.jsp" class="back">← Back to Home</a>

</div>

</body>
</html>