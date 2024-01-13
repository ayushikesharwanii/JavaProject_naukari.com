<%-- 
    Document   : changepass
    Created on : Jul 30, 2019, 10:45:25 AM
    Author     : Ayushi    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="../master/jobseekerlink.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .t{
min-height:45px;
background:#faaa5d;
font-size:25px;
color:white;
text-align:center;
padding-top:.5%;
           }
            .pass{
                min-height: 500px;
                padding: 5%;
            }
            .pass1{
                min-height: 300px;
                box-shadow: 2px 2px 6px;
                padding:3%;
                margin-top:4%
            }
                .p{
                     border-radius: 0px;
                }   
                 
            
            .btn{
                width: 100%;
                 border-radius: 0px;
                 background:#faaa5d;
            }
            </style>
    </head>
    <body>
       
        <div class="col-sm-12">
            <div class="row">
            <%@include file="../master/jobseekerheader.jsp"%>     
       <div class="col-sm-12 pass">
           <div class="col-sm-6">
              <img src="../project/n124.jpg" height="300px" width="450px"> 
           </div>
         <div class="col-sm-6 pass1">
             <form method="post" action="code/chcode.jsp">
              <center><h3>Change Password</h3></center><br>
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
               <%@include file="../master/jobseekerfooter.jsp"%> 
                </div>
            </div>
    </body>
</html>
