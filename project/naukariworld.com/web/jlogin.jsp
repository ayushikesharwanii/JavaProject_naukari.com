<%-- 
    Document   : signin
    Created on : Jul 26, 2019, 12:45:30 AM
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
                .sign{
                    min-height: 600px;
                }
                .h{
                    min-height: 400px;
                    padding: 4% 8%;
                }
                .txt{
              min-height: 50px;
               border-radius: 0px;
              
            }
            
            .Btn{
                min-height: 50px;
                width: 100%;
                background: #faaa5d;
                border:none;
            }
            .h2{
              box-shadow: 2px 2px 8px black;
              font-size:15px;
              height:380px;
              padding: 5%;
            }
            </style>
    </head>
    <body>
        
        
         
                <div class="col-sm-12 head">
                    <div class="row">
                  <div class="col-sm-12 head1">
                      <div class="row">
                      <%@include file="master/header.jsp" %><br><br><br><br><br>
                     <center> <b style="padding:5%; color:white; font-size:40px; text-align: center;">Sign <b style="color:#faaa5d;;">In
                      <span class="fa fa-user"></span></b></b></center></div>  
                      </div>  
                </div>
                      </div>
                      
                     
                         <div class="col-sm-12 signin">
                         <div class="col-sm-1"></div>
                         <div class="col-sm-10 h">
                             <div class="col-sm-6 h1">
                                <img src="project/n108.png" height="300px" width="300px"> 
                               
                             </div>
                           <div class="col-sm-6 h2">
                             <form method="post" action="code/jscode.jsp">
                                 EMAIL<input type="email" name="email" class="form-control txt" placeholder="Email address"/><br>
                                 PASSWORD<input type="password" name="passwd" class="form-control txt" placeholder="Password"/><br>
                                 <input type=checkbox>Remember me <span style="float:right;">Forgot Password</span><br><br> 
                            <input type="submit" value="Sign In" class="Btn"/>
                            <center><p style="padding: 40px; font-size: 13px;">Don't have an account?<span style="color:#faaa5d;">Register here</span></p></center>
                        </form>
                           </div>
                             
                         </div>
                         <div class="col-sm-1"></div>
                         
                         </div>
                 <%@include file="master/footer.jsp" %>      
          
    </body>
</html>
