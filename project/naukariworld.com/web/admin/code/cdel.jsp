<%-- 
    Document   : cdel
    Created on : Aug 1, 2019, 6:27:14 AM
    Author     : Ayushi
--%>

<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id=request.getParameter("msg");
    
    DBMANAGER db=new DBMANAGER();
    String cmd="delete from tblcontact where cid='"+id+"'";
    boolean b=db.ExecuteInsertUpdateDelete(cmd);
    if(b==true)
        out.print("<script>alert('record Deleted succesfully.. ');window.location.href='../contactm.jsp';</script>");
    else
        out.print("<script>alert('record Deleted not succesfully.. ');window.location.href='../contactm.jsp';</script>");
    %>