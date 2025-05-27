<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Personal Details</title>
<meta charset="UTF-8">
</head>
<body>
	<div style="
    font-family: 'Segoe UI', Arial, sans-serif;
    font-size: 1.1em;
    max-width: 600px;
    margin: 20px auto;
    padding: 20px;
    border-radius: 8px;
    background: #f8f9fa;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
">
    <h3 style="
        color: #2c3e50;
        border-bottom: 2px solid #3498db;
        padding-bottom: 8px;
        margin-top: 0;
    ">
       Registration Successfully
    </h3>
    <div style="
        display: grid;
        grid-template-columns: max-content 1fr;
        gap: 12px 16px;
        align-items: center;
    ">
        <p style="margin: 0; font-weight: 600; color: #555;">Name:</p>
        <p style="margin: 0;">${person.fulName}</p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Email:</p>
        <p style="margin: 0;">${person.email}</p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Birth Date:</p>
        <p style="margin: 0;">${person.birthDate}</p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Age:</p>
        <p style="margin: 0;">${person.age}</p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Gender:</p>
        <p style="margin: 0;">${person.gender}</p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Marital Status:</p>
        <p style="margin: 0;">${person.maritalStatus}</p>
    </div>
</div>
        <a href="views/RegistrationForm.jsp"  style="padding:10px 15px; 
        background:#3498db; color:white; 
        text-decoration:none; 
        border-radius:5px;" >Registration Page
       </a>
</body>
</html>