/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import test.DBMANAGER;

@MultipartConfig
@WebServlet(urlPatterns = {"/ajcode"})
public class ajcode extends HttpServlet {

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
            out.println("<title>Servlet regcode</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet regcode at " + request.getContextPath() + "</h1>");
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
        PrintWriter out=response.getWriter();
        try{
 String catname=request.getParameter("catname");
 String jtitle=request.getParameter("jtitle");
 String cname=request.getParameter("cname");
 Part p1=request.getPart("clogo");
            String clogo=p1.getSubmittedFileName();
           
 
 String city=request.getParameter("city");
 String salary=request.getParameter("salary");
 String experience=request.getParameter("experience");
 String description=request.getParameter("description");
 String hrcontact=request.getParameter("hrcontact");
 String duration=request.getParameter("duration");
 String vacancis=request.getParameter("vacancis");
  
  DBMANAGER db=new DBMANAGER();
  String cmd="insert into tbljobs(catname,jtitle,cname,clogo,city,salary,experience,description,hrcontact,duration,vacancis,jdate) "
          + "values('"+catname+"','"+jtitle+"','"+cname+"','"+clogo+"','"+city+"','"+salary+"','"+experience+"','"+description+"','"+hrcontact+"','"+duration+"','"+vacancis+"',curdate())";

  boolean a=db.ExecuteInsertUpdateDelete(cmd);
  if(a==true)
  {
       InputStream content=p1.getInputStream();
  File f=new File(request.getRealPath("/regimg"),clogo);
  Files.copy(content,f.toPath());
  
  out.print("<script>alert('DATA SAVAED..');window.location.href='admin/addjobs.jsp';</script>");
  }
   else
  {  
 out.print("<script>alert('DATA NOT SAVAED SUCCESFULLY..');window.location.href='admin/addjobs.jsp';</script>");   
  }    
    }
  catch(Exception ex)
        {
             
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
