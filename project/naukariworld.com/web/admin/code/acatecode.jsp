<%-- 
    Document   : addcode
    Created on : Aug 1, 2019, 12:38:16 AM
    Author     : Ayushi
--%>
<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  String cname;
  cname=request.getParameter("cname");
  DBMANAGER db=new DBMANAGER();
  String cmd="insert into tblcategory(cname,cdate) values('"+cname+"',curdate())";

  boolean a=db.ExecuteInsertUpdateDelete(cmd);
  if(a==true)
      out.print("<script>alert('DATA SAVED SUCCESSFULY...')"+";window.location.href='../Addcategary.jsp';</script>");
  else
      out.print("<script>alert('DATA NOT SAVED SUCCESSFULY...')"+";window.location.href='../Addcategary.jsp';</script>");

  %>