<%-- 
    Document   : JSPMostrarDatos
    Created on : 02-may-2018, 18:12:02
    Author     : LABO08
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mostrar datos</title>
<%
     List<String> lista = (List<String>) request.getAttribute("clientes");
%>
</head>
<body>
	<%
	for (String c : lista) {
	%>
	<p><%=c %></p>
	<%} %>
</body>
</html>
