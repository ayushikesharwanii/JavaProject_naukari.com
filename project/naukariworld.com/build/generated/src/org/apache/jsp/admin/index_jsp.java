package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/../master/adminlink.jsp");
    _jspx_dependants.add("/admin/../master/adminheader.jsp");
    _jspx_dependants.add("/admin/../master/adminfooter.jsp");
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
      out.write("        \n");
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
      out.write("        <link href=\"../css/admincss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             \n");
      out.write("            .main{\n");
      out.write("                min-height: 550px;\n");
      out.write("                padding: 2%;\n");
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
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-sm-12 outer\">\n");
      out.write("           <div class=\"row\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

if(session.getAttribute("user")==null)
{
    out.print("<script>alert('Please!! Login First');windows.location.href='../signin.jsp';</script>");
}

      out.write("\n");
      out.write("<style>\n");
      out.write("    #sp:hover {\n");
      out.write("     background: white;\n");
      out.write("     color:#faaa5d;\n");
      out.write("     transform: skewX(-5deg);\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("<div class=\"row\">\n");
      out.write("     <div class=\"col-sm-12 t\">\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write("<span class=\"fa fa-phone\"></span>\n");
      out.write("+918429623603</div>\n");
      out.write("<div class=\"col-sm-6\">\n");
      out.write("<b>WELCOME TO NAUKARI WORLD</b></div>\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write(" <a href=\"https://www.facebook.com\" target=\"_blank\" style=\"color:white;\"><span class=\"fa fa-facebook\" style=\"border:1px solid white; padding:5px;\" id=\"sp\"></span></a>\n");
      out.write("<a href=\"https://www.youtube.com\" target=\"_blank\" style=\"color:white;\"><span class=\"fa fa-youtube\" style=\"border:1px solid white;  padding:5px;\" id=\"sp\"></span></a>\n");
      out.write("<a href=\"https://www.twitter.com\" target=\"_blank\" style=\"color:white;\"><span class=\"fa fa-twitter\" style=\"border:1px solid white;  padding:5px;\" id=\"sp\"></span></a>\n");
      out.write("<a href=\"https://www.google.com\" target=\"_blank\" style=\"color:white;\"><span class=\"fa fa-google\" style=\"border:1px solid white;  padding:5px;\" id=\"sp\"></span></a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    </div> \n");
      out.write(" <div class=\"col-sm-12 \">\n");
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
      out.write("        <a class=\"navbar-brand\" style=\"font-size:25px; font-weight: bold;\">NAUKARI<b style=\"color:#faaa5d;font-size:25px;\"> ADMIN<span class=\"fa fa-user\"></span></b></a>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        \n");
      out.write("        <li><a href=\"index.jsp\">DASHBORAD</a></li>\n");
      out.write("         <li><a href=\"Addcategary.jsp\">ADDCATEGARY</a></li>\n");
      out.write("          <li><a href=\"addjobs.jsp\">ADDJOBS</a></li>\n");
      out.write("           <li><a href=\"changepass.jsp\">CHANGE PASSWORD</a></li>\n");
      out.write("            <li><a href=\"logout.jsp\">LOGOUT</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">MANAGEMENT<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"jobapplied.jsp\">JOB APPLIED</a></li>\n");
      out.write("            <li><a href=\"jobmanage.jsp\">JOBS</a></li>\n");
      out.write("            <li><a href=\"jobseeker.jsp\">JOB SEEKER</a></li>\n");
      out.write("            <li><a href=\"contactm.jsp\">CONTACT</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
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
      out.write("</div>");
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
      out.write("                                <span class=\"fa fa-home\" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                                HOME\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d2'>\n");
      out.write("                            <a href='addjobs.jsp'>\n");
      out.write("                                <span class=\"fa fa-suitcase \" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                                ADD JOB\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d3'>\n");
      out.write("                            <a href='Addcategary.jsp'>\n");
      out.write("                                <span class=\"fa fa-users\" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                               ADD CATEGORY\n");
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
      out.write("                            <a href='jobmanage.jsp'>\n");
      out.write("                                <span class=\"fa fa-trash\" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                                JOB MANAGEMENT\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d5'>\n");
      out.write("                            <a href='jobapplied.jsp'>\n");
      out.write("                                <span class=\"fa fa-file-text-o \" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                               JOB APPLIED\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d6'>\n");
      out.write("                            <a href='addjobs.jsp'>\n");
      out.write("                                <span class=\"fa fa-pencil\" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                                ADD JOBS\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        </div>\n");
      out.write("                         </div>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                    <div class='col-sm-12'>\n");
      out.write("                        <div class=\"col-sm-1\"></div>\n");
      out.write("                        <div class=\"col-sm-10 da\">\n");
      out.write("                        <div class='col-sm-4 d7'>\n");
      out.write("                            <a href='contactm.jsp'>\n");
      out.write("                                <span class=\"fa fa-phone\" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                                CONTACT MANAGEMENT\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d8'>\n");
      out.write("                            <a href='registerm.jsp'>\n");
      out.write("                                <span class=\"fa fa-trash\" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                                REGISTER MANAGEMENT\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class='col-sm-4 d9'>\n");
      out.write("                            <a href='changepass.jsp'>\n");
      out.write("                                <span class=\"fa fa-unlock\" style=\"font-size:30px;\"></span><br><br>\n");
      out.write("                                CHANGE PASSWORD\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        </div>\n");
      out.write("                         </div>\n");
      out.write("                      \n");
      out.write("                     <div class=\"col-sm-1\"></div>\n");
      out.write("                </div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
