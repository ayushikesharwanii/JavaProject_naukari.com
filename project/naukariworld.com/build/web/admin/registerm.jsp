<%-- 
    Document   : registerm
    Created on : Aug 2, 2019, 10:47:45 AM
    Author     : Ayushi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../master/adminlink.jsp"%>
        <style>
            .head{
                min-height: 120px;
                background: url('../project/n118.jpeg');
                background-attachment: fixed;
            }
            .head1{
                min-height: 120px;
                background: rgba(0,0,0,.5);
                text-align: center;
                font-size: 30px;
                padding: 4%;
                color:white;
            }
            </style>
    </head>
    <body>
<div class="col-sm-12">
            <div class="row">
                 <%@include file="../master/adminheader.jsp"%>
                <div class="col-sm-12 head">
                <div class="row">
                    <div class="col-sm-12 head1">
                        <div class="text-center"> REGISTRATION MANAGEMENT
                        <span class="fa fa-phone"></span>
                        </div>
                    </div>
                    </div>
                </div>     
       
                <div class="col-sm-12 main">
                    <table class='table table-hover'>
                        <tr>
                           
                            
                            <th>NAME</th>
                            <th>EMAIL</th>
                            <th>MOBILE </th>
                            <th>PASSWORD</th>
                            <th>GENDER</th>
                            <th>JCATEGORY</th>
                            <th>QUALIFICATION</th>
                            <th>EXPERIENCE</th>
                            <th>ADDRESS</th>
                            <th>PIC</th>
                            <th>DATE</th>
                            <th>DELETE</th>
                            </tr>
                            <%
                                DBMANAGER db=new DBMANAGER();
                                String cmd="select * from tblregister";
                                ResultSet rs=db.ExecuteSelect(cmd);
                                
                                while(rs.next())
                                {
                                %>
                            <tr>
                               
                                <td><%out.print(rs.getString(1)); %></td>
                                <td><%out.print(rs.getString(2)); %></td>
                                <td><%out.print(rs.getString(3)); %></td>
                                <td><%out.print(rs.getString(4)); %></td>
                                <td><%out.print(rs.getString(5)); %></td>
                                <td><%out.print(rs.getString(6)); %></td>
                               <td><%out.print(rs.getString(7));%></td>
                                <td><%out.print(rs.getString(8));%></td>
                                 <td><%out.print(rs.getString(9));%></td>
                                  <td><%out.print(rs.getString(10));%></td>
                                   <td><%out.print(rs.getString(11));%></td>
                                    
                                <td><a href="code/rdel.jsp?msg=<%out.print(rs.getString(2));%>" style='color:pink;'><span class='fa fa-trash'></span></a></td>
                                </tr>
                                <%
                               
                                        
                                }
                                    %>
                            </table>
                </div>
                <%@include file="../master/adminfooter.jsp"%>
                </div>
                </div>
    </body>
</html>
