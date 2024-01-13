package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import test.DBMANAGER;

public final class job_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <style>\n");
      out.write("        .job{\n");
      out.write("                min-height: 600px;\n");
      out.write("            } \n");
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
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("               .recentjobs{\n");
      out.write("                min-height:500px;\n");
      out.write("                background: #f9f9f9;\n");
      out.write("                margin: 3%;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .r{\n");
      out.write("               background: white;\n");
      out.write("                min-height: 100px;\n");
      out.write("                border:1px solid #e6e6e6;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                margin-top:3%;\n");
      out.write("            }\n");
      out.write("            .r:hover{\n");
      out.write("               background: #f9f9f9;\n");
      out.write("            }\n");
      out.write("            .logo{\n");
      out.write("                height:100px;\n");
      out.write("                padding-top:5%;\n");
      out.write("                margin-top:8%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .r1{\n");
      out.write("                border:red;\n");
      out.write("            }\n");
      out.write("            #btn2{\n");
      out.write("                height:40px;\n");
      out.write("                width:130px;\n");
      out.write("                \n");
      out.write("                border-radius:20px;\n");
      out.write("                background: transparent;\n");
      out.write("                border:1px solid #6d6d6d;\n");
      out.write("                margin-top:20%; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("                \n");
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
      out.write("                     <center> <b style=\"padding:5%;color:white; font-size:40px; text-align: center;\">Job \n");
      out.write("                             <span class=\"fa fa-user\" style=\"color:#faaa5d;\"></span></b></center></div>  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12 job\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-2\">\n");
      out.write("                        <H1>Job Category</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                         <div class=\"col-sm-12 recentjobs\">\n");
      out.write("                    \n");
      out.write("                 <p style=\"text-align: center; font-size:30px; padding-top:5%; font-weight: bold;\">Recent Jobs</p>\n");
      out.write("                 <p style=\"text-align: center; font-size:16px; color:#4d4d4d; padding-bottom:20px;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>  \n");
      out.write("                  <div class=\"col-sm-1\"></div>\n");
      out.write("                  <div class=\"col-sm-10\">\n");
      out.write("                      \n");
      out.write("                      ");

                                DBMANAGER db=new DBMANAGER();
                                String cmd="select * from tbljobs order by jid desc limit 0,20";
                                ResultSet rs=db.ExecuteSelect(cmd);
                                int i=1;
                                while(rs.next())
                                {
                                
      out.write("\n");
      out.write("                      <div class=\"col-sm-12 r\">\n");
      out.write("                          <div class=\"col-sm-2\">\n");
      out.write("                              <img src=\"regimg/");
out.print(rs.getString(5)); 
      out.write("\" class=\"logo\" style=\"height:70px; width:90px\"> \n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-sm-7\">\n");
      out.write("                             <b style=\"font-size:20px;\">");
out.print(rs.getString(4)); 
      out.write("</b><br>\n");
      out.write("                             <span style=\"font-size:15px;\"><span class=\"fa fa-bell\"></span>");
out.print(rs.getString(3)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("                            \n");
      out.write("                             <span class=\"fa fa-map-marker\"></span>&nbsp; ");
out.print(rs.getString(6)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("                             <span class=\"fa fa-user\"></span>&nbsp;Ex-");
out.print(rs.getString(8)); 
      out.write("<br>\n");
      out.write("                             <span class=\"fa fa-female\"></span>&nbsp;");
out.print(rs.getString(9)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("                             <span class=\"fa fa-times\"></span>&nbsp;");
out.print(rs.getString(2)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("                             <span class=\"fa fa-dollar\"></span>&nbsp; ");
out.print(rs.getString(7)); 
      out.write("<br>\n");
      out.write("                             <span class=\"fa fa-times\"></span> &nbsp;Vacancies: ");
out.print(rs.getString(12)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("                              <span class=\"fa fa-phone\"></span>&nbsp;Hr contact: ");
out.print(rs.getString(10)); 
      out.write("<br>\n");
      out.write("                              <span class=\"fa fa-clock-o\"></span> &nbsp;Duration: ");
out.print(rs.getString(11));
      out.write("&nbsp;&nbsp;\n");
      out.write("                             <span class=\"fa fa-dashboard\"></span>&nbsp;Post Date: ");
out.print(rs.getString(13));
      out.write("&nbsp;&nbsp;\n");
      out.write("                           \n");
      out.write("                             \n");
      out.write("                             </span></div>\n");
      out.write("                          <div class=\"col-sm-3\">\n");
      out.write("                           <input type=\"submit\" value=\"Apply Now\" id=\"btn2\">\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                                ");

}

      out.write("  \n");
      out.write("                  </div><br><br>\n");
      out.write("                  <div class=\"col-sm-1\"></div>\n");
      out.write("                  </div>\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    </div>\n");
      out.write("              \n");
      out.write("                  \n");
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
      out.write("                       Products $ Service<br><br>\n");
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
      out.write("                     <a href=\"signin.jsp\"><input type=\"submit\" value=\"SignIn\" style=\"float:right; border:none; box-shadow: none; margin-top:40px; color:white; background:#faaa5d; height:30px; width:80px; \"/></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 lfooter\">\n");
      out.write("                        <span style=\"color:#dbdbdb; font-size:15px; \"> @2019Lorem ipsum dolor sit amet, consectetur adipiscing elit. </span>\n");
      out.write("                        <span class=\"fa fa-info\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                        <span class=\"fa fa-wifi\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                        <span class=\"fa fa-google-plus\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                        <span class=\"fa fa-twitch\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                        <span class=\"fa fa-facebook\" style=\"color:#f4f4f4; font-size: 18px; float:right;padding: 1%;\"></span>\n");
      out.write("                    </div>\n");
      out.write("                        </div>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("              </div>  \n");
      out.write("            </div>\n");
      out.write("             </div>  \n");
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
