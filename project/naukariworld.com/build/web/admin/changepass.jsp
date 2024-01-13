<%-- 
    Document   : changepass
    Created on : Jul 30, 2019, 10:45:25 AM
    Author     : Ayushi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="../master/adminlink.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .pass{
                min-height: 500px;
            }
            .pass1{
                min-height: 300px;
                box-shadow: 2px 2px 6px;
                margin-top: 5%;
                padding: 2%;
            }
                .p{
                     border-radius: 0px;
                }   
                 
            
            .btn{
                width: 100%;
                 border-radius: 0px;
                 background: #faaa5d;
            }
            .a{
                min-height: 300px;
                padding: 2%;
            }
            </style>
    </head>
    <body>
        <div class="col-sm-12">
            <div class="row">
                <%@include file="../master/adminheader.jsp"%>
       <div class="col-sm-12 pass">
           <div class="col-sm-6 a">
               <img src="../project/n124.jpg" height="300px" width="450px"> 
           </div>
         
         <div class="col-sm-6 pass1">
             <form method="post" action="code/cpcode.jsp">
              <center><h3>Change Password</h3></center>
             Old Password
             <input type="password" name="opass" class="form-control p"/>
              New Password
             <input type="password" name="npass" class="form-control p"/>
              Conform Password
             <input type="password" name="cpass" class="form-control p"/>
              <br>
             <input type="submit" value="Change Now" class="btn">
            </form>
         </div>
         
        </div>
                <%@include file="../master/adminfooter.jsp"%>
                </div>
            </div>
    </body>
</html>
