<%-- 
    Document   : testregistration
    Created on : Jul 29, 2019, 11:27:31 PM
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
            .signup{
                min-height: 600px;
               
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
            .signup1{
                min-height: 600px;
                
               padding:5% 5%;
               
            }
            .img1{
               min-height: 400px;
               
               padding-top:5%;
            }
            .form{
                 min-height: 400px;
             box-shadow: 2px 2px 6px black;
               padding: 5%;
                
            }
            .txt{
                font-size:15px;
            } 
            .form-control{
                border-radius: 0px;
                height:40px;
                
            }
            #btn4{
                background: #faaa5d;
            }
            </style>
    </head>
    <body>
        <div class="col-sm-12 head">
                    <div class="row">
                  <div class="col-sm-12 head1">
                      <div class="row">
                      <%@include file="master/header.jsp" %><br><br><br><br><br>
                     <center><b style="padding:5%;color:white; font-size:40px; text-align: center;">Sign<b style="color:#faaa5d;;">Up 
                      <span class="fa fa-user"></span></b></b></center></div>  
                </div>
                    
                      <div class="col-sm-12 signup">
                          <div class="col-sm-12 signup1">
                          <div class="col-sm-5 img1">
                              <center><img src="project/n122.jpg" height="300px" width="400px"></center>   
                          </div>
                          <div class="col-sm-7 form">
                              
                              <div class="row">
                <form action="regcode" enctype="multipart/form-data" method="post">
               
               <div class="row">
                   <div class="col-sm-6">
                       <span class="txt">NAME</span>
                       
  <input type="text" name="name" class="form-control" placeholder="Username">

            </div>
                   <div class="col-sm-6">
                       <span class="txt">DATE OF BIRTH</span>
                       
  <input type="date" name="dob" class="form-control" placeholder="Date of Birth" aria-describedby="basic-addon1">

            </div>
                   </div>
               
               <div class="row">
                   <div class="col-sm-6">
                    <span class="txt">EMAIL</span>   
  <input type="email" name="email" class="form-control" placeholder="Email" aria-describedby="basic-addon1">

            </div>
                   <div class="col-sm-6">
                       <span class="txt">MOBILE</span>
                       
  <input type="number" name="mobno" class="form-control" placeholder="moblie No" aria-describedby="basic-addon1">

            </div>
                   </div>
               
               <div class="row">
                   <div class="col-sm-6">
                       <span class="txt">GENDER</span><br>
                       <select name="gen" class="form-control">
                               <option>--Select Gender--</option>
                               <option>Male</option>
                               <option>Female</option>
                               </select>
            </div>
                   <div class="col-sm-6">
                       <span class="txt">QUALIFICATION</span>
                       
                           <select name="quali" class="form-control">
                               <option>--Select qualification--</option>
                               <option>Diploma</option>
                               <option>B.Tech</option>
                               <option>BCA</option>
                               <option>MCA</option>
                           </select>

            </div>
                   </div><br>
               
              <div class="row">
                   <div class="col-sm-6">
                       
                       
                       <input type="file" name="pic" value="UPLOAD FILE" class="form-control">

            </div>
                  <div class="col-sm-6"><br>
                      <input type="submit" value="SIGN UP" class="form-control" id="btn4">
                      
                  </div>
                  
                   </div>
               
               </form>
                
            
            
               </div>
                              
                             </div> 
                             </div> 
                          </div>  
        <%@include file="master/footer.jsp" %>
         </div>  
            </div>
    </body>
</html>
