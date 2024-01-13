<%-- 
    Document   : jobseekerheader
    Created on : Aug 4, 2019, 11:06:32 PM
    Author     : Ayushi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
if(session.getAttribute("user")==null)
{
    out.print("<script>alert('Please!! Login First..');window.location.href='../jlogin.jsp';</script>");
}
%>
<div class="row">
     <div class="col-sm-12 t">
<div class="col-sm-3">
<span class="fa fa-phone"></span>
+918429623603</div>
<div class="col-sm-6">
<b>WELCOME TO NAUKARI WORLD</b></div>
<div class="col-sm-3">
<span class="fa fa-facebook"></span>
<span class="fa fa-youtube"></span>
<span class="fa fa-twitter"></span>
<span class="fa fa-google"></span>
</div>
</div>
    </div>
 <div class="col-sm-12 header2">
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
        <a class="navbar-brand" style="font-size:25px; font-weight: bold;">JOB<b style="color:#faaa5d;font-size:25px;">SEEKER<span class="fa fa-user"></span></b></a>
        
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        
        <li><a href="index.jsp">DASHBORAD</a></li>
         <li><a href="viewjobs.jsp">VIEW JOBS</a></li>
         <li><a href="appliedjobs.jsp">APPLIED JOBS</a></li>
          <li><a href="jchangepass.jsp">CHANGE PASSWORD</a></li> 
          <li><a href="logout.jsp">LOGOUT</a></li>
           
        
      </ul>
      
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

              </div>   
             </div>    
         </div>
             </div>
