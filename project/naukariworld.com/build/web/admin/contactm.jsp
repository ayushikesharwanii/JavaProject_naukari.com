<%-- 
    Document   : contactm
    Created on : Aug 1, 2019, 4:16:41 AM
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
                        <div class="text-center"> CONTACT US MANAGEMENT
                        <span class="fa fa-phone"></span>
                        </div>
                    </div>
                    </div>
                </div>     
       
                <div class="col-sm-12 main">
                    <table class='table table-hover'>
                        <tr>
                           
                            <th>SR NO</th>
                            <th>NAME</th>
                            <th> EMAIL</th>
                            <th>MOBILE </th>
                            <th>MESSAGE</th>
                            <th>DATE</th>
                            <th>DELETE</th>
                            </tr>
                            <%
                                DBMANAGER db=new DBMANAGER();
                                String cmd="select * from tblcontact";
                                ResultSet rs=db.ExecuteSelect(cmd);
                                int i=1;
                                while(rs.next())
                                {
                                %>
                            <tr>
                                <td><%out.print(i);%></td>
                                <td><%out.print(rs.getString(2)); %></td>
                                <td><%out.print(rs.getString(3)); %></td>
                                <td><%out.print(rs.getString(4)); %></td>
                                <td><%out.print(rs.getString(5)); %></td>
                                <td><%out.print(rs.getString(6)); %></td>
                               
                                <td><a href="code/cdel.jsp?msg=<%out.print(rs.getString(1));%>" style='color:pink;'><span class='fa fa-trash'></span></a></td>
                                </tr>
                                <%
                                i=i+1;
                                        
                                }
                                    %>
                            </table>
                </div>
                <%@include file="../master/adminfooter.jsp"%>
                </div>
                </div>
    </body>
</html>
