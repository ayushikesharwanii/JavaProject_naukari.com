<%-- 
    Document   : jdel
    Created on : Aug 5, 2019, 12:30:49 PM
    Author     : Ayushi
--%>

<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String jid=request.getParameter("name");
    
    DBMANAGER db=new DBMANAGER();
    String cmd="delete from tbljobs where jid='"+jid+"'";
    boolean b=db.ExecuteInsertUpdateDelete(cmd);
    if(b==true)
        out.print("<script>alert('record Deleted succesfully.. ');window.location.href='../jobmanage.jsp';</script>");
    else
        out.print("<script>alert('record Deleted not succesfully.. ');window.location.href='../jobmanage.jsp';</script>");
    %>