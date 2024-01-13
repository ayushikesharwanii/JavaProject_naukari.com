<%-- 
    Document   : addcategorydel
    Created on : Aug 5, 2019, 11:55:25 AM
    Author     : Ayushi
--%>

<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String cid=request.getParameter("msg");
   
    DBMANAGER db=new DBMANAGER();
    String cmd="delete from tblcategory where cid='"+cid+"'";
    boolean b=db.ExecuteInsertUpdateDelete(cmd);
    if(b==true)
        out.print("<script>alert('record Deleted succesfully.. ');window.location.href='../Addcategary.jsp';</script>");
    else
        out.print("<script>alert('record Deleted not succesfully.. ');window.location.href='../Addcategary.jsp';</script>");
    %>
