<%-- 
    Document   : feedbackretrieve
    Created on : Jan 27, 2022, 12:03:11 AM
    Author     : Nonim
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="css/retrieve.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <nav>
            <div class="logo">
                <h4>The New View</h4>
            </div>            
        </nav>
        
        <h2 style="text-align: center; margin-top: 50px; margin-bottom: 20px;"><b>Details of Reservations</b></h2>
        
        <table style="width: 95%; border: 1px solid black; border-collapse: collapse; text-align: center ; margin-top: 100px; margin-bottom: 150px; align-content: center; margin-left: auto; margin-right: auto;">
            <tr>
                <th>BookingID</th>
                <th>Username</th>
                <th>Name</th>
                <th>Email</th>  
                <th>CheckIN</th>
                <th>CheckOUT</th>
                <th>Room</th>
                <th>Phone</th>
                <th>Message</th>
                <th>BookedTime</th>
                <th>BookingStatus</th>
                <th></th>
            </tr>
        
            <%
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelwebdata", "root", "");
                Statement st = con.createStatement();
                String str = "select * from reservation";
                ResultSet rs = st.executeQuery(str);
                while(rs.next()){
                 %>      
                 <tr>
                     <form method="post" action="UpdateStatus">
                     <td><%=rs.getString("bookingId")%></td>
                     <td><%=rs.getString("Username")%></td>
                     <td><%=rs.getString("name")%></td>
                     <td><%=rs.getString("email")%></td>
                     <td><%=rs.getString("checkIn")%></td>
                     <td><%=rs.getString("CheckOut")%></td>
                     <td><%=rs.getString("room")%></td>
                     <td><%=rs.getString("phone")%></td>
                     <td><%=rs.getString("message")%></td>
                     <td><%=rs.getString("bookedTime")%></td>
                     <td><%=rs.getString("bookingStatus")%></td>
                     <input type="hidden" name="bookingId" value=<%=rs.getString("bookingId")%>>
                     <input type="hidden" name="bookingStatus" value="0">
                     <td><input type="submit" value="CheckedOut" style="border: none; background: #f56e87; color: white; border-radius: 5px; margin-top: 5px; margin-bottom: 5px; height:35px; width:110px"></td>
                     </form>
                     
                 </tr>
                <% }
                }
            catch (Exception e)
                    {
                        
                    }
                %>
        </table>                 
        
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