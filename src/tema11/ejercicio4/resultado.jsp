<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Media de 3 números</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		double not1 = Double.parseDouble(request.getParameter("not1"));
		double not2 = Double.parseDouble(request.getParameter("not2"));
		double not3 = Double.parseDouble(request.getParameter("not3"));
		double media = (not1 + not2 + not3) / 3;
		DecimalFormat dosDecimales = new DecimalFormat("0.00");
		boolean sus = false;
		
		if (media < 5) {
		    
		    sus = true;
		}
	%>
	<h1>Tu nota media es: 
		<span <% if (sus) {out.print("Style='color:red'");}else{out.print("Style='color:green'");} %>><%= dosDecimales.format(media) %></span>
	</h1>
</body>
</html>