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
        <%@include file="../master/jobseekerlink.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             .t{
min-height:45px;
background:#faaa5d;
font-size:25px;
color:white;
text-align:center;
padding-top:.5%;
           }
            
            .job{
                min-height: 600px;
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
               
                  
                        <%@include file="../master/jobseekerheader.jsp"%>
                        
             
                <div class="col-sm-12 job">
                    <div class="row">
                        <div class="col-sm-2">
                            <h1>Job Category</h1>
                            <%
                                DBMANAGER db = new DBMANAGER();
                                String cmd1 = "select distinct catname from tbljobs";
                                ResultSet rs1 = db.ExecuteSelect(cmd1);
                                while (rs1.next()) {
                            %>
                            <span style="font-size:18px; font-family: 'Monotype Corsive'">
                                <% out.print(rs1.getString(1));%><br><br>  
                            </span>
                            <% } %>
                        </div>
                        <div class="col-sm-10">
                            
                                <div class="col-sm-12 recentjobs">

                                    <p style="text-align: center; font-size:30px; padding-top:5%; font-weight: bold;">Recent Jobs</p>
                                    <p style="text-align: center; font-size:16px; color:#4d4d4d; padding-bottom:20px;">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>  
                                    <div class="col-sm-1"></div>
                                    <div class="col-sm-10">

                                        <%

                                            String cmd2 = "select distinct jid from tblapply where uid='"+session.getAttribute("user").toString()+"'";
                                            ResultSet rs2 = db.ExecuteSelect(cmd2);
                                            int i = 1;
                                            while (rs2.next())
                                            {
                                                String cmd="select * from tbljobs where jid='"+rs2.getString(1)+"'";
                                                ResultSet rs=db.ExecuteSelect(cmd);
                                                while(rs.next())
                                                {
                                        %>
                                        <div class="col-sm-12 r">
                                            <div class="col-sm-2">
                                                <img src="../regimg/<%out.print(rs.getString(5)); %>" class="logo" style="height:70px; width:90px"> 
                                            </div>
                                            <div class="col-sm-7">
                                                <b style="font-size:20px;"><%out.print(rs.getString(4)); %></b><br>
                                                <span style="font-size:15px;"><span class="fa fa-bell"></span><%out.print(rs.getString(3)); %>&nbsp;&nbsp;

                                                    <span class="fa fa-map-marker"></span>&nbsp; b<%out.print(rs.getString(6)); %>&nsp;&nbsp;
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
                                                <a href="Applycode.jsp?id=<%out.print(rs.getString(1)); %>"><input type="button" value="Apply Now" id="btn2"></a>
                                            </div>
                                        </div>
                                        <%
                                                }
                                            }
                                        %>  
                                        </div>
                                    </div><br><br>
                                    <div class="col-sm-1"></div>
                                </div>
                            </div>

                        </div>
<div class="row">
                        <%@include file="../master/jobseekerfooter.jsp"%>
                    </div>  
                </div>
            </div> 
        </div>
    </body>
</html>
