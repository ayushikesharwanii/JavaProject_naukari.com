package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import test.DBMANAGER;

public final class viewjobs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jobseeker/../master/jobseekerlink.jsp");
    _jspx_dependants.add("/jobseeker/../master/jobseekerheader.jsp");
    _jspx_dependants.add("/jobseeker/../master/jobseekerfooter.jsp");
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
      out.write("<link href=\"../css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"../css/jobseekercss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             .t{\n");
      out.write("min-height:45px;\n");
      out.write("background:#faaa5d;\n");
      out.write("font-size:25px;\n");
      out.write("color:white;\n");
      out.write("text-align:center;\n");
      out.write("padding-top:.5%;\n");
      out.write("           }\n");
      out.write("            \n");
      out.write("            .job{\n");
      out.write("                min-height: 600px;\n");
      out.write("            } \n");
      out.write("            \n");
      out.write("\n");
      out.write("            .recentjobs{\n");
      out.write("                min-height:500px;\n");
      out.write("                background: #f9f9f9;\n");
      out.write("                margin: 3%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .r{\n");
      out.write("                background: white;\n");
      out.write("                min-height: 100px;\n");
      out.write("                border:1px solid #e6e6e6;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                margin-top:3%;\n");
      out.write("            }\n");
      out.write("            .r:hover{\n");
      out.write("                background: #f9f9f9;\n");
      out.write("            }\n");
      out.write("            .logo{\n");
      out.write("                height:100px;\n");
      out.write("                padding-top:5%;\n");
      out.write("                margin-top:8%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .r1{\n");
      out.write("                border:red;\n");
      out.write("            }\n");
      out.write("            #btn2{\n");
      out.write("                height:40px;\n");
      out.write("                width:130px;\n");
      out.write("\n");
      out.write("                border-radius:20px;\n");
      out.write("                background: transparent;\n");
      out.write("                border:1px solid #6d6d6d;\n");
      out.write("                margin-top:20%; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-sm-12 head\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               \n");
      out.write("                  \n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"row\">\n");
      out.write("     <div class=\"col-sm-12 t\">\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write("<span class=\"fa fa-phone\"></span>\n");
      out.write("+918429623603</div>\n");
      out.write("<div class=\"col-sm-6\">\n");
      out.write("<b>WELCOME TO NAUKARI WORLD</b></div>\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write("<span class=\"fa fa-facebook\"></span>\n");
      out.write("<span class=\"fa fa-youtube\"></span>\n");
      out.write("<span class=\"fa fa-twitter\"></span>\n");
      out.write("<span class=\"fa fa-google\"></span>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write(" <div class=\"col-sm-12 header2\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("             <div class=\"col-sm-12 menu\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                <nav class=\"navbar navbar-default\" id=\"menu\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" style=\"font-size:25px; font-weight: bold;\">JOB<b style=\"color:#faaa5d;font-size:25px;\">SEEKER<span class=\"fa fa-user\"></span></b></a>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        \n");
      out.write("        <li><a href=\"index.jsp\">DASHBORAD</a></li>\n");
      out.write("         <li><a href=\"viewjobs.jsp\">VIEW JOBS</a></li>\n");
      out.write("         <li><a href=\"appliedjobs.jsp\">APPLIED JOBS</a></li>\n");
      out.write("          <li><a href=\"jchangepass.jsp\">CHANGE PASSWORD</a></li> \n");
      out.write("          <li><a href=\"logout.jsp\">LOGOUT</a></li>\n");
      out.write("            <li><a href=\"profilemanage.jsp\">PROFILE MANAGEMENST</a></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("              </div>   \n");
      out.write("             </div>    \n");
      out.write("         </div>\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("             \n");
      out.write("                <div class=\"col-sm-12 job\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            <h1>Job Category</h1>\n");
      out.write("                            ");

                                DBMANAGER db = new DBMANAGER();
                                String cmd1 = "select distinct catname from tbljobs";
                                ResultSet rs1 = db.ExecuteSelect(cmd1);
                                while (rs1.next()) {
                            
      out.write("\n");
      out.write("                            <span style=\"font-size:18px; font-family: 'Monotype Corsive'\">\n");
      out.write("                                ");
 out.print(rs1.getString(1));
      out.write("<br><br>  \n");
      out.write("                            </span>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            \n");
      out.write("                                <div class=\"col-sm-12 recentjobs\">\n");
      out.write("\n");
      out.write("                                    <p style=\"text-align: center; font-size:30px; padding-top:5%; font-weight: bold;\">Recent Jobs</p>\n");
      out.write("                                    <p style=\"text-align: center; font-size:16px; color:#4d4d4d; padding-bottom:20px;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>  \n");
      out.write("                                    <div class=\"col-sm-1\"></div>\n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("\n");
      out.write("                                        ");


                                            String cmd = "select * from tbljobs order by jid desc limit 0,20";
                                            ResultSet rs = db.ExecuteSelect(cmd);
                                            int i = 1;
                                            while (rs.next()) {
                                        
      out.write("\n");
      out.write("                                        <div class=\"col-sm-12 r\">\n");
      out.write("                                            <div class=\"col-sm-2\">\n");
      out.write("                                                <img src=\"../regimg/");
out.print(rs.getString(5)); 
      out.write("\" class=\"logo\" style=\"height:70px; width:90px\"> \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-7\">\n");
      out.write("                                                <b style=\"font-size:20px;\">");
out.print(rs.getString(4)); 
      out.write("</b><br>\n");
      out.write("                                                <span style=\"font-size:15px;\"><span class=\"fa fa-bell\"></span>");
out.print(rs.getString(3)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("                                                    <span class=\"fa fa-map-marker\"></span>&nbsp; b");
out.print(rs.getString(6)); 
      out.write("&nsp;&nbsp;\n");
      out.write("                                                    <span class=\"fa fa-user\"></span>&nbsp;Experience-");
out.print(rs.getString(8)); 
      out.write("<br>\n");
      out.write("                                                    <span class=\"fa fa-clock-o\"></span>&nbsp;");
out.print(rs.getString(9)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("                                                    <span class=\"fa fa-times\"></span>&nbsp;");
out.print(rs.getString(2)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("                                                    <span class=\"fa fa-dollar\"></span>&nbsp; ");
out.print(rs.getString(7)); 
      out.write("<br>\n");
      out.write("                                                    <span class=\"fa fa-times\"></span> &nbsp;Vacancies: ");
out.print(rs.getString(12)); 
      out.write("&nbsp;&nbsp;\n");
      out.write("                                                    <span class=\"fa fa-phone\"></span>&nbsp;Hr contact: ");
out.print(rs.getString(10)); 
      out.write("<br>\n");
      out.write("                                                    <span class=\"fa fa-clock-o\"></span> &nbsp;Duration: ");
out.print(rs.getString(11));
      out.write("&nbsp;&nbsp;\n");
      out.write("                                                    <span class=\"fa fa-dashboard\"></span>&nbsp;Post Date: ");
out.print(rs.getString(13));
      out.write("&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </span></div>\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <a href=\"Applycode.jsp?id=");
out.print(rs.getString(1)); 
      out.write("\"><input type=\"button\" value=\"Apply Now\" id=\"btn2\"></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("  \n");
      out.write("                                    </div><br><br>\n");
      out.write("                                    <div class=\"col-sm-1\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("<div class=\"row\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-sm-12 footer\">\n");
      out.write("                    <div class=\"col-sm-6\">&copy;<a herf=\"https://www.techpile.in\" target=\"_blank\">\n");
      out.write("                                          Techpile Technology Pvt.Ltd</a></div>\n");
      out.write("                    <div class=\"col-sm-6\">DEVELOPED BY :Ayushi</div>\n");
      out.write("                </div>");
      out.write("\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
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
