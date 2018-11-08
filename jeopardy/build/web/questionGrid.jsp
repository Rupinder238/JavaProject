<%@page import="LoginBean.login"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Question Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="question.css">
    </head>
    <body>

        <div style="clear: both">
            <% login name = (login) session.getAttribute("player");%>
            
            <% String dis0 = (String) session.getAttribute("b0"); %>
            <% String dis1 = (String) session.getAttribute("b1"); %>
            <% String dis2 = (String) session.getAttribute("b2"); %>
            <% String dis3 = (String) session.getAttribute("b3"); %>
            <% String dis4 = (String) session.getAttribute("b4"); %>
            <% String dis5 = (String) session.getAttribute("b5"); %>
            <% String dis6 = (String) session.getAttribute("b6"); %>
            <% String dis7 = (String) session.getAttribute("b7"); %>
            <% String dis8 = (String) session.getAttribute("b8"); %>
            <% String dis9 = (String) session.getAttribute("b9"); %>
            <% String dis10 = (String) session.getAttribute("b10"); %>
            <% String dis11 = (String) session.getAttribute("b11"); %>
            <% String dis12 = (String) session.getAttribute("b12"); %>
            <% String dis13 = (String) session.getAttribute("b13"); %>
            <% String dis14 = (String) session.getAttribute("b14"); %>
            <% String dis15 = (String) session.getAttribute("b15"); %>
            <% String dis16 = (String) session.getAttribute("b16"); %>
            <% String dis17 = (String) session.getAttribute("b17"); %>
            <% String dis18 = (String) session.getAttribute("b18"); %>
            <% String dis19 = (String) session.getAttribute("b19"); %>
            <% String dis20 = (String) session.getAttribute("b20"); %>
            <% String dis21 = (String) session.getAttribute("b21"); %>
            <% String dis22 = (String) session.getAttribute("b22"); %>
            <% String dis23 = (String) session.getAttribute("b23"); %>
            <% String dis24 = (String) session.getAttribute("b24"); %>
            
            <h1 style="float: left">Name: <%= name.getName()%></h1>
            <h2 style="float: right">Winnings: $<%= name.getScore()%></h2>
        </div>
        <form action="Question" method="POST">
            <table style="width:100%">
                <tr>
                    <th>Computer</th>
                    <th>Earth</th>
                    <th>Plants</th>
                    <th>Games</th>
                    <th>Human Body</th>

                </tr>
                <tr>
                    <td><button type="submit" value="0" name="1" <%= dis0%>>$100</button></td>
                    <td><button type="submit" value="5" name="1" <%= dis5%>>$100</button></td>
                    <td><button type="submit" value="10" name="1" <%= dis10%>>$100</button></td>
                    <td><button type="submit" value="15" name="1" <%= dis15%>>$100</button></td>
                    <td><button type="submit" value="20" name="1" <%= dis20%>>$100</button></td>
                </tr>
                <tr>
                    <td><button type="submit" value="1" name="1" <%= dis1%>>$200</button></td>
                    <td><button type="submit" value="6" name="1" <%= dis6%>>$200</button></td>
                    <td><button type="submit" value="11" name="1" <%= dis11%>>$200</button></td>
                    <td><button type="submit" value="16" name="1" <%= dis16%>>$200</button></td>
                    <td><button type="submit" value="21" name="1" <%= dis21%>>$200</button></td>
                </tr>
                <tr>
                    <td><button type="submit" value="2" name="1" <%= dis2%>>$300</button></td>
                    <td><button type="submit" value="7" name="1" <%= dis7%>>$300</button></td>
                    <td><button type="submit" value="12" name="1" <%= dis12%>>$300</button></td>
                    <td><button type="submit" value="17" name="1" <%= dis17%>>$300</button></td>
                    <td><button type="submit" value="22" name="1" <%= dis22%>>$300</button></td>
                </tr>
                <tr>
                    <td><button type="submit" value="3" name="1" <%= dis3%>>$400</button></td>
                    <td><button type="submit" value="8" name="1" <%= dis8%>>$400</button></td>
                    <td><button type="submit" value="13" name="1" <%= dis13%>>$400</button></td>
                    <td><button type="submit" value="18" name="1" <%= dis18%>>$400</button></td>
                    <td><button type="submit" value="23" name="1" <%= dis23%>>$400</button></td>
                </tr>
                <tr>
                    <td><button type="submit" value="4" name="1" <%= dis4%>>$500</button></td>
                    <td><button type="submit" value="9" name="1" <%= dis9%>>$500</button></td>
                    <td><button type="submit" value="14" name="1" <%= dis14%>>$500</button></td>
                    <td><button type="submit" value="19" name="1" <%= dis19%>>$500</button></td>
                    <td><button type="submit" value="24" name="1" <%= dis24%>>$500</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
