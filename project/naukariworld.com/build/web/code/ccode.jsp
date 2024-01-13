<%-- 
    Created on : Jul 27, 2019, 1:48:03 AM
    Author     : Ayushi    Document   : ccode

--%>

<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  String name,email,mobile,message;
  name=request.getParameter("name");
  email=request.getParameter("email");
  mobile=request.getParameter("mob");
  message=request.getParameter("msg");
  
  DBMANAGER db=new DBMANAGER();
  String cmd="insert into tblcontact(name,email,mobile,msg,cdate)values('"+name+"','"+email+"','"+mobile+"','"+message+"',curdate())";
  boolean a=db.ExecuteInsertUpdateDelete(cmd);
  
 
  if(a==true)
      out.print("<script>alert('DATA SAVED SUCCESSFULY...')"+";window.location.href='../contact.jsp';</script>");
  else
      out.print("<script>alert('DATA NOT SAVED SUCCESSFULY...')"+";window.location.href='../contact.jsp';</script>");
 
  %>