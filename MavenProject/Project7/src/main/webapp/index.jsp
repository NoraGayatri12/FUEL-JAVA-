<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration System</title>

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
    margin:80px auto;
    background:white;
    padding:40px;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
    text-align:center;

}

h1{

    color:#0066cc;
    margin-bottom:20px;

}

p{

    margin-bottom:30px;
    color:#555;

}

.btn{

    width:250px;
    padding:15px;
    margin:10px;
    font-size:18px;
    background:#0066cc;
    color:white;
    border:none;
    border-radius:5px;
    cursor:pointer;

}

.btn:hover{

    background:#004c99;

}

a{

    text-decoration:none;

}

.footer{

    margin-top:25px;
    color:gray;
    font-size:14px;

}

</style>

</head>
<body>

<div class="container">

<h1>Student Registration System</h1>

<p>JSP | Servlet | JDBC | DAO | MySQL</p>

<a href="register.jsp">
<button class="btn">Register Student</button>
</a>

<br>

<a href="viewStudent">
<button class="btn">View Students</button>
</a>

<div class="footer">

<hr><br>

Developed using Java Web Technology

</div>

</div>

</body>
</html>