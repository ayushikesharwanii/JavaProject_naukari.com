<%-- 
    Document   : campanies
    Created on : Jul 26, 2019, 12:44:31 AM
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
        .companies{
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
            .a{
                height:100px;
               margin: 1%;
            }
            
        </style>
    </head>
    <body>
        
                
                <div class="col-sm-12 head">
                    <div class="row">
                  <div class="col-sm-12 head1">
                      <div class="row">
                      <%@include file="master/header.jsp" %><br><br><br><br><br>
                      <center><b style="padding:5%;color:white; font-size:40px; text-align: center;">Companies<b style="color:#faaa5d;;"> 
                      <span class="fa fa-user"></span></b></b></center></div>  
                </div>
                <div class="col-sm-12 companies">
                   <div class="col-sm-1"></div>
                 
                      <%
                                            DBMANAGER db=new DBMANAGER();
                                            String cmd = "select * from tbljobs order by jid desc limit 0,20";
                                            ResultSet rs = db.ExecuteSelect(cmd);
                                            int i=1;
                                            while (rs.next()) {
                                        %>
                    <div class="col-sm-10 a">
                         <img src="regimg/<%out.print(rs.getString(5)); %>" class="logo" style="height:100px; width:100px">
                         <span style="font-size:15px; color:black"><%out.print(rs.getString(4)); %>&nbsp;&nbsp;
                         <%out.print(rs.getString(6)); %>&nbsp;&nbsp;
                         <span class="fa fa-suitcase"></span> &nbsp;Vacancies: <%out.print(rs.getString(12)); %>&nbsp;&nbsp;
                         </span>
                             
                      </div>
                     
                 <%                         
}
%>        
        <div class="col-sm-1" ></div>
                </div>
               
                 <%@include file="master/footer.jsp" %>
              </div>  
            </div>
              
    </body>
</html>



















































            
            
            












