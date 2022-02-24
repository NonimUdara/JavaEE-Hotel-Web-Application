<%-- 
    Document   : booking
    Created on : Jan 27, 2022, 8:44:39 PM
    Author     : Nonim
--%>

<%@page import="Controller.LoginPage"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Model.dbCon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="css/booking.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <%
   LoginPage loginUser = (LoginPage) session.getAttribute("loginUser");
   String uname=  loginUser.getUsername();
   
%>
       
        <nav>
            <div class="logo">
                <h4>The New View</h4>
            </div>
            <ul class="nav-links">
                <li><a href="indexaccess.html" style="color:white;">Home</a></li>
                <li><a href="" style="color:white;">Booking</a></li>
                <li><a href="facilitiesaccess.html" style="color:white;">Facilities</a></li>
                <li><a href="feedbackaccess.html" style="color:white;">Feedback</a></li>
                <li><a href="galleryaccess.html" style="color:white;">Gallery</a></li>
                <li><a href="profile.jsp" style="color:white;">Profile</a></li>
            </ul>
            <div class="burger">
                <div class="line1"></div>
                <div class="line2"></div>
                <div class="line3"></div>
            </div>
        </nav>
          
        <div class="col-12" style="padding-bottom: 0px;">
            <h2 style="text-align: center; margin-top: 50px; margin-bottom: 20px;"><b>ROOMS FOR BOOKING</b></h2>
        </div>
        <div class="row" style="margin-bottom: 20px; text-align: center;">
          <div class="col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;">
            <h3 style="text-align: left; margin-bottom: 10px; margin-top: 40px; margin-left: 70px;">Single Room</h3>
            <img src="images/single.jpg" style="width: 700px; height: 400px;">   
          </div>
          <div class="col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;">
            <p style="margin-top: 75px; margin-bottom: 20px;">A room assigned to one person. May have one or more beds.</p>
            <p style="margin-top: 10px; margin-bottom: 10px;">Standard Single Rooms provide a twin bed, a private half bathroom (including a sink and toilet), a writing desk, an in-room safe, television, complimentary wifi internet access, daily housekeeping and air conditioning.</p>
            <p style="margin-bottom: 10px;">1500.00 Lkr for one night.</p>
            <p style="margin-bottom: 10px;">Additional charges apply for your breakfest, lunch, dinner and your any food or bevarages</p>
            <h1 style="text-align: center; margin-bottom: 10px; margin-top: 40px; font-size: 25px;"><b>Available Rooms</b></h1>
            
            <%
                int singleCount;
                
                try {
                    
               dbCon con=new dbCon();
               ResultSet rslt=con.roomAvailability("single");
               
               while(rslt.next()){
               String string = rslt.getString(1);
               singleCount = Integer.parseInt(string);

               %>
               <div class="form">
                 <div class="inputfield">
                   <a href="" class="btn" style="background: #6ea2f5; font-size: 20px; width: 10%; color: white;"><%=singleCount %></a>
                 </div>
                </div>
               <%
               }
               
                }
  
                catch(Exception se) {
                   se.printStackTrace();
                }

            %>
            
          </div>
        </div>
        <div class="row" style="margin-bottom: 20px; text-align: center;">
          <div class="col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;">
            <h3 style="text-align: left; margin-bottom: 10px; margin-top: 40px; margin-left: 70px;">Double Room</h3>
            <img src="images/double.png" style="width: 700px; height: 400px;">
          </div>
          <div class="col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;">
            <p style="margin-top: 75px; margin-bottom: 20px;">A room assigned to two people. May have one or more beds.</p>
            <p style="margin-top: 10px; margin-bottom: 10px;">Standard Double Rooms provide a two twin bed, a private half bathroom (including a sink and toilet), a writing desk, an in-room safe, television, complimentary wifi internet access, daily housekeeping and air conditioning.</p>
            <p style="margin-bottom: 10px;">2000.00 Lkr for one night.</p>
            <p style="margin-bottom: 10px;">Additional charges apply for your breakfest, lunch, dinner and your any food or bevarages</p>
            <h1 style="text-align: center; margin-bottom: 10px; margin-top: 40px; font-size: 25px;"><b>Available Rooms</b></h1>
            
            <%
                int doubleCount;
                
                try {
                    
               dbCon con=new dbCon();
               ResultSet rslt=con.roomAvailability("doubleroom");
               
               while(rslt.next()){
               String string = rslt.getString(1);
               doubleCount = Integer.parseInt(string);

               %>
               <div class="form">
                 <div class="inputfield">
                   <a href="" class="btn" style="background: #6ea2f5; font-size: 20px; width: 10%; color: white;"><%=doubleCount %></a>
                 </div>
                </div> 
               <%
               }
               
                }
  
               catch(Exception se) {
                   se.printStackTrace();
               }

            %>
            
          </div>
        </div>
        <div class="row" style="margin-bottom: 20px; text-align: center;">
          <div class="col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;">
            <h3 style="text-align: left; margin-bottom: 10px; margin-top: 40px; margin-left: 70px;">King Room</h3>
            <img src="images/king.jpeg" style="width: 700px; height: 400px;">  
          </div>
          <div class="col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;">
            <p style="margin-top: 75px; margin-bottom: 20px;">A room with a king-sized bed. May be occupied by one or more people.</p>
            <p style="margin-top: 10px; margin-bottom: 10px;">Standard King Rooms provide a twin bed, a private half bathroom (including a sink and toilet), a writing desk, an in-room safe, television, complimentary wifi internet access, daily housekeeping and air conditioning.</p>
            <p style="margin-bottom: 10px;">3000.00 Lkr for one night.</p>
            <p style="margin-bottom: 10px;">Additional charges apply for your breakfest, lunch, dinner and your any food or bevarages</p>
            <h1 style="text-align: center; margin-bottom: 10px; margin-top: 40px; font-size: 25px;"><b>Available Rooms</b></h1>
               
            <%
                int kingCount;
                
                try {
                    
               dbCon con=new dbCon();
               ResultSet rslt=con.roomAvailability("king");
               
               while(rslt.next()){
               String string = rslt.getString(1);
               kingCount = Integer.parseInt(string);

               %>
                <div class="form">
                 <div class="inputfield">
                   <a href="" class="btn" style="background: #6ea2f5; font-size: 20px; width: 10%; color: white;"><%=kingCount %></a>
                 </div>
                </div>  
               <%
               }
               
                }
  
               catch(Exception se) {
                   se.printStackTrace();
                }

            %>
            
          </div>
        </div>
        <div class="wrapper" style="margin-top: 130px; margin-bottom: 100px;">
    <div class="title">
      Please fill in the reservation form below :-
    </div>
    <form action="./reservation" method="post">
    <div class="form">
       <div class="inputfield">
            <input type="hidden" name="userName" value=<%=uname %>>
       </div>
       <div class="inputfield">
          <label>Name</label>
          <input type="text" class="input" name="name">
       </div>  
        <div class="inputfield">
          <label>Your Email</label>
          <input type="text" class="input" name="email">
       </div>  
       <div class="inputfield">
          <label>Check IN</label>
          <input type="date" class="input" name="indate">
       </div>  
      <div class="inputfield">
          <label>Check OUT</label>
          <input type="date" class="input" name="outdate">
       </div> 
        <div class="inputfield">
          <label>Room</label>
          <div class="custom_select">
            <select name="room">
              <option value="single">Single</option>
              <option value="doubleroom">Double</option>
              <option value="king">King</option>
            </select>
          </div>
        </div> 
        <div class="inputfield">
          <label>Phone</label>
          <input type="text" class="input" name="phone">
       </div>
        <div class="inputfield">
          <label>Message</label>
          <textarea rows="5" cols="23" class="input" name="message"></textarea>
       </div>
        <div class="inputfield">
        <%-- <a href="" class="btnn" style="margin-left: 35px;">Pay online</a> --%>
        <input type="submit" value="Book Reservation" class="btn" style="margin-left: 140px;">
      </div>
    </div>
    </form>
    </div>
        <div class="footer">
        <div class="footer-content">
            <h3>The New View</h3>
            <p>We are proudly welcome you all to our biggest Hotel Environment.</p>
            <ul class="socials" style="margin-right: 25px;">
                <li><a href="https://www.facebook.com/AnantaraTangalle/"><i class="fa fa-facebook"></i></a></li>
                <li><a href="https://twitter.com/Anantara_Hotels?t=nxitvegiN-oqLXLe59NWQg&s=09"><i class="fa fa-twitter"></i></a></li>
                <li><a href="https://www.youtube.com/channel/UCEUFeYcxgUJrOMwXkYW2CRw"><i class="fa fa-youtube"></i></a></li>
            </ul>
            <p style="text-align: center; margin-top: -20px;">
                TheNewView@gmail.com
            </p>
            <p style="text-align: center; margin-top: 0px;">
                0761165455
            </p>
        </div>
        <div class="footer-bottom">
            <p>Copyright © 2021 TheNewView <span>TheNewView</span></p>
        </div>
        </div>
        <script src="js/app.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
