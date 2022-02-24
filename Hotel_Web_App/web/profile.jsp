<%-- 
    Document   : Profile
    Created on : Jan 26, 2022, 1:35:03 PM
    Author     : Nonim
--%>

<%@page import="java.sql.*"%>
<%@ page import="Controller.LoginPage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<%
   LoginPage loginUser = (LoginPage) session.getAttribute("loginUser");
   
   
%>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="css/profile.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <nav>
            <div class="logo">
                <h4>The New View</h4>
            </div>
            <ul class="nav-links">
                <li><a href="indexaccess.html" style="color:white;">Home</a></li>
                <li><a href="bookingJsp.jsp" style="color:white;">Booking</a></li>
                <li><a href="facilitiesaccess.html" style="color:white;">Facilities</a></li>
                <li><a href="feedbackaccess.html" style="color:white;">Feedback</a></li>
                <li><a href="galleryaccess.html" style="color:white;">Gallery</a></li>
                <li><a href="" style="color:white;">Profile</a></li>
            </ul>
            <div class="burger">
                <div class="line1"></div>
                <div class="line2"></div>
                <div class="line3"></div>
            </div>
        </nav>
     
        
        
        
        
        <%
          try {
            String uname=  loginUser.getUsername();
 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelwebdata","root","");
            
            PreparedStatement preparedStatement = con.prepareStatement ("select firstName,lastName,NICNumber,Address,Gender,Phone,Email,Nationality,Password from signup where Username =?");
            preparedStatement.setObject(1, uname);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
        %>
         
    <div class="wrapper" style="margin-top: 140px;">
    <div class="title">
      Your Profile
    </div>
        
        
    
    <div class="form">
    <form  method="post" action="UpdateUser"> 
        
        <div class="inputfield">
            <input type="hidden" name="userName" value=<%=uname %>>
       </div>
        <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">First Name</label>
          <input  style="text-align: center;" type="text" name="firstName" value=<%=rs.getString("firstName") %>>
       </div>
        <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">Last Name</label>
          <input  style="text-align: center;" type="text" name="lastName" value=<%=rs.getString("lastName") %>>
       </div>
       <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">NIC Number</label>
          <input  style="text-align: center;" type="text" name="NICNumber" value=<%=rs.getString("NICNumber") %>>
       </div>
        <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">Address</label>
          <input  style="text-align: center;" type="text" name="Address" value=<%=rs.getString("Address") %>>
       </div>
        <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">Gender</label>
          <input  style="text-align: center;" type="text" name="Gender" value=<%=rs.getString("Gender") %>>
       </div>
        <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">Phone</label>
          <input  style="text-align: center;" type="text" name="Phone" value=<%=rs.getString("Phone") %>>
       </div>
        <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">Email</label>
          <input  style="text-align: center;" type="text" name="Email" value=<%=rs.getString("Email") %>>
       </div>
       <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">Nationality</label>
          <input  style="text-align: center;" type="text" name="Nationality" value=<%=rs.getString("Nationality") %>>
       </div>
       <div class="inputfield">
          <label style="text-align: center; margin-top: 10px;">Password</label>
          <input  style="text-align: center;" type="text" name="Password" value=<%=rs.getString("Password") %>>
       </div>     
       <div class="inputfield">
          <label style="text-align: center; margin-top: 10px; margin-left: 0px">Click here to Update Details</label>
          <input style="width: 40%;" class="btn" type="submit" value="Update">
      </div>
      
      </form>    
       <form  method="post" action="DeleteUser">       
       <div class="inputfield">
           <input type="hidden" name="userName" value=<%=uname %>>
          <label style="text-align: center; margin-top: 20px; margin-left: 0px">Click here to Delete Account</label>
          <input style="width: 40%; margin-top: 10px;" class="btn" type="submit" value="Delete">
      </div>
       <div class="inputfield">
          <a href="index.html" class="btnn">Logout</a>
      </div>
    </form>   
    </div>      
    </div>
       
       
       
       
        <%
            }
            
          } catch (Exception e){
          
          }  
        %>
        
        
            
        
        
        <div class="footer" style="margin-top: 180px;">
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
