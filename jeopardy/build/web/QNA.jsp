<%-- 
    Document   : QNA
    Created on : Oct 5, 2016, 2:53:09 PM
    Author     : Rupinder
--%>

<%@page import="LoginBean.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="QNA.css">
    </head>
    <body>
        <%Question s = (Question)request.getAttribute("correctQuestion"); %>
        <fieldset style = "width: 500px; margin:0px auto; border-color: red;border-radius: 10px;">
            
            <legend style="font-family: Monotype Corsiva; font-size: 35px; color: black; "><%=s.getCategory()%></legend>
            <p>Value: $<%=s.getValue()%></p>
            <p>Q1: <%=s.getQuestion()%></p>
            
            <form action="game" method="POST">
                <input type="radio" name="answer" value="<%=s.getAnswer1()%>"><%=s.getAnswer1()%> <br>
                <input type="radio" name="answer" value="<%=s.getAnswer2()%>"><%=s.getAnswer2()%><br>
                <input type="radio" name="answer" value="<%=s.getAnswer3()%>"><%=s.getAnswer3()%><br>
                <input type="radio" name="answer" value="<%=s.getAnswer4()%>"><%=s.getAnswer4()%>
                <button type="submit" name="button" style="float: left;" value="skip">Skip</button>
                <button type="submit" name="button" style="float: right;" value="Submit">Submit</button>
            </form>
        </fieldset>
        
        
    </body>
</html>
