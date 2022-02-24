<%-- 
    Document   : cancellation
    Created on : Feb 9, 2022, 5:50:32 PM
    Author     : Nonim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="bookingCancellation" method="post">
            <div>
              <label>Enter your Booking Id</label>
              <input type="text" name="bookingId" style="margin-bottom: 10px;">
            </div>
            <div>
              <label>Cancel Reason</label>
              <input type="text" name="cancelReason">
            </div>
            <input type="submit" value="cancel reservation" style="margin-top: 20px;">
        </form>
    </body>
</html>
