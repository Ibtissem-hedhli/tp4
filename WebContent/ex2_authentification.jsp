<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
<jsp : userBean id="ex2_authentificationBean" type="modele.ex2_authentificationBean" scorpe="session"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>authentification</title>
</head>
<body>
<h1>bienvenue à votre session</h1>
Prenom : <%= request.getParameter("prenom") %><br>
Nom  : <%= request.getParameter("nom") %><br>
</body>
</html>