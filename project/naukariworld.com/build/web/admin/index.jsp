<%-- 
    Document   : index
    Created on : Aug 1, 2019, 3:18:24 AM
    Author     : Ayushi admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <%@include file="../master/adminlink.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             
            .main{
                min-height: 550px;
                padding: 2%;
                
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
                <%@include file="../master/adminheader.jsp"%>
                <div class="col-sm-12 main">
                  
                <div class="col-sm-12 ds">
                    
                    
                    <div class="col-sm-1"></div>
                    <div class='col-sm-10 da'>
                        <div class='col-sm-4 d1'>
                            <a href='index.jsp'>
                                <span class="fa fa-home" style="font-size:30px;"></span><br><br>
                                HOME
                            </a>
                        </div>
                        <div class='col-sm-4 d2'>
                            <a href='addjobs.jsp'>
                                <span class="fa fa-suitcase " style="font-size:30px;"></span><br><br>
                                ADD JOB
                            </a>
                        </div>
                        <div class='col-sm-4 d3'>
                            <a href='Addcategary.jsp'>
                                <span class="fa fa-users" style="font-size:30px;"></span><br><br>
                               ADD CATEGORY
                            </a>
                        </div>
                    </div>
                     <div class="col-sm-1"></div>
                     
                     <div class="row">
                    <div class='col-sm-12'>
                        <div class="col-sm-1"></div>
                        <div class="col-sm-10 da">
                        <div class='col-sm-4 d4'>
                            <a href='jobmanage.jsp'>
                                <span class="fa fa-trash" style="font-size:30px;"></span><br><br>
                                JOB MANAGEMENT
                            </a>
                        </div>
                        <div class='col-sm-4 d5'>
                            <a href='jobapplied.jsp'>
                                <span class="fa fa-file-text-o " style="font-size:30px;"></span><br><br>
                               JOB APPLIED
                            </a>
                        </div>
                        <div class='col-sm-4 d6'>
                            <a href='addjobs.jsp'>
                                <span class="fa fa-pencil" style="font-size:30px;"></span><br><br>
                                ADD JOBS
                            </a>
                        </div>
                    </div>
                        </div>
                         </div>
                     <div class="row">
                    <div class='col-sm-12'>
                        <div class="col-sm-1"></div>
                        <div class="col-sm-10 da">
                        <div class='col-sm-4 d7'>
                            <a href='contactm.jsp'>
                                <span class="fa fa-phone" style="font-size:30px;"></span><br><br>
                                CONTACT MANAGEMENT
                            </a>
                        </div>
                        <div class='col-sm-4 d8'>
                            <a href='registerm.jsp'>
                                <span class="fa fa-trash" style="font-size:30px;"></span><br><br>
                                REGISTER MANAGEMENT
                            </a>
                        </div>
                        <div class='col-sm-4 d9'>
                            <a href='changepass.jsp'>
                                <span class="fa fa-unlock" style="font-size:30px;"></span><br><br>
                                CHANGE PASSWORD
                            </a>
                        </div>
                    </div>
                        </div>
                         </div>
                      
                     <div class="col-sm-1"></div>
                </div>
               </div>
                 
                <%@include file="../master/adminfooter.jsp"%>
             </div>
        </div>
    </body>
</html>
