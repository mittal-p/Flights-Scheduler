<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link href="index.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
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
                        <li>
                            <%String name=(String)request.getAttribute("myname");
                            out.print("WELCOME       :"+name.toUpperCase());%>
                           
                      <%--      <jsp:scriptlet>
                                request.getSession().setAttribute( "uname", name);
                            </jsp:scriptlet>
                         --%>   
                            
                        </li>

                    </ul>
                </nav>
                
                <div class="wrapper">
                    <h1><a href="start.jsp" id="logo"></a></h1>
                </div>
                <li style=" margin-left: 80px;float: left ; padding: 20px; font-size: 38px; color: ghostwhite" > FlightManager.com</li>
        
                
            </header>
            
            
            
        </div>
        <br><br>
         
        <div class="w3-border" style="width: 500px ; margin: auto; height: 450px;" >
            <div class="w3-container w3-blue" style="height: 30px">
                <h6>Input Flights Details...</h6>
            </div>

            <form class="w3-container" action="AdminScreen" method="POST">
                <div style="font-style: italic;font-family: cursive">
                <p>
                <label>Source City</label>
                <select name="source">
                    <option>Delhi</option>
                    <option>Mumbai</option>
                    <option>Lucknow</option>
                    <option>Ahmedabad</option>
                    <option>Bangalore</option>
                    <option>Kolkata</option>
                    <option>Chennai</option>
                </select>
                <p>
                <label>Destination City</label>
                <select name="dest">
                    <option>Delhi</option>
                    <option>Mumbai</option>
                    <option>Lucknow</option>
                    <option>Ahmedabad</option>
                    <option>Bangalore</option>
                    <option>Kolkata</option>
                    <option>Chennai</option>
                </select>
                <p>
                <label>Duration of Flight</label>
                <input class="w3-input" type="number" name="dur"></p>
                <p>
                <label>Number of Flights per week</label>
                <input class="w3-input" type="number" name="nof"></p>
                
                <div style="font-size: 20px; height: 30px;">
                <center> 
               <input type="submit" style="background-color: lightseagreen" name="btn" value="Save"/>
               <input type="submit" style="background-color: lightseagreen" name="btn" value="Clear"/>
                </center>
                </div>
            </form>
        
        </div> 
        
        
        
        
        
        
        
        <div class="fixed-action-btn horizontal">
            <a class="btn-floating btn-large red">
                <i class="large material-icons ">people</i>
            </a>
            <ul>
                <li><a class="btn-floating " class="normaltip"><img src="assetss/facebook.png" alt=""></a></li>
                <li><a class="btn-floating  " class="normaltip"><img src="assetss/twitter-circle.png" alt=""></a></li>
                <li><a class="btn-floating " class="normaltip"><img src="assetss/google-plus.png" alt=""></a></li>
                <li><a class="btn-floating " class="normaltip"><img src="assetss/wikipedia.png" alt=""></a></li>
            </ul>
        </div>

             
                
    </body>
</html>