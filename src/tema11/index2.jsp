<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="tema11.biblio.BiblioMatematicas"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Index</title>
</head>
<body>
	<% 
		String tip = "Elige dónde crees que está la bola";
		String cubCon = "img/cubilete_con_1bola.png";
		String cub1 = "img/cubilete_tapando_bolas.png";
		String cub2 = "img/cubilete_tapando_bolas.png";
		String cub3 = "img/cubilete_tapando_bolas.png";
		String cub = request.getParameter("opcion");
		String resultado = "Fallaste!";
		String cubilete = "cubilete 1";
	
		if (request.getParameter("opcion") == null || request.getParameter("opcion").equals("")) {
		} else {
		    int n = BiblioMatematicas.aleatorio(1, 3);
		    cub1 = "img/cubilete_sin_bola.png";
			cub2 = "img/cubilete_sin_bola.png";
			cub3 = "img/cubilete_sin_bola.png";
		    
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
			tip = resultado + " la bola estaba en el " + cubilete;
		}
	%>
	<img src="<%= cub1 %>" width="200" onclick="elegir(1)">
	<img src="<%= cub2 %>" width="200" onclick="elegir(2)">
	<img src="<%= cub3 %>" width="200" onclick="elegir(3)">
	<h2><%= tip %></h2>
	<form method="post" action="index2.jsp" style="visibility:hidden">
		<input type="text" name="opcion" id="valor">
		<input type="submit" value="Enviar"></input><br>
	</form>
</body>
<script>
	var valor = document.getElementById("valor");
	var opcion;
	var formulario = document.getElementsByTagName("form");
	
	function elegir(cubo) {
		switch (cubo) {
		case 1:
			opcion = "cubilete 1";
			break;
		case 2:
			opcion = "cubilete 2";
			break;
		case 3:
			opcion = "cubilete 3";
			break;
		}
		valor.value = opcion;
		formulario[0].submit();
	}
</script>
</html>