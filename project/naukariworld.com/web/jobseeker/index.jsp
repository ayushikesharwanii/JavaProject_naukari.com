<%-- 
    Document   : index
    Created on : Aug 4, 2019, 6:30:06 AM
    Author     : Ayushi jobseeker
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
            .main{
                min-height: 300px;
               padding: 6%;
                
            }
            .da a{
                color:white;
          
                
            }
            
            .d1{
               min-height:150px; 
                font-size: 20px;
                background: #aa66cc;
                text-align: center;
                 padding: 3%;
                
            } 
            .d2{
              min-height:150px; 
                font-size: 20px;
                background:#ff4081;
                text-align: center;
                 padding: 3%;
            }
            .d3 {
                min-height:150px; 
                font-size: 20px;
                background:#adda81;
                text-align: center;
                    padding: 3%;  
            }
            .d4{
              min-height:150px; 
                font-size: 20px;
                background: #00e5ff;
                text-align: center;
              padding: 3%;
            }
            .d5{
                min-height:150px; 
                font-size: 20px;
                background: #1de9b6  ;
                text-align: center;
                      padding: 3%;
            }
            .d6{
                min-height:150px; 
                font-size: 20px;
                background:#fdaf87 ;
                text-align: center;
                       padding: 3%;
                
            }
            .d7{
                min-height:150px; 
                font-size: 20px;
                background: #ffbb33 ;
                text-align: center;
                  padding: 3%;
            }
            .d8{
              min-height:150px; 
                font-size: 20px;
                background:#b39ddb;
                text-align: center;
                     padding: 3%;
            }
            .d9{
                min-height:150px; 
                font-size: 20px;
                background: #3f729b;
                text-align: center;
                padding: 3%;
            }
            
            </style>
    </head>
    <body>
        <div class="col-sm-12 outer">
            <div class="row">
                <%@include file="../master/jobseekerheader.jsp"%>
                <div class="col-sm-12 main">
                  
                <div class="col-sm-12 ds">
                    
                    
                    <div class="col-sm-1"></div>
                    <div class='col-sm-10 da'>
                        <div class='col-sm-4 d1'>
                            <a href='index.jsp'>
                                <span class="fa fa-dashboard"></span><br>
                              Dashboard
                            </a>
                        </div>
                        <div class='col-sm-4 d2'>
                            <a href='appliedjobs.jsp'>
                                <span class="fa fa-users"></span><br>
                              Applied Jobs
                            </a>
                        </div>
                        <div class='col-sm-4 d3'>
                            <a href='viewjobs.jsp'>
                                <span class="fa fa-eye"></span><br>
                                View Jobs
                            </a>
                        </div>
                    </div>
                     <div class="col-sm-1"></div>
                     
                     <div class="row">
                    <div class='col-sm-12'>
                        <div class="col-sm-1"></div>
                        <div class="col-sm-10 da">
                        <div class='col-sm-4 d4'>
                            <a href='profilemanage.jsp'>
                                <span class="fa fa-file"></span><br>
                                Profile Management
                            </a>
                        </div>
                        <div class='col-sm-4 d5'>
                            <a href='jchangepass.jsp'>
                                <span class="fa fa-unlock"></span><br>
                                Change Password
                            </a>
                        </div>
                        <div class='col-sm-4 d6'>
                            <a href='logout.jsp'>
                                <span class="fa fa-pencil"></span><br>
                             Log Out
                            </a>
                        </div>
                    </div>
                        </div>
                         </div>
                     <div class="row">
                    <div class='col-sm-12'>
                        <div class="col-sm-1"></div>
                        
                        </div>
                         </div>
                      
                     <div class="col-sm-1"></div>
                </div>
               </div>
                
                <%@include file="../master/jobseekerfooter.jsp"%>
             </div>
        </div>
    </body>
</html>
