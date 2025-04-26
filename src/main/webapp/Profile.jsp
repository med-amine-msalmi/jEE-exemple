<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="models.Person" %>
<!DOCTYPE html>
<html>
<head>
<title>Personal Detailsll</title>
<meta charset="UTF-8">
</head>
<body>
<%
	Person newperson=(Person) request.getAttribute("person");
%>
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
        Personal Details
    </h3>
    <div style="
        display: grid;
        grid-template-columns: max-content 1fr;
        gap: 12px 16px;
        align-items: center;
    ">
        <p style="margin: 0; font-weight: 600; color: #555;">Name:</p>
        <p style="margin: 0;"><%= newperson.getFulName() %></p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Email:</p>
        <p style="margin: 0;"><%= newperson.getEmail() %></p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Birth Date:</p>
        <p style="margin: 0;"><%= newperson.getBirthDate() %></p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Age:</p>
        <p style="margin: 0;"><%= newperson.getAge() %></p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Gender:</p>
        <p style="margin: 0;"><%= newperson.getGender() %></p>
        
        <p style="margin: 0; font-weight: 600; color: #555;">Marital Status:</p>
        <p style="margin: 0;"><%= newperson.getMaritalStatus() %></p>
    </div>
</div>
</body>
</html>