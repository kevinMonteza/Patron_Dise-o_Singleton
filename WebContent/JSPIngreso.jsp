<%-- 
    Document   : JSPIngreso
    Created on : 02-may-2018, 18:01:20
    Author     : LABO08
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ingrese datos de pais</title>
</head>
<body>
	
	<h1>Ingrese PAIS y CIUDAD</h1>
	<form action="${pageContext.request.contextPath}/Control" method="post">
		<input type="text" name="pais" /> <input type="text" name="ciudad" />
		<input type="submit" value="Enviar" />
	</form>
</body>
</html>
