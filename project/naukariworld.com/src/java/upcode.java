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
@WebServlet(urlPatterns = {"/upcode"})
public class upcode extends HttpServlet {

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
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String mobno=request.getParameter("mobno");
            String password=request.getParameter("password");
            String gender=request.getParameter("gender");
            String jcategory=request.getParameter("jcategory");
            String qualification=request.getParameter("qualification");
            String experience=request.getParameter("experience");
            String address=request.getParameter("address");
            Part p1=request.getPart("pic");
            String pic=p1.getSubmittedFileName();
            DBMANAGER db=new DBMANAGER();
            String cmd="insert into tblregister(name,email,mobno,password,gender,jcategory,qualification,experience,address,pic,regdate) values('"+name+"','"+email+"','"+mobno+"','"+password+"','"+gender+"','"+jcategory+"','"+qualification+"','"+experience+"','"+address+"','"+pic+"',curdate())";
      
            boolean b=db.ExecuteInsertUpdateDelete(cmd);
        if(b==true)
        {
            InputStream content=p1.getInputStream();
        File f=new File(request.getRealPath("/signimg"),pic);
        Files.copy(content,f.toPath());
        
            out.print("<script>alert('DATA SAVAED..');window.location.href='signup.jsp';</script>");
        }
        else
        {
           out.print("<script>alert('DATA NOT SAVAED..');window.location.href='signup.jsp';</script>");
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
