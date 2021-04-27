<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
 <jsp : userBean id="ex2_authentificationBean" type="modele.ex2_authentificationBean" scorpe="session"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
client créé avec succès !
<h2>
Nom : <%= request.getParameter("nom") %><br>
Prenom : <%= request.getParameter("prenom") %><br>
Adresse : <%= request.getParameter("adresse") %><br>
Telephone : <%= request.getParameter("telephone") %><br>
Email : <%= request.getParameter("email") %><br>
</h2>

</body>
</html>