<%-- 
    Document   : index
    Created on : Jul 24, 2019, 11:10:10 PM
    Author     : Ayushi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="master/link.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Naukari World.com</title>
        <style>
           
           .header{
              min-height: 700px; 
             background: url('project/n37.JPG');
              background-repeat: no-repeat;
               background-size: 100% 100%;
            }
            .header1{
                min-height: 700px;
                background: rgba(0,0,0,.5);
            }
            #btn1{
                
              font-size: 15px;
              background: #faaa5d;
              color:white;
              border:none;
              height:30px;
              width:70px;
            }
            .input-group-addon{
                background: #faaa5d; 
            }
            .txt
            {
                height:50px;
            }
            .a{
                height:120px;
                background:rgba(0,0,0,.5);
                margin-top:40%;
                border-radius: 5px;
            }
            .categories{
                min-height:580px;
                background: white;
            }
            .b{
               min-height:140px;
               background: white;
               margin-top:20%;
               text-align: center;
               box-shadow: 2px 2px 8px #f0f0f0;
               padding-top: 2%;
            }
            #f{
                text-align:center;
                color:#faaa5d;
                font-size: 30px;
                
            }
            b{
              text-align: center;
              font-size: 20px;
             
            }
            p{
              text-align: center;
              font-size: 20px;
              color:#4d4d4d;
            }
            .recentjobs{
                min-height:500px;
                background: #f9f9f9;
                
            }
            .r{
                min-height: 100px;
                border:1px solid #e6e6e6;
                border-radius: 2px;
            }
            .r:hover{
               background: white;
            }
            .logo{
                height:100px;
                padding: 5%;
                float:left;
            }
            .r1{
                border:red;
            }
            #btn2{
                height:40px;
                width:130px;
                
                border-radius:20px;
                background: transparent;
                border:1px solid #6d6d6d;
                margin-top:20%; 
            }
            #btn3{
                height:50px;
                width:180px;
                margin: 5%;
                background: white;
                border-radius: 20px;
                border: none;
                box-shadow: 2px 2px 8px black;
                font-size: 15px;
                color:black;
            }
           
            .z{
                height:300px;
                background: url('project/n54.jpg');
                background-size:  100% 100%;
                background-attachment: fixed;
            }
            .z1{
                height:300px;
                background: rgba(0,0,0,.5);
                padding-top: 4%;
            }
            .z11{
                font-size: 40px;
                color:white;
                text-align: center;
                padding-top: 3%;
            }
            .usersay{
                min-height: 500px;
            }
            .v{
                height:200px;
                background:#f9f9f9; 
            }
            .companies{
                min-height:400px;
                background:#f9f9f9; 
            }
            .n{
                padding-top: 5%;
            }
            .blog{
                min-height: 700px;
            }
            .h{
                min-height:200px;
                
            }
            .h1{
               min-height:200px;
               background:#f9f9f9; 
               margin-top:-10%; 
               border-radius:2px;
               font-size:15px;
               text-align: center;
               padding-top: 6%;
               box-shadow:2px 2px 4px black;
            }
            
            </style>
        </head>
        <body>
            <div class="col-sm-12 outer">
                <div class="row">
                <div class="col-sm-12 header">
                    <div class="row">
                        <div class="col-sm-12 header1">
                           <div class="row">
                            <%@include file="master/header.jsp" %>
                            </div>
                      <p style="color:white; font-weight: bold; padding-top:4%; text-align:center; font-size: 50px;">Find Your job</p>
                      <p style="color:white;   text-align:center; font-size:20px;   "> Any employee to apply job and any employer are post to job  </p><br><br>
                      <div class="col-sm-12">
                          <div class="col-sm-3"></div>
                          <div class="col-sm-6">
                              <div class="input-group">
                                 <input type="text" name="name" placeholder="job title Keyword or company name" class="form-control txt"/>  
                                 <span class="input-group-addon"><span class="fa fa-search" style="font-size:18px; color:white;" ></span><input type="submit" name="button" value="Find Job"  id="btn1"/>  
                          </span>
                              </div>
                             
                          </div>
                              <div class="col-sm-3"></div>
                      </div>
                      <div class="col-sm-12">
                          <div class="col-sm-4"></div>
                          <div class="col-sm-5">
                              <div class="col-sm-4">
                                  <div class="col-sm-12 a">
                                      <p style="color:white; font-size:20px; text-align:center; padding-top:10%;">2967</p>
                                      <p style="color:white; font-size:20px; text-align:center; padding-top:10%;">job posted </p>
                                  </div>
                              </div>
                              <div class="col-sm-4">
                                  <div class="col-sm-12 a">
                                      <p style="color:white; font-size:20px; text-align:center;  padding-top:10%;">167</p>
                                      <p style="color:white; font-size:20px; text-align:center;  padding-top:10%;">companies</p>
                                  </div>
                              </div>
                              <div class="col-sm-4">
                                  <div class="col-sm-12 a">
                                      <p style="color:white; font-size:20px; text-align:center;  padding-top:10%; ">150</p>
                                      <p style="color:white; font-size:20px; text-align:center; padding-top:10%;">condidate</p>
                                  </div>
                              </div>
                          </div>
                          <div class="col-sm-3"></div>
                      </div> 
                    </div>
                   </div>
                   </div>
                            </div>
                <div class="col-sm-12 categories">
                    <div class="row">
                 <p style="text-align: center; font-size:40px; padding-top:5%; font-weight: bold;">Popular Categories</p>
                 <p style="text-align: center; font-size:20px; color:#4d4d4d;">This website can be also providing information about online job.</p>
                 <div class="col-sm-12">
                 <div class="col-sm-1"></div>
                 <div class="col-sm-10">
                     <div class="col-sm-3">
                         <div class="col-sm-12 b">
                             <span class="fa fa-line-chart" id="f"></span><br>
                             <p>Accounting Finance</p>
                             (367)
                         </div>
                     </div>
                     <div class="col-sm-3">
                         <div class="col-sm-12 b">
                             <span class="fa fa-graduation-cap" id="f"></span><br>
                            <p> Education Training</p>
                             (210)
                         </div>
                     </div>
                     <div class="col-sm-3">
                         <div class="col-sm-12 b">
                             <span class="fa fa-bullhorn" id="f"></span><br>
                             <p>Digital Marketing</p>
                             (543)
                         </div>
                     </div>
                     <div class="col-sm-3">
                         <div class="col-sm-12 b">
                             <span class="glyphicon glyphicon-phone-alt" id="f"></span><br>
                             <p>Telecommunication</p>
                             (2143)
                         </div>
                     </div>
                 </div>
                 <div class="col-sm-1"></div>
                </div> 
                 <div class="col-sm-12">
                 <div class="col-sm-1"></div>
                 <div class="col-sm-10">
                     <div class="col-sm-3">
                         <div class="col-sm-12 b">
                             <span class="fa fa-shopping-cart"id="f"></span><br>
                             <p>Sales & Marketing</p>
                                (23)
                         </div>
                     </div>
                     <div class="col-sm-3">
                         <div class="col-sm-12 b">
                             <span class="fa fa-pencil" id="f"></span><br>
                            <p> Writing & Translations</p>
                                   (43)
                         </div>
                     </div>
                     <div class="col-sm-3">
                         <div class="col-sm-12 b">
                             <span class="fa fa-user-md" id="f"></span><br>
                             <p>Health</p>
                                 (35)
                         </div>
                     </div>
                     <div class="col-sm-3">
                         <div class="col-sm-12 b">
                             <span class="fa fa-truck" id="f"></span><br>
                             <p>Transportation Logistics</p>
