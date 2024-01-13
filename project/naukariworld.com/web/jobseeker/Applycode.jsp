<%--
    Document   : cdel
    Created on : Aug 1, 2019, 6:27:14 AM
    Author     : Ayushi
--%>

<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(session.getAttribute("user").toString()!=null)
    {
    String id=request.getParameter("id");
    
    DBMANAGER db=new DBMANAGER();
    String cmd="insert into tblapply(jid,uid,jdate)values('"+id+"','"+session.getAttribute("user").toString()+"',curdate())";
   out.print(cmd);
    boolean b=db.ExecuteInsertUpdateDelete(cmd);
    if(b==true)
        out.print("<script>alert('job Applied. Employer will contact you soon.. ');window.location.href='viewjobs.jsp';</script>");
    else
        out.print("<script>alert('job can not be applied ');window.location.href='viewjobs.jsp';</script>");
   
          }
    else
        out.print("<script>alert('Login First.. ');window.location.href='../joginin.jsp';</script>");
   
   
    %>