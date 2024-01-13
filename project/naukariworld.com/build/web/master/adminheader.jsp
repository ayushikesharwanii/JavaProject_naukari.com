<%-- 
    Document   : adminheader
    Created on : Aug 1, 2019, 4:29:51 AM
    Author     : Ayushi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
if(session.getAttribute("user")==null)
{
    out.print("<script>alert('Please!! Login First');window.location.href='../signin.jsp';</script>");
}
%>
<style>
    #sp:hover {
     background: white;
     color:#faaa5d;
     transform: skewX(-5deg);
    }
    </style>
<div class="row">
     <div class="col-sm-12 t">
<div class="col-sm-3">
<span class="fa fa-phone"></span>
+918429623603</div>
<div class="col-sm-6">
<b>WELCOME TO NAUKARI WORLD</b></div>
<div class="col-sm-3">
 <a href="https://www.facebook.com" target="_blank" style="color:white;"><span class="fa fa-facebook" style="border:1px solid white; padding:5px;" id="sp"></span></a>
<a href="https://www.youtube.com" target="_blank" style="color:white;"><span class="fa fa-youtube" style="border:1px solid white;  padding:5px;" id="sp"></span></a>
<a href="https://www.twitter.com" target="_blank" style="color:white;"><span class="fa fa-twitter" style="border:1px solid white;  padding:5px;" id="sp"></span></a>
<a href="https://www.google.com" target="_blank" style="color:white;"><span class="fa fa-google" style="border:1px solid white;  padding:5px;" id="sp"></span></a>
</div>
</div>
    </div> 
 <div class="col-sm-12 ">
             <div class="row">
             <div class="col-sm-12 menu">
               <div class="row">
                <nav class="navbar navbar-default" id="menu">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
        <a class="navbar-brand" style="font-size:25px; font-weight: bold;">NAUKARI<b style="color:#faaa5d;font-size:25px;"> ADMIN<span class="fa fa-user"></span></b></a>
        
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        
        <li><a href="index.jsp">DASHBORAD</a></li>
         <li><a href="Addcategary.jsp">ADDCATEGARY</a></li>
          <li><a href="addjobs.jsp">ADDJOBS</a></li>
           <li><a href="changepass.jsp">CHANGE PASSWORD</a></li>
            <li><a href="logout.jsp">LOGOUT</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">MANAGEMENT<span class="caret"></span></a>
          <ul class="dropdown-menu">
            
            <li><a href="jobmanage.jsp">JOBS</a></li>
           
            <li><a href="contactm.jsp">CONTACT</a></li>
          </ul>
        </li>
      </ul>
      
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

              </div>   
             </div>    
         </div>
</div>