(7)
                         </div>
                     </div>
                 </div>
                 <div class="col-sm-1"></div>
                </div>  
                </div>
                    </div>
                            <div class="row">
                <div class="col-sm-12 recentjobs">
                    
                 <p style="text-align: center; font-size:40px; padding-top:5%; font-weight: bold;">Recent Jobs</p>
                 <p style="text-align: center; font-size:20px; color:#4d4d4d; padding-bottom:20px;">This document provides details about the
entire software requirement specification for the online job portal.
</p>  
                  <div class="col-sm-1"></div>
                  <div class="col-sm-10">
                      <div class="col-sm-12 r">
                          <div class="col-sm-2">
                            <img src="project/logo1.PNG" class="logo"> 
                          </div>
                          <div class="col-sm-8">
                             <b>Restaurant General Manager</b><br><br>
                             <span style="font-size:16px;"><span class="fa fa-bell"></span> Hotel
                             <span class="fa fa-map-marker"></span> New York City
                             <span class="fa fa-clock-o"></span> Full Time<br>
                             Deadline Dec 31,2019
                             </span></div>
                          <div class="col-sm-2">
                           <input type="submit" value="Apply Now" id="btn2">
                          </div>
                      </div>
                      
                      <center><a href="job.jsp"><input type="submit" value="Browse All Jobs" id="btn3"></a></center>
                  </div>
                  <div class="col-sm-1"></div>
                  </div>
                                </div>
                  <div class="row">
                      <div class="col-sm-12 z">
                          <div class="row">
                          <div class="col-sm-12 z1">
                              <div class="col-sm-3 z11">
                                <span class="fa fa-users"></span><br>
                                1967
                                <p style="color:white; font-size: 20px;">Member</p>
                              </div>
                              <div class="col-sm-3 z11">
                                  <span class="fa fa-suitcase"></span><br>
                                  667
                                  <p style="color:white; font-size: 20px;">jobs</p>
                              </div>
                              <div class="col-sm-3 z11">
                                  <span class="fa fa-file-text-o"></span><br>
                                  475
                                  <p style="color:white; font-size: 20px;">Resumes</p>
                              </div>
                              <div class="col-sm-3 z11">
                                  <span class="fa fa-bar-chart"></span><br>
                                  475
                                  <p style="color:white; font-size: 20px;">companies</p>
                              </div>
                              
                          </div>    
                      </div>
                  </div>
                </div>
                  <div class="col-sm-12 usersay">
                   <p style="text-align: center; font-size:40px; padding:5%; font-weight: bold;">What Our User Say</p>
                   <div class="col-sm-1"></div>
                   <div class="col-sm-4 v">
                     <p style="text-align:justify; font-size:20px;">The Job Portal web application can be used by any employee to apply job and any employer are post to
                              job. This website can be also providing information about online job.</p>
                     
                   </div>
                   <div class="col-sm-2"></div>
                   <div class="col-sm-4 v">
                       <p style="text-align:justify; font-size:20px;">Job portal is an application which connects employer and job seekers where employers are the source of the
