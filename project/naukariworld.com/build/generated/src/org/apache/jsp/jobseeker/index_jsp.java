package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         ");
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
      out.write("            .t{\n");
      out.write("min-height:45px;\n");
      out.write("background:#faaa5d;\n");
      out.write("font-size:25px;\n");
      out.write("color:white;\n");
      out.write("text-align:center;\n");
      out.write("padding-top:.5%;\n");
      out.write("} \n");
      out.write("            .main{\n");
      out.write("                min-height: 300px;\n");
      out.write("               padding: 6%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .da a{\n");
      out.write("                color:white;\n");
      out.write("          \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .d1{\n");
      out.write("               min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background: #aa66cc;\n");
      out.write("                text-align: center;\n");
      out.write("                 padding: 3%;\n");
      out.write("                \n");
      out.write("            } \n");
      out.write("            .d2{\n");
      out.write("              min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background:#ff4081;\n");
      out.write("                text-align: center;\n");
      out.write("                 padding: 3%;\n");
      out.write("            }\n");
      out.write("            .d3 {\n");
      out.write("                min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background:#adda81;\n");
      out.write("                text-align: center;\n");
      out.write("                    padding: 3%;  \n");
      out.write("            }\n");
      out.write("            .d4{\n");
      out.write("              min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background: #00e5ff;\n");
      out.write("                text-align: center;\n");
      out.write("              padding: 3%;\n");
      out.write("            }\n");
      out.write("            .d5{\n");
      out.write("                min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background: #1de9b6  ;\n");
      out.write("                text-align: center;\n");
      out.write("                      padding: 3%;\n");
      out.write("            }\n");
      out.write("            .d6{\n");
      out.write("                min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background:#fdaf87 ;\n");
      out.write("                text-align: center;\n");
      out.write("                       padding: 3%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .d7{\n");
      out.write("                min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background: #ffbb33 ;\n");
      out.write("                text-align: center;\n");
      out.write("                  padding: 3%;\n");
      out.write("            }\n");
      out.write("            .d8{\n");
      out.write("              min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background:#b39ddb;\n");
      out.write("                text-align: center;\n");
      out.write("                     padding: 3%;\n");
      out.write("            }\n");
      out.write("            .d9{\n");
      out.write("                min-height:150px; \n");
      out.write("                font-size: 20px;\n");
      out.write("                background: #3f729b;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 3%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-sm-12 outer\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

if(session.getAttribute("user")==null)
{
    out.print("<script>alert('Please!! Login First');windows.location.href='../jlogin.jsp';</script>");
}

      out.write("\n");
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
      out.write("                <div class=\"col-sm-12 main\">\n");
      out.write("                  \n");
      out.write("                <div class=\"col-sm-12 ds\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-1\"></div>\n");
      out.write("                    <div class='col-sm-10 da'>\n");
      out.write("                        <div class='col-sm-4 d1'>\n");
      out.write("                            <a href='index.jsp'>\n");
      out.write("                                <span class=\"fa fa-dashboard\"></span><br>\n");
      out.write("                              Dashboard\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d2'>\n");
      out.write("                            <a href='appliedjobs.jsp'>\n");
      out.write("                                <span class=\"fa fa-users\"></span><br>\n");
      out.write("                              Applied Jobs\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d3'>\n");
      out.write("                            <a href='viewjobs.jsp'>\n");
      out.write("                                <span class=\"fa fa-eye\"></span><br>\n");
      out.write("                                View Jobs\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-sm-1\"></div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"row\">\n");
      out.write("                    <div class='col-sm-12'>\n");
      out.write("                        <div class=\"col-sm-1\"></div>\n");
      out.write("                        <div class=\"col-sm-10 da\">\n");
      out.write("                        <div class='col-sm-4 d4'>\n");
      out.write("                            <a href='profilemanage.jsp'>\n");
      out.write("                                <span class=\"fa fa-file\"></span><br>\n");
      out.write("                                Profile Management\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d5'>\n");
      out.write("                            <a href='jchangepass.jsp'>\n");
      out.write("                                <span class=\"fa fa-unlock\"></span><br>\n");
      out.write("                                Change Password\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d6'>\n");
      out.write("                            <a href='logout.jsp'>\n");
      out.write("                                <span class=\"fa fa-pencil\"></span><br>\n");
      out.write("                             Log Out\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        </div>\n");
      out.write("                         </div>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                    <div class='col-sm-12'>\n");
      out.write("                        <div class=\"col-sm-1\"></div>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                         </div>\n");
      out.write("                      \n");
      out.write("                     <div class=\"col-sm-1\"></div>\n");
      out.write("                </div>\n");
      out.write("               </div>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-sm-12 footer\">\n");
      out.write("                    <div class=\"col-sm-6\">&copy;<a herf=\"https://www.techpile.in\" target=\"_blank\">\n");
      out.write("                                          Techpile Technology Pvt.Ltd</a></div>\n");
      out.write("                    <div class=\"col-sm-6\">DEVELOPED BY :Ayushi</div>\n");
      out.write("                </div>");
      out.write("\n");
      out.write("             </div>\n");
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
