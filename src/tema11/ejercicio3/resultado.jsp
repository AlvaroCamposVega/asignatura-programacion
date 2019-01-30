<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String nombre = request.getParameter("nombre");
		
		if (nombre.equals("") || nombre == null) {
		    
		    nombre = "usuario";
		}
	%>
	<h1>Hola <%= nombre %></h1>
</body>
</html>