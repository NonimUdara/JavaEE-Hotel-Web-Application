package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Controller.LoginPage;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

   LoginPage loginUser = (LoginPage) session.getAttribute("loginUser");
   

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/profile.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <h4>The New View</h4>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav-links\">\n");
      out.write("                <li><a href=\"indexaccess.html\" style=\"color:white;\">Home</a></li>\n");
      out.write("                <li><a href=\"bookingaccess.html\" style=\"color:white;\">Booking</a></li>\n");
      out.write("                <li><a href=\"facilitiesaccess.html\" style=\"color:white;\">Facilities</a></li>\n");
      out.write("                <li><a href=\"feedbackaccess.html\" style=\"color:white;\">Feedback</a></li>\n");
      out.write("                <li><a href=\"galleryaccess.html\" style=\"color:white;\">Gallery</a></li>\n");
      out.write("                <li><a href=\"\" style=\"color:white;\">Profile</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"burger\">\n");
      out.write("                <div class=\"line1\"></div>\n");
      out.write("                <div class=\"line2\"></div>\n");
      out.write("                <div class=\"line3\"></div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("        Your Username is :\n");
      out.write("        ");
      out.print( loginUser.getUsername());
      out.write("\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

          try {
            String uname=  loginUser.getUsername();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelwebdata","root","");
            
            
            PreparedStatement preparedStatement = con.prepareStatement ("select fname from signup where uname =?");
            preparedStatement.setObject(1, uname);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
        
      out.write("\n");
      out.write("        <p>\n");
      out.write("        Your Firstname is :\n");
      out.write("        ");
      out.print(rs.getString("fname") );
      out.write("\n");
      out.write("        </p>\n");
      out.write("        ");

            }
            
          } catch (Exception e){
          
          }  
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("    <div class=\"title\">\n");
      out.write("      Your Profile\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    <div class=\"form\">\n");
      out.write("          \n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label style=\"text-align: center; margin-top: 10px;\">Last Name</label>\n");
      out.write("          <label style=\"text-align: center;\"></label>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"inputfield\">\n");
      out.write("          <label style=\"text-align: center; margin-top: 10px;\">NIC Number</label>\n");
      out.write("          <label style=\"text-align: center;\"></label>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label style=\"text-align: center; margin-top: 10px;\">Address</label>\n");
      out.write("          <label style=\"text-align: center;\"></label>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label style=\"text-align: center; margin-top: 10px;\">Gender</label>\n");
      out.write("          <label style=\"text-align: center;\"></label>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label style=\"text-align: center; margin-top: 10px;\">Phone</label>\n");
      out.write("          <label style=\"text-align: center;\"></label>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"inputfield\">\n");
      out.write("          <label style=\"text-align: center; margin-top: 10px;\">Email</label>\n");
      out.write("          <label style=\"text-align: center;\"></label>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"inputfield\">\n");
      out.write("          <label style=\"text-align: center; margin-top: 10px;\">Nationality</label>\n");
      out.write("          <label style=\"text-align: center;\"></label>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"inputfield\">\n");
      out.write("          <label style=\"text-align: center; margin-top: 10px;\">Password</label>\n");
      out.write("          <label style=\"text-align: center;\"></label>\n");
      out.write("       </div>\n");
      out.write("      <div class=\"inputfield\">\n");
      out.write("          <a href=\"index.html\" class=\"btn\">Logout</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    </div>      \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"footer\">\n");
      out.write("        <div class=\"footer-content\">\n");
      out.write("            <h3>The New View</h3>\n");
      out.write("            <p>We are proudly welcome you all to our biggest Hotel Environment.</p>\n");
      out.write("            <ul class=\"socials\">\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-linkedin-square\"></i></a></li>\n");
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
