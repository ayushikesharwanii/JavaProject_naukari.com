<%-- 
    Document   : addjobs
    Created on : Jul 30, 2019, 10:44:22 AM
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
            .addjob{
                min-height:700px;
                padding: 4%;
                 
            }
            .addjob1{
                min-height:570px;
               box-shadow: 2px 2px 5px;
                padding: 3%;
              
              
            }
            .txt{
                 min-height: 40px;
               border-radius: 0px;
            }
            .txtdd{
               min-height: 40px;
               border-radius: 0px;
            }  
            .txtta{
                 min-height: 80px;
                border-radius: 0px;
            }
            .btn {
                width:100%;
                border-radius: 0px;
                background: #faaa5d;
            }
            </style>
    </head>
    <body>
        <div class="col-sm-12">
            <div class="row">
                <%@include file="../master/adminheader.jsp"%>
        <div class="col-sm-12 addjob">
         <div class="col-sm-2"></div>
         <div class="col-sm-8 addjob1">
             <form action="../ajcode" enctype="multipart/form-data" method="post">
              <center><h3>Add Job</h3></center><br>
             <div class="row">
               <div class="col-sm-6">
          <span>Category</span>
          <input type="text" name="catname" class="form-control txt"/>
               
         </div>
                 <div class="col-sm-6">
                     <span class="">Job title</span>
                     <input type="text" name="jtitle" class="form-control txt"/>
                 </div>
                 </div>
                 <div class="row">
                 <div class="col-sm-6">
                   <span class="">Company Name</span>
                     <input type="text" name="cname" class="form-control txt"/>
                 </div>
                     <div class="col-sm-6">
                   <span class="">company Logo</span>
                     <input type="File" name="clogo" class="form-control txt"/>
                 </div>
                     </div>
              <div class="row">
                 <div class="col-sm-6">
                   <span class="">city</span>
                     <input type="text" name="city" class="form-control txtdd">
              
                 </div>
                     <div class="col-sm-6">
                   <span class="">Salary</span>
                     <input type="number" name="salary" class="form-control txt"/>
                 </div>
                     </div>
              <div class="row">
                 <div class="col-sm-6">
                   <span class="">Experience</span>
                     
                     <input type="text" name="experience" class="form-control txtdd">
              
                 </div>
                     <div class="col-sm-6">
                   <span class="">HR Contect</span>
                     <input type="number" name="hrcontact" class="form-control txt"/>
                 </div>
                     </div>
              <div class="row">
                 
                     <div class="col-sm-6">
                   <span class="">Job Duration</span>
                     <input type="text" name="duration" class="form-control txt"/>
                 </div>
                  <div class="col-sm-6">
                   <span class="">Vacancies</span>
                     <input type="number" name="vacancis" class="form-control txt"/>
                 </div>
                  
                     </div>
              <div class="row">
                  <div class="col-sm-12">
                   <span class="">Description</span>
                   <textarea name="description" class="form-control txtta"></textarea><br><br>
                 </div>
                 
                     <div class="col-sm-12">
                   
                     <input type="Submit"value="Add Job" class="btn"/>
                 </div>
                  </div>   
             </form>
        </div>
        <div class="col-sm-2"></div>
        </div>
         <%@include file="../master/adminfooter.jsp"%>
         
             </div> 
        </div>
    </body>
</html>
