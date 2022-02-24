/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.dbCon;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nonim
 */
public class reservation extends HttpServlet {
int bookingId;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet reservation</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet reservation at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        dbCon con1 =new dbCon();
        try {
            
            bookingId=con1.findBookingId();
            
        } catch (SQLException ex) {
            Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(reservation.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        String userName = request.getParameter("userName");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String checkin = request.getParameter("indate");
        String checkout = request.getParameter("outdate");
        String room = request.getParameter("room");
        String phone = request.getParameter("phone");
        String message = request.getParameter("message");
        String subject = "Reservation Successfully";
        String cancelPage="http://localhost:8080/Hotel_Web_App/cancellation.jsp";
        String emailMsg = "Welcome "+name+ 
                          "\nBooking ID : "+bookingId+
                          "\nYour userName : "+userName+ 
                          "\nCheck In Date : "+checkin+ 
                          "\nCheck Out Date : "+checkout+
                          "\nRoom Type : "+room+
                          "\nTo cancel your reservation : "+cancelPage+
                          "\n\nThank You ! "  ;
        String user="thehotelnewview@gmail.com";
        String pass="sc2000#y7";
        
        
        
        try {
               dbCon con=new dbCon();
               String alert=con.reserveUser(userName,name, email, checkin, checkout, room, phone, message,subject,emailMsg,user,pass);
              
                   out.println(alert);
                  

           }
        catch(Exception se) {
            se.printStackTrace();
        }
    
    }

    
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
