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
    </head>

        <body>
        <div class="parallax-container" style="background: url(assetss/s.jpg) no-repeat; background-size: 100% 100% ; height: 200px"id="first-frame">

            <header>
                     <nav id="top_nav1">  
                        
                    <ul>
                        <li><a href="start.jsp" ><img style = " vertical-align: middle" src="assetss/arrange-send-to-back.png" alt="">HOME</a></li>
                        
                    </ul>
                </nav>
                
                <div class="wrapper">
                    <h1><a href="start.jsp" id="logo"></a></h1>
                </div>
                <li style=" margin-left: 80px;float: left ; padding: 20px; font-size: 38px; color: ghostwhite" > FlightManager.com</li>
        
                
            </header>
            
        </div>
            <br>
            <br><br>
            <div class="w3-card-4" style="width: 400px; margin: auto">
                <div class="w3-container w3-blue">
                    
                    
                    
                    <h6>User Id: 
                        <jsp:declaration>
                            int u=0;
                            
                        </jsp:declaration>
                        
                        <jsp:scriptlet>
                            u =Integer.parseInt(request.getParameter("uid"));
                            request.getSession().setAttribute( "uname", u);
                        </jsp:scriptlet>
                        
                        <strong>
                        <jsp:expression>
                                u
                        </jsp:expression>
                        </strong>
                    </h6>
                </div>
                
                <form class="w3-container" action="ForgotPass" method="POST">
                    <p>      
                        <label class="w3-text-blue"><b>Enter Password</b></label>
                        <input class="w3-input w3-border w3-sand" name="pass" type="password">
                    </p>
                    <p>      
                        <label class="w3-text-blue"><b>Confirm Password</b></label>
                        <input class="w3-input w3-border w3-sand" name="cpass" type="password">
                    </p>
                    
                    <p>
                    <button class="w3-btn w3-grey">Submit</button></p>
                </form>
            </div>
            
        
        
        </body>
</html>