resources and the job seeker can find and apply for their targeted job.</p> 
                   </div>
                   <div class="col-sm-1"></div>
                  </div>
                <div class="row">
                <div class="col-sm-12 companies">
                 <p style="text-align: center; font-size:40px; padding-top:5%; font-weight: bold;">Companies We've Helped</p>
                 <p style="text-align: center; font-size:20px; color:#4d4d4d;">Many companies very helped of jobseeker</p>  
                 <div class="col-sm-1"></div>
                 <div class="col-sm-10">
                     <div class="col-sm-2 n">
                         <img src="project/logo6.jpg" height="100px" width="100px" >
                     </div>
                     <div class="col-sm-2 n">
                         <img src="project/logo7.jpg" height="100px" width="100px" >
                     </div>
                     <div class="col-sm-2 n">
                         <img src="project/logo8.jpg" height="100px" width="100px" >
                     </div>
                     <div class="col-sm-2 n">
                         <img src="project/logo9.jpg" height="100px" width="100px" >
                     </div>
                     <div class="col-sm-2 n">
                         <img src="project/logo10.jpg" height="100px" width="100px" >
                     </div>
                     <div class="col-sm-2 n">
                         <img src="project/logo11.jpg" height="100px" width="100px" >
                     </div>
                 </div>
                 <div class="col-sm-1" ></div>
                  </div>   
                </div>   
                
                <div class="col-sm-12 blog">
                 <p style="text-align: center; font-size:40px; padding-top:5%; font-weight: bold;">Latest Blog</p> 
                 <p style="text-align: center; font-size:20px; color:#4d4d4d; padding-bottom:20px;">This Job Portal website is very useful for jobseeker
</p>  
                <div class="col-sm-12">
                 <div class="col-sm-1"></div>
                <div class="col-sm-10">
                    <div class="col-sm-4">
                        <div class="col-sm-12 h">
                            
                            <img src="project/n51.jpg" height="250px" width="300px;">
                            <div class="col-sm-1"></div>
                            <div class="col-sm-10 h1">
                                <p style="color:#faaa5d; text-align:justify; font-size:20px;">Job Motivation Quote</p>
                                <span class="fa fa-user"></span>Admin &nbsp;&nbsp;
                                <span class="fa fa-comment"></span>27&nbsp;&nbsp;
                                <span class="fa fa-heart"></span>27<br><br>
                                <p>This website can be also providing information about online job.
.</p>
                            </div>
                            <div class="col-sm-1"></div>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="col-sm-12 h ">
                            <img src="project/n119.jpeg" height="250px" width="300px;">
                            <div class="col-sm-1"></div>
                            <div class="col-sm-10 h1">
                                <p style="color:#faaa5d; text-align:justify; font-size:20px;">How To Get Out Of Stress At Work</p>
                               <span class="fa fa-user"></span>Admin &nbsp;&nbsp;
                                <span class="fa fa-comment"></span>27&nbsp;&nbsp;
                                <span class="fa fa-heart"></span>27<br><br>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                            </div>
                            <div class="col-sm-1"></div>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="col-sm-12 h">
                            <img src="project/n118.jpeg" height="250px" width="300px;">
                            <div class="col-sm-1"></div>
                            <div class="col-sm-10 h1">
                                <p style="text-align:justify; color:#faaa5d; font-size:20px;">Back To Work After Vacation</p>
                                <span class="fa fa-user"></span>Admin &nbsp;&nbsp;
                                <span class="fa fa-comment"></span>27 &nbsp;&nbsp;
                                <span class="fa fa-heart"></span>27<br><br>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                            </div>
                            <div class="col-sm-1"></div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-1"></div>
                </div>
                 
                 </div>
                      <div class="row">
                            <%@include file="master/footer.jsp" %>
                </div>
                </div>
                
                
    </body>
</html>
