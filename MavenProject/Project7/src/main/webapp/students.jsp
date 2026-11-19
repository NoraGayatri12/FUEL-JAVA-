<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.example.model.Student" %>

<%
List<Student> studentList = (List<Student>)request.getAttribute("studentList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>

<style>

body{
    font-family:Arial;
    background:#f2f2f2;
}

.container{
    width:900px;
    margin:40px auto;
    background:white;
    padding:20px;
    border-radius:10px;
    box-shadow:0 0 10px gray;
}

h2{
    text-align:center;
    color:#0066cc;
}

table{
    width:100%;
    border-collapse:collapse;
}

table,th,td{
    border:1px solid #ccc;
}

th{
    background:#0066cc;
    color:white;
    padding:12px;
}

td{
    padding:10px;
    text-align:center;
}

.edit{
    background:green;
    color:white;
    padding:6px 12px;
    text-decoration:none;
    border-radius:5px;
}

.delete{
    background:red;
    color:white;
    padding:6px 12px;
    text-decoration:none;
    border-radius:5px;
}

.home{
    text-decoration:none;
    color:#0066cc;
    font-weight:bold;
}

</style>

</head>

<body>

<div class="container">

<h2>Student Details</h2>

<table>

<tr>
<th>ID</th>
<th>Name</th>
<th>Age</th>
<th>City</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<%

if(studentList!=null){

for(Student s:studentList){

%>

<tr>

<td><%=s.getId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getAge()%></td>
<td><%=s.getCity()%></td>

<td>
<a class="edit"
href="editStudent?id=<%=s.getId()%>">
Edit
</a>
</td>

<td>
<a class="delete"
href="deleteStudent?id=<%=s.getId()%>"
onclick="return confirm('Delete this student?')">
Delete
</a>
</td>

</tr>

<%

}

}

%>

</table>

<br>

<center>

<a class="home" href="register.jsp">
Register New Student
</a>

&nbsp;&nbsp;&nbsp;

<a class="home" href="index.jsp">
Home
</a>

</center>

</div>

</body>
</html>