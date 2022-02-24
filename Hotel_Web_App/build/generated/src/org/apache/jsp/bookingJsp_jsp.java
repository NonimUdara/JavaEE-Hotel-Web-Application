package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.LoginPage;
import java.sql.ResultSet;
import Model.dbCon;

public final class bookingJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/booking.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

   LoginPage loginUser = (LoginPage) session.getAttribute("loginUser");
   String uname=  loginUser.getUsername();
   

      out.write("\n");
      out.write("       \n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <h4>The New View</h4>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav-links\">\n");
      out.write("                <li><a href=\"indexaccess.html\" style=\"color:white;\">Home</a></li>\n");
      out.write("                <li><a href=\"\" style=\"color:white;\">Booking</a></li>\n");
      out.write("                <li><a href=\"facilitiesaccess.html\" style=\"color:white;\">Facilities</a></li>\n");
      out.write("                <li><a href=\"feedbackaccess.html\" style=\"color:white;\">Feedback</a></li>\n");
      out.write("                <li><a href=\"galleryaccess.html\" style=\"color:white;\">Gallery</a></li>\n");
      out.write("                <li><a href=\"profile.jsp\" style=\"color:white;\">Profile</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"burger\">\n");
      out.write("                <div class=\"line1\"></div>\n");
      out.write("                <div class=\"line2\"></div>\n");
      out.write("                <div class=\"line3\"></div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("          \n");
      out.write("        <div class=\"col-12\" style=\"padding-bottom: 0px;\">\n");
      out.write("            <h2 style=\"text-align: center; margin-top: 50px; margin-bottom: 20px;\"><b>ROOMS FOR BOOKING</b></h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"margin-bottom: 20px; text-align: center;\">\n");
      out.write("          <div class=\"col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;\">\n");
      out.write("            <h3 style=\"text-align: left; margin-bottom: 10px; margin-top: 40px; margin-left: 70px;\">Single Room</h3>\n");
      out.write("            <img src=\"images/single.jpg\" style=\"width: 700px; height: 400px;\">   \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;\">\n");
      out.write("            <p style=\"margin-top: 75px; margin-bottom: 20px;\">A room assigned to one person. May have one or more beds.</p>\n");
      out.write("            <p style=\"margin-top: 10px; margin-bottom: 10px;\">Standard Single Rooms provide a twin bed, a private half bathroom (including a sink and toilet), a writing desk, an in-room safe, television, complimentary wifi internet access, daily housekeeping and air conditioning.</p>\n");
      out.write("            <p style=\"margin-bottom: 10px;\">1500.00 Lkr for one night.</p>\n");
      out.write("            <p style=\"margin-bottom: 10px;\">Additional charges apply for your breakfest, lunch, dinner and your any food or bevarages</p>\n");
      out.write("            <h1 style=\"text-align: center; margin-bottom: 10px; margin-top: 40px; font-size: 25px;\"><b>Available Rooms</b></h1>\n");
      out.write("            \n");
      out.write("            ");

                int singleCount;
                
                try {
                    
               dbCon con=new dbCon();
               ResultSet rslt=con.roomAvailability("singleroom");
               
               while(rslt.next()){
               String string = rslt.getString(1);
               singleCount = Integer.parseInt(string);

               
      out.write("\n");
      out.write("               <div class=\"form\">\n");
      out.write("                 <div class=\"inputfield\">\n");
      out.write("                   <a href=\"\" class=\"btn\" style=\"background: #6ea2f5; font-size: 20px; width: 10%; color: white;\">");
      out.print(singleCount );
      out.write("</a>\n");
      out.write("                 </div>\n");
      out.write("                </div>\n");
      out.write("               ");

               }
               
                }
  
                catch(Exception se) {
                   se.printStackTrace();
                }

            
      out.write("\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"margin-bottom: 20px; text-align: center;\">\n");
      out.write("          <div class=\"col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;\">\n");
      out.write("            <h3 style=\"text-align: left; margin-bottom: 10px; margin-top: 40px; margin-left: 70px;\">Double Room</h3>\n");
      out.write("            <img src=\"images/double.png\" style=\"width: 700px; height: 400px;\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;\">\n");
      out.write("            <p style=\"margin-top: 75px; margin-bottom: 20px;\">A room assigned to two people. May have one or more beds.</p>\n");
      out.write("            <p style=\"margin-top: 10px; margin-bottom: 10px;\">Standard Double Rooms provide a two twin bed, a private half bathroom (including a sink and toilet), a writing desk, an in-room safe, television, complimentary wifi internet access, daily housekeeping and air conditioning.</p>\n");
      out.write("            <p style=\"margin-bottom: 10px;\">2000.00 Lkr for one night.</p>\n");
      out.write("            <p style=\"margin-bottom: 10px;\">Additional charges apply for your breakfest, lunch, dinner and your any food or bevarages</p>\n");
      out.write("            <h1 style=\"text-align: center; margin-bottom: 10px; margin-top: 40px; font-size: 25px;\"><b>Available Rooms</b></h1>\n");
      out.write("            \n");
      out.write("            ");

                int doubleCount;
                
                try {
                    
               dbCon con=new dbCon();
               ResultSet rslt=con.roomAvailability("doubleroom");
               
               while(rslt.next()){
               String string = rslt.getString(1);
               doubleCount = Integer.parseInt(string);

               
      out.write("\n");
      out.write("               <div class=\"form\">\n");
      out.write("                 <div class=\"inputfield\">\n");
      out.write("                   <a href=\"\" class=\"btn\" style=\"background: #6ea2f5; font-size: 20px; width: 10%; color: white;\">");
      out.print(doubleCount );
      out.write("</a>\n");
      out.write("                 </div>\n");
      out.write("                </div> \n");
      out.write("               ");

               }
               
                }
  
               catch(Exception se) {
                   se.printStackTrace();
               }

            
      out.write("\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"margin-bottom: 20px; text-align: center;\">\n");
      out.write("          <div class=\"col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;\">\n");
      out.write("            <h3 style=\"text-align: left; margin-bottom: 10px; margin-top: 40px; margin-left: 70px;\">King Room</h3>\n");
      out.write("            <img src=\"images/king.jpeg\" style=\"width: 700px; height: 400px;\">  \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-12 col-sm-12 col-md-12 col-lg-6 text-align: center;\">\n");
      out.write("            <p style=\"margin-top: 75px; margin-bottom: 20px;\">A room with a king-sized bed. May be occupied by one or more people.</p>\n");
      out.write("            <p style=\"margin-top: 10px; margin-bottom: 10px;\">Standard King Rooms provide a twin bed, a private half bathroom (including a sink and toilet), a writing desk, an in-room safe, television, complimentary wifi internet access, daily housekeeping and air conditioning.</p>\n");
      out.write("            <p style=\"margin-bottom: 10px;\">3000.00 Lkr for one night.</p>\n");
      out.write("            <p style=\"margin-bottom: 10px;\">Additional charges apply for your breakfest, lunch, dinner and your any food or bevarages</p>\n");
      out.write("            <h1 style=\"text-align: center; margin-bottom: 10px; margin-top: 40px; font-size: 25px;\"><b>Available Rooms</b></h1>\n");
      out.write("               \n");
      out.write("            ");

                int kingCount;
                
                try {
                    
               dbCon con=new dbCon();
               ResultSet rslt=con.roomAvailability("kingroom");
               
               while(rslt.next()){
               String string = rslt.getString(1);
               kingCount = Integer.parseInt(string);

               
      out.write("\n");
      out.write("                <div class=\"form\">\n");
      out.write("                 <div class=\"inputfield\">\n");
      out.write("                   <a href=\"\" class=\"btn\" style=\"background: #6ea2f5; font-size: 20px; width: 10%; color: white;\">");
      out.print(kingCount );
      out.write("</a>\n");
      out.write("                 </div>\n");
      out.write("                </div>  \n");
      out.write("               ");

               }
               
                }
  
               catch(Exception se) {
                   se.printStackTrace();
                }

            
      out.write("\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper\" style=\"margin-top: 130px; margin-bottom: 100px;\">\n");
      out.write("    <div class=\"title\">\n");
      out.write("      Please fill in the reservation form below :-\n");
      out.write("    </div>\n");
      out.write("    <form action=\"./reservation\" method=\"post\">\n");
      out.write("    <div class=\"form\">\n");
      out.write("       <div class=\"inputfield\">\n");
      out.write("            <input type=\"hidden\" name=\"userName\" value=");
      out.print(uname );
      out.write(">\n");
      out.write("       </div>\n");
      out.write("       <div class=\"inputfield\">\n");
      out.write("          <label>Name</label>\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"name\">\n");
      out.write("       </div>  \n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label>Your Email</label>\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"email\">\n");
      out.write("       </div>  \n");
      out.write("       <div class=\"inputfield\">\n");
      out.write("          <label>Check IN</label>\n");
      out.write("          <input type=\"date\" class=\"input\" name=\"indate\">\n");
      out.write("       </div>  \n");
      out.write("      <div class=\"inputfield\">\n");
      out.write("          <label>Check OUT</label>\n");
      out.write("          <input type=\"date\" class=\"input\" name=\"outdate\">\n");
      out.write("       </div> \n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label>Room</label>\n");
      out.write("          <div class=\"custom_select\">\n");
      out.write("            <select name=\"room\">\n");
      out.write("              <option value=\"0\">Single</option>\n");
      out.write("              <option value=\"1\">Double</option>\n");
      out.write("              <option value=\"2\">King</option>\n");
      out.write("            </select>\n");
      out.write("          </div>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label>Phone</label>\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"phone\">\n");
      out.write("       </div>\n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label>Message</label>\n");
      out.write("          <textarea rows=\"5\" cols=\"23\" class=\"input\" name=\"message\"></textarea>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"Book Reservation\" class=\"btn\" style=\"margin-left: 140px;\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("        <div class=\"footer-content\">\n");
      out.write("            <h3>The New View</h3>\n");
      out.write("            <p>We are proudly welcome you all to our biggest Hotel Environment.</p>\n");
      out.write("            <ul class=\"socials\" style=\"margin-right: 25px;\">\n");
      out.write("                <li><a href=\"https://www.facebook.com/AnantaraTangalle/\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                <li><a href=\"https://twitter.com/Anantara_Hotels?t=nxitvegiN-oqLXLe59NWQg&s=09\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                <li><a href=\"https://www.youtube.com/channel/UCEUFeYcxgUJrOMwXkYW2CRw\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-bottom\">\n");
      out.write("            <p>Copyright © 2021 TheNewView <span>TheNewView</span></p>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/app.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
