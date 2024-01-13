package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import test.DBMANAGER;

public final class registerm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("        <style>\n");
      out.write("            .head{\n");
      out.write("                min-height: 120px;\n");
      out.write("                background: url('../project/n118.jpeg');\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            .head1{\n");
      out.write("                min-height: 120px;\n");
      out.write("                background: rgba(0,0,0,.5);\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 30px;\n");
      out.write("                padding: 4%;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"col-sm-12\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                 ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
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
      out.write("                <div class=\"col-sm-12 head\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 head1\">\n");
      out.write("                        <div class=\"text-center\"> REGISTRATION MANAGEMENT\n");
      out.write("                        <span class=\"fa fa-phone\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>     \n");
      out.write("       \n");
      out.write("                <div class=\"col-sm-12 main\">\n");
      out.write("                    <table class='table table-hover'>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                            <th>NAME</th>\n");
      out.write("                            <th>EMAIL</th>\n");
      out.write("                            <th>MOBILE </th>\n");
      out.write("                            <th>PASSWORD</th>\n");
      out.write("                            <th>GENDER</th>\n");
      out.write("                            <th>JCATEGORY</th>\n");
      out.write("                            <th>QUALIFICATION</th>\n");
      out.write("                            <th>EXPERIENCE</th>\n");
      out.write("                            <th>ADDRESS</th>\n");
      out.write("                            <th>PIC</th>\n");
      out.write("                            <th>DATE</th>\n");
      out.write("                            <th>DELETE</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                DBMANAGER db=new DBMANAGER();
                                String cmd="select * from tblregister";
                                ResultSet rs=db.ExecuteSelect(cmd);
                                
                                while(rs.next())
                                {
                                
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                               \n");
      out.write("                                <td>");
out.print(rs.getString(1)); 
      out.write("</td>\n");
      out.write("                                <td>");
out.print(rs.getString(2)); 
      out.write("</td>\n");
      out.write("                                <td>");
out.print(rs.getString(3)); 
      out.write("</td>\n");
      out.write("                                <td>");
out.print(rs.getString(4)); 
      out.write("</td>\n");
      out.write("                                <td>");
out.print(rs.getString(5)); 
      out.write("</td>\n");
      out.write("                                <td>");
out.print(rs.getString(6)); 
      out.write("</td>\n");
      out.write("                               <td>");
out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                                <td>");
out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                 <td>");
out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                  <td>");
out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("                                   <td>");
out.print(rs.getString(11));
      out.write("</td>\n");
      out.write("                                    \n");
      out.write("                                <td><a href=\"code/rdel.jsp?msg=");
out.print(rs.getString(2));
      out.write("\" style='color:pink;'><span class='fa fa-trash'></span></a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                               
                                        
                                }
                                    
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                </div>\n");
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
      out.write("                </div>\n");
      out.write("                </div>\n");
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
