<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>User Detail</h2>
  <table class="table">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Street Address 1</th>
        <th>Street Address 2</th>
        <th>City</th>
        <th>State</th>
        <th>Postal Code</th>
        <th>Phone 1</th>
        <th>Phone 2</th>
        <th>Credit limit</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${fname}</td>
        <td>${lname}</td>
        <td>${a1}</td>
        <td>${a2}</td>
        <td>${city}</td>
        <td>${state}</td>
        <td>${pc}</td>
        <td>${phone1}</td>
        <td>${phone2}</td>
        <td>${credit}</td>
        <td>${email}</td>
      </tr>
    </tbody>
</body>
</html>