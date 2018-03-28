<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<title>SGP-App</title>
</head>
<body>
	<h1>Les collaborateurs</h1>
	<h2>PAR ICI LA MONNAIE</h2>

	<ul>
		<% try {
			List<String> listeNoms = (List<String>) request.getAttribute("listeNoms");
			for (String nom : listeNoms) {
		%>
		<li><%= nom %></li>

		<%	
			}
			} catch(Exception e) {
	            out.println("An exception occurred: " + e.getMessage());
	    		
	    			}
		%>

	</ul>

</body>
</html>