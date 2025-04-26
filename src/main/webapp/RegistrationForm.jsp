<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>	
<meta charset="UTF-8">
<title>tp2</title>
</head>
<body>
<div style="margin:auto; width:50%; height: 100vh; display:flex; justify-content:center; align-items:center;">
  <form action="register" method="post" id="form" style="display:flex; flex-direction:column; gap:9px;">
    <label for="fullname">Full name</label>
    <input type="text" name="fullname" id="fullname" style="padding:5px">
    
    <label for="email">E-mail</label>
    <input type="email" name="email" id="email" style="padding:5px">
    
    <label for="birthday">Birthday(dd-mm-yyyy)</label>
    <input type="date" id="date" name="birthdate" style="padding:5px">
    
    <div>
      <label>Gender</label>
      <input type="radio" id="choiceMale" name="gender" value="Male">
      <label for="choiceMale">Male</label>
      
      <input type="radio" id="choiceFemale" name="gender" value="Female">
      <label for="choiceFemale">Female</label>
    </div>
    <div>
      <label>Marital Status</label>
      <input type="radio" id="Married" name="MaritaStatus" value="Married">
      <label for="Married">Married</label>
      
      <input type="radio" id="Single" name="MaritaStatus" value="Single">
      <label for="Single">Single</label>
      <input type="radio" id="Divorced" name="MaritaStatus" value="Divorced">
      <label for="Divorced">Divorced</label>
      
    </div>
    <div>
    <input type="submit" value="Submit" style="background-color:blue; color:white; padding:3%; cursor:pointer;font-family:sans-serif">
    </div>
  </form>
</div>

</body>
</html>