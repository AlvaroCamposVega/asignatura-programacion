<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Conversor a euros</title>
</head>
<body>
	<%
		double euros = 166.386;
		String pesetas = request.getParameter("pesetas");
		double res = Double.parseDouble(pesetas) / euros;
		DecimalFormat dosDecimales = new DecimalFormat("0.00");
	%>
	<h1><%= pesetas %> pesetas son <%= dosDecimales.format(res) %> euros</h1>
</body>
</html>