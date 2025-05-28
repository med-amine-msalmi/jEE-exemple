<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>tp2</title>
  <link rel="stylesheet" href="css/index1.css">
</head>
<body>

    
  <form action="${pageContext.request.contextPath}/register" method="post" id="form">
    <label for="fullname">Full name</label>
    <input type="text" name="fullname" id="fullname">
    
    <label for="email">E-mail</label>
    <input type="email" name="email" id="email">
    
    <label for="birthday">Birthday (dd-mm-yyyy)</label>
    <input type="date" id="date" name="birthdate">
    
    <div>
      <label>Gender</label><br>
      <input type="radio" id="choiceMale" name="gender" value="Male">
      <label for="choiceMale">Male</label>
      
      <input type="radio" id="choiceFemale" name="gender" value="Female">
      <label for="choiceFemale">Female</label>
    </div>
    
    <div>
      <label>Marital Status</label><br>
      <input type="radio" id="Married" name="MaritaStatus" value="Married">
      <label for="Married">Married</label>
      
      <input type="radio" id="Single" name="MaritaStatus" value="Single">
      <label for="Single">Single</label>
      <input type="radio" id="Divorced" name="MaritaStatus" value="Divorced">
      <label for="Divorced">Divorced</label>
    </div>
    <input type="submit" value="Register">
  </form>
    <button onclick="window.location.href='${pageContext.request.contextPath}/list';">Persons</button>
    
</body>
</html>
