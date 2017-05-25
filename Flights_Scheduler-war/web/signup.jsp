<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flight Scheduling System</title>
        <link rel="shortcut icon" href="assets/favicon.ico" type="image/x-icon">
        <link rel="icon" href="assets/favicon.ico" type="image/x-icon">
        <meta name="viewport" content="width=1366px,height=768px, initial-scale=1.0,user-scalable=false">
        <link href="login.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="index.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="materialize.js"></script>
        <script src="materialize.min.js"></script>
        <script src="init.js"></script>
    </head>
    <body>
        
      
        <div class="parallax-container" style="background: url(assetss/s.jpg) no-repeat; background-size: 100% 100% ; height: 750px"id="first-frame">

            <header>

                <nav id="top_nav1">

                    <ul>
                        <li><a href="support.jsp" ><img style = " vertical-align: middle" src="assetss/arrange-send-to-back.png" alt="">SUPPORT</a></li>
                        <li style="background: skyblue ; font-style: italic"><a href="signup.jsp"><img style = " vertical-align: middle" src="assetss/login-variant.png" alt="">SIGN UP</a></li>
                        <li><a href="login.jsp"><img style="vertical-align: middle" src="assetss/login-variant.png" alt="">LOGIN</a></li>

                    </ul>
                </nav>
                <div class="wrapper">
                    <h1><a href="start.jsp" id="logo"></a></h1>

                </div>
                <div>
                    <ul id="menu">
                        <li style=" margin-left: 80px;float: left ; padding: 20px; font-size: 38px; color: ghostwhite" > FlightManager.com</li>

                        <li><a href="start.jsp"><span><span>About</span></span></a></li>
                        <li><a href="offers.jsp"><span><span>Flight Schedule</span></span></a></li>
                        <li><a href="book.jsp"><span><span>Flight Booking</span></span></a></li>
                        <li><a href="safety.jsp"><span><span>Safety</span></span></a></li>
                        <li class="end"><a href="#thirdframe"><span><span>Contact Us</span></span></a></li>
                    </ul>
                </div>

            </header>
            <hr>
            
            
        </div>
        <br><br>
          
        
        
             <form class="col s12" action="ValidateSignup" method="POST">  
     
                 <div class="row">
        
                    <p class="input-field col s6">
                        <img style="vertical-align: middle; padding: 15px; cursor: pointer ; " src="assetss/account-settings-variant.png" alt=""/>
                        <input name="group1" type="radio" id="test1" value="admin" checked="" >
                        <label for="test1" style="font-size: 40px; color: #00838f; font-family: Robotodraft">ADMIN</label>
                    </p>
                    <p class="input-field col s6">
                        <img style="vertical-align: middle; padding: 15px; " src="assetss/account-switch.png" alt=""/>
                        <input name="group1" type="radio" id="test2" value="supervisor">
                        <label for="test2" style="font-size: 40px; color: #00838f ;font-family: Robotodraft;">SUPERVISOR</label>
                    </p>
                </div>
            
                 
                <div class="row">
                    <div class="input-field col s6">
                        <input  id="name" type="text" name="name" class="validate" >
                        <label for="name">Name</label>                        
                    </div>
                    
                    <div class="input-field col s6">
                        <input id="address" type="text" name="address" class="validate" >
                    <label for="address">Address</label>
                    </div>
                </div>
                
                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="userid" type="text" name="uid" class="validate">
                        <label for="userid">User Id</label>
                    </div>

                    <div class="input-field col s6">
                            <i class="material-icons prefix">person_pin</i>
                            <input id="password" type="password" name="pass" class="validate">
                            <label for="password">Password</label>
                    </div>
                </div>
                 
                 <div class="row">
                    <div class="input-field col s12">
                    <i class="material-icons prefix">email</i>
                    <input id="email" type="tel" name="email" class="validate">
                    <label for="email">Email Id</label>
                    </div>
   
                </div>
                 
                 
                 
            
            <a style=" font-size: 25px;position:relative;top:5px; height: 40px;" class="waves-effect waves-light btn">
                <input type="submit" value="Submit"/></a>
                
        </form>
    
    
        
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

        <br><br>
        <footer id = "footer">
            <div>Copyright &copy; <a href="#">FlightManager</a> All Rights Reserved!<br>
                Developed by : Priya Mittal , Smriti Vohra and Pallavi Arora </div>
        </footer>
    </body>
</html>
