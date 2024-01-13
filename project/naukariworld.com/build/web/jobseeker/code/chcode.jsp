<%-- 
    Document   : cpcode
    Created on : Aug 2, 2019, 6:06:57 AM
    Author     : Ayushi
--%>

<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String opass,npass,cpass;
    opass=request.getParameter("opass");
    npass=request.getParameter("npass");
    cpass=request.getParameter("cpass");
    DBMANAGER db=new DBMANAGER();
    String cmd="update tblchange set pass='"+npass+"' where pass='"+opass+"'";
    boolean b=db.ExecuteUpdate(cmd);
if(cpass.equals(npass))
{
    if(b==true)
        out.print("<script>alert('password  changed successfully..');"+"window.location.href='../jchangepass.jsp';</script>");
    else
        out.print("<script>alert('old password is not matched');"+"window.location.href='../jchangepass.jsp';</script>");
}
else
{
   out.print("<script>alert('confirm password is not matched');"+"window.location.href='../jchangepass.jsp';</script>");  
}
%>