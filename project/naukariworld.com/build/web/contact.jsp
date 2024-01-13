<%-- 
    Document   : contact
    Created on : Jul 26, 2019, 12:42:29 AM
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
               min-height: 300px;
                background: url('project/n117.jpeg');
                background-repeat: no-repeat;
                 background-size: 100% 100%;
                background-attachment: fixed;
            }
            .head1{
                min-height: 300px;
                background:rgba(0,0,0,.5);
                color:white;
                
            }
            .contact{
                min-height: 500px;
                background:white ;
                padding: 4% 11%;
            }
            .gmap{
                min-height: 450px;
                background: white;
                padding: 4%;
            }
            .con{
                min-height: 400px;
                background: white;
                box-shadow: 2px 2px 8px black;
                margin-top: -10%;
                padding: 5%;
            }
            .txt{
              min-height: 50px;
               border-radius: 0px;
              
            }
            txt1{
               min-height: 90px;
                border-radius: 0px;
            }
            .Btn{
                min-height: 50px;
                width: 100%;
                background: #faaa5d;
                border:none;
            }
            </style>
    </head>
    <body>
        <div class="col-sm-12">
            <div class="row">
               
                <div class="col-sm-12 head">
                    <div class="row">
                  <div class="col-sm-12 head1">
                      <div class="row">
                     <%@include file="master/header.jsp" %> <br><br><br><br><br>
                     <center> <b style="padding:5%; color:white; font-size:40px; text-align: center;">Contact <b style="color:#faaa5d;;">US
                      <span class="fa fa-user"></span></b></b></center></div>  
                </div>
                   </div>
                </div> 
                <div class="col-sm-12 contact">
                    <div class="col-sm-12 gmap">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3558.161508838033!2d80.964192!3d26.8983689!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x39995785d5f7f1a5%3A0xffa47f1efe103f0d!2sTechpile+Technology+Pvt.+Ltd.!5e0!3m2!1sen!2sin!4v1564215798737!5m2!1sen!2sin" width="100%" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
                    </div> 
                  <div class="col-sm-12">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8 con">
                        <form method="post" action="code/ccode.jsp">
                            NAME
                            <input type="text" name="name" class="form-control txt"/>
                            EMAIL<input type="email" name="email" class="form-control txt"/>
                            MOBILE<input type="number" name="mob" class="form-control txt"/>
                            MESSAGE<textarea name="msg" class="form-control txt1" /></textarea><br>
                            <input type="submit" value="SAVE" class="Btn"/>
                        </form>
                    </div>
                   
                    <div class="col-sm-2"></div>
                  </div>
                </div>
                   
                  <%@include file="master/footer.jsp" %>  
                </div>
                
        </div>
    </body>
</html>
