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
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="materialize.js"></script>
        <script src="materialize.min.js"></script>
        <script src="init.js"></script>
        <script src="//cdn.muicss.com/mui-0.9.9-rc2/extra/mui-combined.js"></script>
        <script src="//cdn.muicss.com/mui-0.9.9-rc2/extra/mui-combined.min.js"></script>
        <script src="//cdn.muicss.com/mui-0.9.9-rc2/extra/mui-angular-combined.js"></script>
        <script src="//cdn.muicss.com/mui-0.9.9-rc2/extra/mui-angular-combined.minjs"></script>
        <script src="//cdn.muicss.com/mui-0.9.9-rc2/extra/mui-react-combined.js"></script>
        <script src="//cdn.muicss.com/mui-0.9.9-rc2/extra/mui-react-combined.min.js"></script>

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
                    <h1><a id="logo"></a></h1>
                </div>
                <li style=" margin-left: 80px;float: left ; padding: 20px; font-size: 38px; color: ghostwhite" > FlightManager.com</li>
         
                
            </header>
            
        </div>
        <br><br>  
            
        <div class="tabledata"  style="padding-left: 200px; padding-right: 200px; height: 100px; font-size: 20px; font-family: serif">
            <div class="w3-bar w3-border w3-card-4 w3-light-grey">
                <a id="mon" href="#" class="w3-bar-item w3-button" onclick="viewData('Mon')"><b>MONDAY</b></a>
                <a id="tue" href="#" class="w3-bar-item w3-button" onclick="viewData('Tue')"><b>TUESDAY</b></a>
                <a id="wed" href="#" class="w3-bar-item w3-button" onclick="viewData('Wed')"><b>WEDNESDAY</b></a>
                <a id="thu" href="#" class="w3-bar-item w3-button" onclick="viewData('Thu')"><b>THURSDAY</b></a>
                <a id="fri" href="#" class="w3-bar-item w3-button" onclick="viewData('Fri')"><b>FRIDAY</b></a>
                <a id="sat" href="#" class="w3-bar-item w3-button" onclick="viewData('Sat')"><b>SATURDAY</b></a>
                <a id="sun" href="#" class="w3-bar-item w3-button" onclick="viewData('Sun')"><b>SUNDAY</b></a>
            </div> 
        </div>

        
      
        </body>
</html>