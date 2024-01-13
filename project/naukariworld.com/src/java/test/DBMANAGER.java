
package test;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBMANAGER {
   Connection con=null;
   public DBMANAGER()
   {
       try
       {
     Class.forName("com.mysql.jdbc.Driver"); 
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/naukari","root","");
       }
       catch(Exception ex)
       {
           
       }
   }
       public boolean ExecuteInsertUpdateDelete(String cmdTxt)
       {
          try
          {
              PreparedStatement ps=con.prepareStatement(cmdTxt);
              ps.execute();
              return true;
          }
          catch(Exception ex)
          {
           return false;   
          }
       }
       public boolean ExecuteUpdate(String cmdTxt)
       {
          try
          {
              PreparedStatement ps=con.prepareStatement(cmdTxt);
              int i=ps.executeUpdate();
              return i>0?true:false;
          }
          catch(Exception ex)
          {
           return false;   
          }
       }
   public ResultSet ExecuteSelect(String cmdTxt)
   {
       ResultSet rs=null;
       try
       {
         Statement st=con.createStatement();
         rs=st.executeQuery(cmdTxt);
         return rs;
       }
        catch(Exception ex)
         {
            return rs;     
         }
   }

    public boolean ExecuteInsertUpdateDatele(String cmd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean ExecuteInsertUpdateDalete(String cmd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
