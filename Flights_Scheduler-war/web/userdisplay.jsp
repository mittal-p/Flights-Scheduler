<%@page import="Entities.Scheduledflights"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Entities.Flights"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flight Scheduling System</title>
        <link rel="shortcut icon" href="assets/favicon.ico" type="image/x-icon">
        <link rel="icon" href="assets/favicon.ico" type="image/x-icon">
        <meta name="viewport" content="width=1366px,height=768px, initial-scale=1.0,user-scalable=false">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href="adminScreen.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="index.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link rel="stylesheet" href="https://fonts.apis.com/icon?family=Material+Icons">
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="materialize.js"></script>
        <script src="materialize.min.js"></script>
        <script src="init.js"></script>
    </head>

        <body>
        <div class="parallax-container" style="background: url(assetss/s.jpg) no-repeat; background-size: 100% 100% ; height: 200px"id="first-frame">

            <header>
                     <nav id="top_nav1">  
                        
                    <ul>
                        <li><a href="start.jsp" ><img style = " vertical-align: middle" src="assetss/login-variant.png" alt="">LOG OUT</a></li>
                        
                    </ul>
                </nav>
                
                <div class="wrapper">
                    <h1><a href="start.jsp" id="logo"></a></h1>
                </div>
                <li style=" margin-left: 80px;float: left ; padding: 20px; font-size: 38px; color: ghostwhite" > FlightManager.com</li>
                 
                     <%-- 
                     <%     String name=(String)request.getSession().getAttribute("myname"); %>
                     <%     out.print("WELCOME       :");%>
                     --%>
                
                
            </header>
            
        </div>
            
            <br><br>
            
             <% List<Scheduledflights> ss=(List<Scheduledflights>)request.getSession().getAttribute("userslist");%>
            
            
            <div align="center">
                <table class="w3-table-all w3-hoverable" border="20" cellpadding="9" style="width: 600px; margin: auto">
			<caption><h4>List of flights</h4></caption>
			<tr class="w3-light-grey">
				<th>SOURCE CITY</th>
				<th>DESTINATION CITY</th>
				<th>ARRIVAL TIME</th>
				<th>DEPARTURE TIME</th>
			</tr>
                        
                        
                        <%
                           for(int i=0; i<ss.size() ; i++){%>
                           <tr>
                               <td><%= ss.get(i).getSourcecity() %></td>
                               <td><%= ss.get(i).getDestination() %></td>
                               <td><%= ss.get(i).getArrivaltime() %></td>
                               <td><%= ss.get(i).getDeparturetime() %></td>
                           </tr>
                           <%}
                        %>
                            
                       
		</table>
	</div>
            
         
         
        </body>
</html>