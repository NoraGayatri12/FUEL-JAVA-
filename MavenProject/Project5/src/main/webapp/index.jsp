<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:Arial;
}

body{
background:#eef2f7;
}

.header{
background:#0d6efd;
color:white;
padding:20px;
text-align:center;
font-size:30px;
font-weight:bold;
}

.container{

width:700px;
margin:50px auto;
display:grid;
grid-template-columns:repeat(2,1fr);
gap:20px;

}

.card{

background:white;
padding:30px;
text-align:center;
border-radius:10px;
box-shadow:0px 5px 15px rgba(0,0,0,.15);
transition:.3s;

}

.card:hover{

transform:translateY(-8px);

}

.card a{

text-decoration:none;
font-size:22px;
font-weight:bold;
color:#0d6efd;

}

.footer{

margin-top:40px;
text-align:center;
color:gray;

}

</style>

</head>

<body>

<div class="header">
Employee Management System
</div>

<div class="container">

<div class="card">
<a href="addEmployee.jsp">➕ Add Employee</a>
</div>

<div class="card">
<a href="searchEmployee.jsp">🔍 Search Employee</a>
</div>

<div class="card">
<a href="updateSalary.jsp">💰 Update Salary</a>
</div>

<div class="card">
<a href="deleteEmployee.jsp">🗑 Delete Employee</a>
</div>

<div class="card">
<a href="ListEmployeeServlet">📋 List Employees</a>
</div>

</div>

<div class="footer">
Java Servlet • JDBC • MySQL
</div>

</body>
</html>