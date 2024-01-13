<%-- 
    Document   : lgcode
    Created on : Aug 2, 2019, 4:04:55 AM
    Author     : Ayushi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  String username,password;
  username=request.getParameter("email");
  password=request.getParameter("passwd");
  
  DBMANAGER db=new DBMANAGER();
  String cmd="select * from tbllogin where email='"+username+"' and pass='"+password+"'";
 ResultSet rs=db.ExecuteSelect(cmd);
 if(rs.next())
 {
 out.print("<script>window.location.href='../admin/index.jsp';</script>");
 }
 else
 {
    out.print("<script>alert('Your username or password is inccorect...');"+"window.location.href='../signin.jsp';</script>"); 
 }   
    %>
