<%-- 
    Document   : job
    Created on : Jul 26, 2019, 12:42:09 AM
    Author     : Ayushi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="master/link.jsp" %>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style>
        .job{
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
            
               .recentjobs{
                min-height:500px;
                background: #f9f9f9;
                margin: 3%;
               
            }
            .r{
               background: white;
                min-height: 100px;
                border:1px solid #e6e6e6;
                border-radius: 2px;
                margin-top:3%;
            }
            .r:hover{
               background: #f9f9f9;
            }
            .logo{
                height:100px;
                padding-top:5%;
                margin-top:8%;
                
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
        </style>
    </head>
    <body>
        
                
                <div class="col-sm-12 head">
                    <div class="row">
                  <div class="col-sm-12 head1">
                      <div class="row">
                      <%@include file="master/header.jsp" %><br><br><br><br><br>
                     <center> <b style="padding:5%;color:white; font-size:40px; text-align: center;">Job 
                             <span class="fa fa-user" style="color:#faaa5d;"></span></b></center></div>  
                </div>
                <div class="col-sm-12 job">
                    <div class="row">
                    <div class="col-sm-2">
                        <H1>Job Category</h1>
                    </div>
                    <div class="col-sm-10">
                        <div class="row">
                         <div class="col-sm-12 recentjobs">
                    
                 <p style="text-align: center; font-size:30px; padding-top:5%; font-weight: bold;">Recent Jobs</p>
                 <p style="text-align: center; font-size:16px; color:#4d4d4d; padding-bottom:20px;">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>  
                  <div class="col-sm-1"></div>
                  <div class="col-sm-10">
                      
                      <%
                                DBMANAGER db=new DBMANAGER();
                                String cmd="select * from tbljobs order by jid desc limit 0,20";
                                ResultSet rs=db.ExecuteSelect(cmd);
                                int i=1;
                                while(rs.next())
                                {
                                %>
                      <div class="col-sm-12 r">
                          <div class="col-sm-2">
                              <img src="regimg/<%out.print(rs.getString(5)); %>" class="logo" style="height:70px; width:90px"> 
                          </div>
                          <div class="col-sm-7">
                             <b style="font-size:20px;"><%out.print(rs.getString(4)); %></b><br>
                             <span style="font-size:15px;"><span class="fa fa-bell"></span><%out.print(rs.getString(3)); %>&nbsp;&nbsp;
                            
                             <span class="fa fa-map-marker"></span>&nbsp; <%out.print(rs.getString(6)); %>&nbsp;&nbsp;
                             <span class="fa fa-user"></span>&nbsp;Experience-<%out.print(rs.getString(8)); %><br>
                             <span class="fa fa-clock-o"></span>&nbsp;<%out.print(rs.getString(9)); %>&nbsp;&nbsp;
                             <span class="fa fa-times"></span>&nbsp;<%out.print(rs.getString(2)); %>&nbsp;&nbsp;
                             <span class="fa fa-dollar"></span>&nbsp; <%out.print(rs.getString(7)); %><br>
                             <span class="fa fa-times"></span> &nbsp;Vacancies: <%out.print(rs.getString(12)); %>&nbsp;&nbsp;
                              <span class="fa fa-phone"></span>&nbsp;Hr contact: <%out.print(rs.getString(10)); %><br>
                              <span class="fa fa-clock-o"></span> &nbsp;Duration: <%out.print(rs.getString(11));%>&nbsp;&nbsp;
                             <span class="fa fa-dashboard"></span>&nbsp;Post Date: <%out.print(rs.getString(13));%>&nbsp;&nbsp;
                            </span></div>
                          <div class="col-sm-3">
                           <input type="submit" value="Apply Now" id="btn2">
                          </div>
                      </div>
                                <%
}
%>  
                  </div><br><br>
                  <div class="col-sm-1"></div>
                  </div>
                    </div>
                  
                    </div>
              
                  
                 <%@include file="master/footer.jsp" %>
              </div>  
            </div>
             </div> 
              </div>
    </body>
</html>
