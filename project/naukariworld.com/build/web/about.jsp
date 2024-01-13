<%-- 
    Document   : about
    Created on : Jul 26, 2019, 12:40:46 AM
    Author     : Ayushi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="master/link.jsp" %>
          
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .about{
                min-height: 600px;
                padding:4% 11%;
                text-align:justify; 
                
            } 
            .head{
                height: 300px;
                background: url('project/n117.jpeg');
                background-repeat: no-repeat;
                 background-size: 100% 100%;
                background-attachment: fixed;
            }
            .head1{
                height: 300px;
                background: rgba(0,0,0,.4);
                color:white;
                
            }
            
            .out{
                min-height: 500px;
                float:left;
               
            }
            .a1{
                min-height:500px;
              
                
            }
            .a2{
                min-height:500px;
                text-align: right;
            }
            #img{
                 height:500px;
                 width:500px;
                float:left; 
            }
        </style>
    </head>
    <body>
        
                
                <div class="col-sm-12 head">
                   <div class="row">
                  <div class="col-sm-12 head1">
                      <div class="row">
                      <%@include file="master/header.jsp" %><br><br><br><br><br>
                      
                      <center><b style="padding:5%;color:white; font-size:40px; text-align: center;">ABOUT <b style="color:#faaa5d;">US
                      <span class="fa fa-user"></span></b></b> </center>  
                </div>
                  </div> 
                 
                <div class="col-sm-12 about">
                    
                    <div class='row'>
                    <div class="col-sm-7 ">
                       <div class="col-sm-12 a1">
                            <img src="project/n107.PNG" id='img'>
                     </div>    
                    </div>
                    <div class="col-sm-5">
                        <div class="col-sm-12 a2">
                            <p style="font-size:30px; color:#faaa5d; padding: 10px;">Welcome to Naukari World</p>
                            <p style="font-size: 17px;">
                            Naukari World is an application which connects employer and job seekers where employers 
                            are the source of the
        resources and the job seeker can find and apply for their targeted job. This document provides details about the
entire software requirement specification for the online job portal.
                            This Job Portal website is providing to the online job portal system.
 This website can be also providing information about online job.
 The customer can get the online registration.
 The Job Portal web application can be used by any employee to apply job and any employer are post to
job.</p>
                          </div>
                    </div>
                    </div>
                </div>
                 <%@include file="master/footer.jsp"%>
        
                  </div>
             </div>  
                  
    </body>
</html>
