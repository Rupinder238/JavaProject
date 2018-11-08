<%-- 
    Document   : FinishPage
    Created on : Oct 13, 2016, 7:38:54 PM
    Author     : Rupinder
--%>

<%@page import="LoginBean.login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="FinishCss.css">
    </head>
    <body>
        
        
        <% login name = (login) session.getAttribute("player");%>
        <h1>Name: <%= name.getName()%></h1>
        <h2>Winnings: $<%= name.getScore()%></h2>
        <img src="complete.gif">
    </body>
</html>
