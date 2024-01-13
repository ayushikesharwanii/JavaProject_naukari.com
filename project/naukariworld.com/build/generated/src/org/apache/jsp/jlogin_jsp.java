package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/master/link.jsp");
    _jspx_dependants.add("/master/header.jsp");
    _jspx_dependants.add("/master/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<link href=\"css/bootsrap-theme.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/generalcss.css\" rel=\"stylesheet\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .head{\n");
      out.write("                height: 300px;\n");
      out.write("                background: url('project/n117.jpeg');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                 background-size: 100% 100%;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            .head1{\n");
      out.write("                height: 300px;\n");
      out.write("                background: rgba(0,0,0,.4);\n");
      out.write("                color:white;\n");
      out.write("                }\n");
      out.write("                .sign{\n");
      out.write("                    min-height: 600px;\n");
      out.write("                }\n");
      out.write("                .h{\n");
      out.write("                    min-height: 400px;\n");
      out.write("                    padding: 4% 8%;\n");
      out.write("                }\n");
      out.write("                .txt{\n");
      out.write("              min-height: 50px;\n");
      out.write("               border-radius: 0px;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .Btn{\n");
      out.write("                min-height: 50px;\n");
      out.write("                width: 100%;\n");
      out.write("                background: #faaa5d;\n");
      out.write("                border:none;\n");
      out.write("            }\n");
      out.write("            .h2{\n");
      out.write("              box-shadow: 2px 2px 8px black;\n");
      out.write("              font-size:15px;\n");
      out.write("              height:380px;\n");
      out.write("              padding: 5%;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("                <div class=\"col-sm-12 head\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                  <div class=\"col-sm-12 head1\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                      ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("          <nav class=\"navbar navbar-default\" id=\"menu1\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\" style=\"color:white; font-weight: bold; font-size:25px;\">NAUKARI <b  style=\"color:white; font-size:25px; color:#faaa5d;\">WORLD</b></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("       \n");
      out.write("        <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("        <li><a href=\"about.jsp\">ABOUT</a></li>\n");
      out.write("        <li><a href=\"job.jsp\">JOBS</a></li>\n");
      out.write("        <li><a href=\"campanies.jsp\">COMPANIES</a></li>\n");
      out.write("        <li><a href=\"contact.jsp\">CONTACT</a></li>\n");
      out.write("        <li><a href=\"signup.jsp\">SIGN UP</a></li>\n");
      out.write("        <li><a href=\"jlogin.jsp\">SIGN IN</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <input type=\"submit\" value=\"+ post a Job\" name=\"sumit\" id=\"btn\">\n");
      out.write("      \n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                 ");
      out.write("<br><br><br><br><br>\n");
      out.write("                     <center> <b style=\"padding:5%; color:white; font-size:40px; text-align: center;\">Sign <b style=\"color:#faaa5d;;\">In\n");
      out.write("                      <span class=\"fa fa-user\"></span></b></b></center></div>  \n");
      out.write("                      </div>  \n");
      out.write("                </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                     \n");
      out.write("                         <div class=\"col-sm-12 signin\">\n");
      out.write("                         <div class=\"col-sm-1\"></div>\n");
      out.write("                         <div class=\"col-sm-10 h\">\n");
      out.write("                             <div class=\"col-sm-6 h1\">\n");
      out.write("                                <img src=\"project/n108.png\" height=\"300px\" width=\"300px\"> \n");
      out.write("                               \n");
      out.write("                             </div>\n");
      out.write("                           <div class=\"col-sm-6 h2\">\n");
      out.write("                             <form method=\"post\" action=\"code/jscode.jsp\">\n");
      out.write("                                 EMAIL<input type=\"email\" name=\"email\" class=\"form-control txt\" placeholder=\"Email address\"/><br>\n");
      out.write("                                 PASSWORD<input type=\"password\" name=\"passwd\" class=\"form-control txt\" placeholder=\"Password\"/><br>\n");
      out.write("                                 <input type=checkbox>Remember me <span style=\"float:right;\">Forgot Password</span><br><br> \n");
      out.write("                            <input type=\"submit\" value=\"Sign In\" class=\"Btn\"/>\n");
      out.write("                            <center><p style=\"padding: 40px; font-size: 13px;\">Don't have an account? <span style=\"color:#faaa5d;\">Register here</span></p></center>\n");
      out.write("                        </form>\n");
      out.write("                           </div>\n");
      out.write("                             \n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"col-sm-1\"></div>\n");
      out.write("                         \n");
      out.write("                         </div>\n");
      out.write("                 ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-12 footer\">\n");
      out.write("                    <div class=\"col-sm-3 f1\">\n");
      out.write("                      <b style=\"font-size:20px;\">NAUKARI WORLD </b><br/><br><br>\n");
      out.write("                      <span class=\"fa fa-location-arrow\"></span>20/f Green Road Dhanmondi Dhaka<br><br>\n");
      out.write("                      <span class=\"fa fa-email\"></span>info@naukariworld.com<br><br>\n");
      out.write("                      <span class=\"fa fa-wordpress\"></span>info@naukariworld.com<br><br>\n");
      out.write("                      <span class=\"fa fa-phone\"></span>+0123456789<br><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3 f1\">\n");
      out.write("                        <b style=\"font-size:20px;\">Job Seekers </b><br/><br><br>\n");
      out.write("                       Create Account<br><br>\n");
      out.write("                       Career Counseling<br><br>\n");
      out.write("                       My Oficiona<br><br>\n");
      out.write("                       FAQ<br><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3 f1\">\n");
      out.write("                     <b style=\"font-size:20px;\">Employers</b><br/><br><br>\n");
      out.write("                       Create Account<br><br>\n");
      out.write("                       Products $ SErvice<br><br>\n");
      out.write("                       post a Task<br><br>\n");
      out.write("                       FAQ<br><br>   \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3 f1\">\n");
      out.write("                       <b style=\"font-size:20px;\">Newsletter</b><br/><br><br>\n");
      out.write("                       Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                     Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br><br>\n");
      out.write("                     <div class=\"input-group\">\n");
      out.write("                         <input type=\"text\" class=\"form-control\" placeholder=\"enter your name\">\n");
      out.write("                         <span class=\"input-group-addon\" style=\"background:#faaa5d;\"><span class=\"fa fa-envelope-o\"></span></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 lfooter\">\n");
      out.write("                        \n");
      out.write("                        <span style=\"color:#dbdbdb; font-size:15px; \"> @2019Lorem ipsum dolor sit amet, consectetur adipiscing elit. </span>\n");
      out.write("                        <span class=\"fa fa-info\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                        <span class=\"fa fa-wifi\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                        <span class=\"fa fa-google-plus\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                        <span class=\"fa fa-twitch\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                        <span class=\"fa fa-facebook\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                    </div>\n");
      out.write("                        </div>\n");
      out.write("            </div>");
      out.write("      \n");
      out.write("          \n");
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
