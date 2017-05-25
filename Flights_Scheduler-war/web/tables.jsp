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
            
             <% List<Scheduledflights> ss=(List<Scheduledflights>)request.getSession().getAttribute("display_list");%>
            
            <script>$(document).ready(function(){
                $('ul.tabs').tabs('select_tab', 'tab_id');
            });</script>
            
          <div class="row">
    <div class="col s12">
      <ul class="tabs">
        <li class="tab col s2"><a class="active" href="#test1">Monday</a>
        </li>
        <li class="tab col s2"><a  href="#test2">Tuesday</a>
        </li>
        <li class="tab col s2"><a href="#test3">Wednesday</a></li>
        <li class="tab col s2"><a href="#test4">Thursday</a></li>
        <li class="tab col s1"><a href="#test5">Friday</a></li>
        <li class="tab col s2"><a href="#test6">Saturday</a></li>
        <li class="tab col s1"><a href="#test7">Sunday</a></li>
      </ul>
    </div>
              
               
           
    <div id="test1" class="col s12"> 
        <table class="striped">
        <thead>
          <tr>
              <th>Source City</th>
              <th>Destination City</th>
              <th>Arrival Time</th>
              <th>Departure Time</th>
          </tr>
        </thead>

        <tbody>
            
            <%
            for(int j=0;j<ss.size();j++)
                {%>
            <tr>
                        <tr>
                            <%if(ss.get(j).getDay().equals("mon")){%>
                               <td><%= ss.get(j).getSourcecity() %></td>
                               <td><%= ss.get(j).getDestination() %></td>                              
                               <td><%= ss.get(j).getArrivaltime() %></td>
                               <td><%= ss.get(j).getDeparturetime() %></td>
                        </tr>
                           <%}
                        %>
            </tr>
            <%} 
            %>
            
        </tbody>
      </table>
    </div>
    <div id="test2" class="col s12"> 
        <table class="striped">
        <thead>
          <tr>
              <th>Source City</th>
              <th>Destination City</th>
              <th>Arrival Time</th>
              <th>Departure Time</th>
          </tr>
        </thead>

        <tbody>
            
            <%
            for(int j=0;j<ss.size();j++)
                {%>
            <tr>
                        <tr>
                            <%if(ss.get(j).getDay().equals("tue")){%>
                               <td><%= ss.get(j).getSourcecity() %></td>
                               <td><%= ss.get(j).getDestination() %></td>                              
                               <td><%= ss.get(j).getArrivaltime() %></td>
                               <td><%= ss.get(j).getDeparturetime() %></td>
                        </tr>
                           <%}
                        %>
            </tr>
            <%} 
            %>
            
        </tbody>
      </table>
    </div>
              
            <div id="test3" class="col s12">
               <table class="striped">
       <thead>
          <tr>
              <th>Source City</th>
              <th>Destination City</th>
              <th>Arrival Time</th>
              <th>Departure Time</th>
          </tr>
        </thead>

        <tbody>
            
            <%
            for(int j=0;j<ss.size();j++)
                {%>
            <tr>
                        <tr>
                            <%if(ss.get(j).getDay().equals("wed")){%>
                               <td><%= ss.get(j).getSourcecity() %></td>
                               <td><%= ss.get(j).getDestination() %></td>                              
                               <td><%= ss.get(j).getArrivaltime() %></td>
                               <td><%= ss.get(j).getDeparturetime() %></td>
                        </tr>
                           <%}
                        %>
            </tr>
            <%} 
            %>
            
        </tbody>
      </table>
            
            
              </div>
              <div id="test4" class="col s12">
               <table class="striped">
        <thead>
          <tr>
              <th>Source City</th>
              <th>Destination City</th>
              <th>Arrival Time</th>
              <th>Departure Time</th>
          </tr>
        </thead>

        <tbody>
            
            <%
            for(int j=0;j<ss.size();j++)
                {%>
            <tr>
                        <tr>
                            <%if(ss.get(j).getDay().equals("thu")){%>
                               <td><%= ss.get(j).getSourcecity() %></td>
                               <td><%= ss.get(j).getDestination() %></td>                              
                               <td><%= ss.get(j).getArrivaltime() %></td>
                               <td><%= ss.get(j).getDeparturetime() %></td>
                        </tr>
                           <%}
                        %>
            </tr>
            <%} 
            %>
            
        </tbody>
      </table>
              </div>
              <div id="test5" class="col s12">
               <table class="striped">
        <thead>
          <tr>
              <th>Source City</th>
              <th>Destination City</th>
              <th>Arrival Time</th>
              <th>Departure Time</th>
          </tr>
        </thead>

        <tbody>
            
            <%
            for(int j=0;j<ss.size();j++)
                {%>
            <tr>
                        <tr>
                            <%if(ss.get(j).getDay().equals("fri")){%>
                               <td><%= ss.get(j).getSourcecity() %></td>
                               <td><%= ss.get(j).getDestination() %></td>                              
                               <td><%= ss.get(j).getArrivaltime() %></td>
                               <td><%= ss.get(j).getDeparturetime() %></td>
                        </tr>
                           <%}
                        %>
            </tr>
            <%} 
            %>
            
        </tbody>
      </table>
              </div>
              <div id="test6" class="col s12">
               <table class="striped">
       <thead>
          <tr>
              <th>Source City</th>
              <th>Destination City</th>
              <th>Arrival Time</th>
              <th>Departure Time</th>
          </tr>
        </thead>

        <tbody>
            
            <%
            for(int j=0;j<ss.size();j++)
                {%>
            <tr>
                        <tr>
                            <%if(ss.get(j).getDay().equals("sat")){%>
                               <td><%= ss.get(j).getSourcecity() %></td>
                               <td><%= ss.get(j).getDestination() %></td>                              
                               <td><%= ss.get(j).getArrivaltime() %></td>
                               <td><%= ss.get(j).getDeparturetime() %></td>
                        </tr>
                           <%}
                        %>
            </tr>
            <%} 
            %>
            
        </tbody>
      </table>
              </div>
              <div id="test7" class="col s12">
               <table class="striped">
        <thead>
          <tr>
              <th>Source City</th>
              <th>Destination City</th>
              <th>Arrival Time</th>
              <th>Departure Time</th>
          </tr>
        </thead>

        <tbody>
            
            <%
            for(int j=0;j<ss.size();j++)
                {%>
            <tr>
                        <tr>
                            <%if(ss.get(j).getDay().equals("sun")){%>
                               <td><%= ss.get(j).getSourcecity() %></td>
                               <td><%= ss.get(j).getDestination() %></td>                              
                               <td><%= ss.get(j).getArrivaltime() %></td>
                               <td><%= ss.get(j).getDeparturetime() %></td>
                        </tr>
                           <%}
                        %>
            </tr>
            <%} 
            %>
            
        </tbody>
      </table>
              </div>
  </div>

         
        </body>
</html>