<%-- 
    Document   : rdel
    Created on : Aug 2, 2019, 11:14:36 AM
    Author     : Ayushi
--%>

<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id=request.getParameter("msg");
    
    DBMANAGER db=new DBMANAGER();
    String cmd="delete from tblregister where email='"+id+"'";
    boolean b=db.ExecuteInsertUpdateDelete(cmd);
    if(b==true)
        out.print("<script>alert('record Deleted succesfully.. ');window.location.href='../registerm.jsp';</script>");
    else
        out.print("<script>alert('record Deleted not succesfully.. ');window.location.href='../registerm.jsp';</script>");
    %>
