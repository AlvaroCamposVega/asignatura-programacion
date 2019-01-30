<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Conversor a pesetas</title>
</head>
<body>
	<%
		double pesetas = 166.386;
		String euros = request.getParameter("euros");
		double res = Double.parseDouble(euros) * pesetas;
		DecimalFormat dosDecimales = new DecimalFormat("0.00");
	%>
	<h1><%= euros %> euros son <%= dosDecimales.format(res) %> pesetas</h1>
</body>
</html>