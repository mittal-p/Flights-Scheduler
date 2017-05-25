<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Flight Scheduling System</title>
        <meta charset="UTF-8">
        <link rel="shortcut icon" href="assets/favicon.ico" type="image/x-icon">
        <link rel="icon" href="assets/favicon.ico" type="image/x-icon">
        <meta name="viewport" content="width=1366px,height=768px, initial-scale=1.0,user-scalable=false">
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
        <div class="parallax-container" style="height: 800px;" id="first-frame">

            <header>

                <nav id="top_nav1">
                   
                    <ul>
                        <li><a href="support.jsp" ><img style = " vertical-align: middle" src="assetss/arrange-send-to-back.png" alt="">SUPPORT</a></li>
                        <li><a href="signup.jsp"><img style="vertical-align: middle" src="assetss/login-variant.png" alt="">SIGN UP</a></li>
                        <li><a href="login.jsp"><img style = " vertical-align: middle" src="assetss/login-variant.png" alt="">LOGIN</a></li>

                    </ul>
                </nav>
                <div class="wrapper">
                    <h1><a href="start.jsp" id="logo"></a></h1>

                </div>
                <div>

                    <ul id="menu">
                        <li style=" margin-left: 80px;float: left ; padding: 20px; font-size: 38px; color: ghostwhite" > FlightManager.com</li>

                        <li id="menu_active"><a href="start.jsp"><span><span>About</span></span></a></li>
                        <li><a href="offers.jsp"><span><span>Flight Schedule</span></span></a></li>
                        <li><a href="safety.jsp"><span><span>Safety</span></span></a></li>
                        <li class="end"><a href="#thirdframe"><span><span>Contact Us</span></span></a></li>
                    </ul>
                </div>
                                

            </header>
            <hr>
            <div class="parallax"  ><img src="assetss/s.jpg"></div>
        </div>
        <br><br>
        <div>
            <center><span class="research-areas">FLIGHTMANAGER.COM</span></center>
            <p class="description">Travel requires that you keep yourself updated with the latest flights status. Often, you would need to check the flight schedule of the airlines for a particular sector while planning your travel.
            <br> You can get online with "FLIGHTMANAGER.COM" which provides an easy online interface to checkout which all flights are operating at what all times.
            <br>Simply click on the link related to your flight and you can see it schedule and flight number.
            <br>Stay up to date with information related to your flights.</p>

        </div>
        <div class="parallax-container" id="second-frame">
            <div class="parallax"><img src="assetss/p.jpg"></div>
        </div>
        <div class="section">
            <center><span class='research-areas'>Connecting the world of Travel!</span></center>
            <p class="description">We are the leading global provider of digital flight information and provide accurate, timely and actionable information and applications across the travel sector to the world’s airlines, airports, government agencies, aircraft manufacturers, consultancies and travel related companies.</p>
            <div class="buttons">
                <a class="submit-button" href="register.jsp"><i class="material-icons">playlist_add</i> AIRLINES</a>
            <a class="submit-button" href="submit-abstract.jsp"><i class="material-icons">receipt</i> AIRPORT SERVICES</a>
                <a class="submit-button" href="register.jsp"><i class="material-icons">playlist_add</i> GENERAL AVIATION</a>
            <a class="submit-button" href="submit-abstract.jsp"><i class="material-icons">receipt</i> TRAVEL TECH</a>
                <a class="submit-button" href="register.jsp"><i class="material-icons">playlist_add</i> TOURISM</a>
            
            </div>
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
        <div class='section' id='thirdframe'>

            <span class='footer-h' >Contact Us</span>


            <div class='contact-info'>


                <form>
                    <div>
                        <div  class="contact-name"  ><span>Name:</span>


                            <input type="text" style = "color: #00838f"placeholder="Your Name : " id="name" class="validate"  >
                        </div>
                        <div  class="contact-name"> <span>Email:</span>


                            <input type="text"  style = "color: #00838f" placeholder=" Your Email Id :" id="emailid" class="validate">
                        </div>
                        <div  class="contact-name"> <span>Message:</span>
                            <textarea id="icon_prefix2"  style = "color: #00838f" placeholder="Write your message here.."class="materialize-textarea"></textarea>
                            <br> <br>
                        </div>

                        <div>
                            <a href="#" class="submit-button"><strong>Send</strong></a>
                        </div>
                    </div>
                </form> 

            </div>
            <div class ="contact1" class="col s12  offset-s2 offset-l3">
                <div class="card-panel blue lighten-5 z-depth-4 ">
                    <div class="row valign-wrapper">
                        <div class="col s2">
                            <img src="assetss/map-marker.png" alt="" class="circle responsive-img"> <!-- notice the "circle" class -->
                        </div>
                        <div class="col s10">
                            <span class="indigo-text darken-3"> Address : <br>
                                Lajpat Nagar , Delhi , India
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <br><br>
            <div class ="contact1" class="col s12 offset-s4 offset-l3">
                <div class="card-panel light-green lighten-5 z-depth-4">
                    <div class="row valign-wrapper">
                        <div class="col s2">
                            <img src="assetss/contact-mail.png" alt="" class="circle responsive-img"> <!-- notice the "circle" class -->
                        </div>
                        <div class="col s10">
                            <span class="teal-text darken-3">Mail us at : <br>
                                <a href='mailto:FlightManager@gmail.com'>FlightManager@gmail.com</a><br>
                                <a href='mailto:FlightSupport@yahoo.com'>FlightSupport@yahoo.com</a>

                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <br><br><br><br><br><br>
            <div class ="contact1" class="col s12 offset-s2 l6 offset-l3">
                <div class="card-panel blue lighten-5 z-depth-4 ">
                    <div class="row valign-wrapper">
                        <div class="col s2">
                            <img src="assetss/phone.png" alt="" class="circle responsive-img"> <!-- notice the "circle" class -->
                        </div>
                        <div class="col s10">
                            <span class="indigo-text darken-3">Contact Number : 
                                <br> Mobile : +91 7838081242 <br>
                                Office No. : 01127441765
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <br><br><br><br><br><br>
            <div class ="contact1" class="col s12 offset-s2 l6 offset-l3">
                <div class="card-panel light-green lighten-5 z-depth-4 ">
                    <div class="row valign-wrapper">
                        <div class="col s2">
                            <img src="assetss/timelapse.png" alt="" class="circle responsive-img"> <!-- notice the "circle" class -->
                        </div>
                        <div class="col s10">
                            <span class="teal-text darken-3">Timings : <br>
                                Monday - Friday: 9 a.m - 8 p.m <br>
                                Saturday - Sunday : 9 a.m - 4 p.m
                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br><br>
        <iframe class = "location" style="border: solid 3px darkslateblue;" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14016.117952342986!2d77.23436472552237!3d28.568877219084953!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x390ce3ad801d293d%3A0x7f730966747ee8fc!2sLajpat+Nagar%2C+New+Delhi%2C+Delhi!5e0!3m2!1sen!2sin!4v1485682014365" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
        <footer id = "footer">
            <div>Copyright &copy; <a href="#">FlightManager</a> All Rights Reserved!<br>
                Developed by : Priya Mittal , Smriti Vohra and Pallavi Arora </div>
        </footer>
    </body>
</html>
