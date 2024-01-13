<%-- 
    Document   : logout
    Created on : Jul 30, 2019, 10:47:42 AM
    Author     : Ayushi jobseekar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="../master/adminlink.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
           function logout()
           {
            window.history.forward;
            window.setTimeout("window.location.href='../index.jsp'",100);
           }
        </script>
    </head>
    
    <body onload="logout()" >
        
    </body>
</html>
