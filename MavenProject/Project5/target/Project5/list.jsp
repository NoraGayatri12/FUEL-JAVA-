
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#eef2f7;
}

.container{
    width:80%;
    margin:40px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0px 0px 15px rgba(0,0,0,0.2);
}

h2{
    text-align:center;
    color:#0d6efd;
    margin-bottom:20px;
}

table{
    width:100%;
    border-collapse:collapse;
}

th{
    background:#0d6efd;
    color:white;
    padding:12px;
}

td{
    padding:12px;
    text-align:center;
    border:1px solid #ddd;
}

tr:nth-child(even){
    background:#f2f2f2;
}

tr:hover{
    background:#e8f0fe;
}

.back{
    text-align:center;
    margin-top:20px;
}

.back a{
    text-decoration:none;
    color:#0d6efd;
    font-weight:bold;
}

</style>

</head>

<body>

<div class="container">

<h2>Employee List</h2>

<table>

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Salary</th>
</tr>

<%

Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

try{

    Class.forName("com.mysql.cj.jdbc.Driver");

    con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Fullstackjava",
            "root",
            "Victus@10");

    String sql = "SELECT * FROM `Employee Management System`";

    ps = con.prepareStatement(sql);

    rs = ps.executeQuery();

    while(rs.next()){

%>

<tr>

<td><%= rs.getInt("Id") %></td>

<td><%= rs.getString("Name") %></td>

<td><%= rs.getInt("Salary") %></td>

</tr>

<%

    }

}catch(Exception e){

    out.println("<tr><td colspan='3'>"+e.getMessage()+"</td></tr>");

}finally{

    if(rs!=null) rs.close();
    if(ps!=null) ps.close();
    if(con!=null) con.close();

}

%>

</table>

<div class="back">
<a href="index.jsp">⬅ Back to Home</a>
</div>

</div>

</body>
</html>
