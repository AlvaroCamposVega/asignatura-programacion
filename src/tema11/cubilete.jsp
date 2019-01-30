<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="tema11.biblio.BiblioMatematicas"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cubilete</title>
</head>
<body>
	<%
		String cubCon = "img/cubilete_con_1bola.png";
		String cub1 = "img/cubilete_sin_bola.png";
		String cub2 = "img/cubilete_sin_bola.png";
		String cub3 = "img/cubilete_sin_bola.png";
		String cub = request.getParameter("cubilete");
		int n = BiblioMatematicas.aleatorio(1, 3);
		String resultado = "Fallaste!";
		String cubilete = "cubilete 1";
		
		switch (n) {
			case 1:
			    cub1 = cubCon;
			    break;
			case 2:
			    cub2 = cubCon;
			    cubilete = "cubilete 2";
			    break;
			case 3:
			    cub3 = cubCon;
			    cubilete = "cubilete 3";
			    break;
		}
		
		if (cub.equals(cubilete)) { resultado = "Acertaste!!"; }
	%>
	<img src="<%= cub1 %>" width="200">
	<img src="<%= cub2 %>" width="200">
	<img src="<%= cub3 %>" width="200">
	<h1><%= resultado %> la bola estaba en el <%= cubilete %>
		
	</h1>
</body>
</html>