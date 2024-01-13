<%-- 
    Document   : Addcategary
    Created on : Jul 30, 2019, 10:44:03 AM
    Author     : Ayushi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="test.DBMANAGER"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="../master/adminlink.jsp"%>
       
                 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        .cate{
          min-height:400px;
         
        }
        .cate1{
          min-height:200px;
           margin-top:  5%;
          box-shadow: 2px 2px 5px black;
        }
        .btn{
            border-radius: 0px;
            background: #faaa5d;
            width: 100%;
        }
        #input{
           border-radius: 0px; 
        }
       #sizing-addon1{
           border-radius: 0px;  
        }
    </style>
    </head>
    <body>
        <div class="col-sm-12">
            <div class="row">
                 <%@include file="../master/adminheader.jsp"%>
        <div class="col-sm-12 cate">
        
         <div class="col-sm-6 cate1">
             <form method="post" action="code/acatecode.jsp">
              <center><h3>Job Category</h3></center>
             <h5>Category</h5>
              <div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">@</span>
  <input type="text" name="cname" class="form-control"placeholder="categary" aria-describedby="sizing-addon1" id="input">
</div><br>
             <input type="submit" value="Add Now" class="btn">
            </form>
         </div><br><br><br>
            <div class="col-sm-6">
                
                <table class='table table-hover'>
                        <tr>
                           
                            <th>SR NO</th>
                            <th>category</th>
                            <th>date </th>
                            <th>DELETE</th>
                            </tr>
                            <%
                                DBMANAGER db=new DBMANAGER();
                                String cmd="select * from tblcategory";
                                ResultSet rs=db.ExecuteSelect(cmd);
                                int i=1;
                                while(rs.next())
                                {
                                %>
                            <tr>
                                <td><%out.print(i);%></td>
                                <td><%out.print(rs.getString(2)); %></td>
                                <td><%out.print(rs.getString(3)); %></td>
                                <td><a href="code/addcategorydel.jsp?msg=<%out.print(rs.getString(1));%>" style='color:pink;'><span class='fa fa-trash'></span></a></td>
                                </tr>
                                <%
                                i=i+1;
                                        
                                }
                                 %>
                            </table>
                
                
            </div>
        </div>
        <%@include file="../master/adminfooter.jsp"%>
                </div>
        </div>
    </body>
</html>
