package mysqldb;

import java.sql.*;

import com.mysql.cj.jdbc.JdbcPreparedStatement;
public class MysqlTest 
{
	public static void main(String[] args)  throws Exception
	{
	  //for loading the jdbc driver class
      Class.forName("com.mysql.cj.jdbc.Driver");
    //      Class.forName("com.mysql.jdbc.Driver");
           // mysql = new MySQL("localhost", 3306, "test", "root", "root");
          //  MySQL.connect();
       //for establishing connection (road)
         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/anildb","root","root");
       //create jdbc sttement object vaehicle
         Statement st=con.createStatement();
         // ps= PreparedStatement
         
          ResultSet rs=st.executeQuery("SELECT * FROM STUDENT WHERE sadd='odisha'");
     
          //Process the result object
               while(rs.next()!=false){
				    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
               }
        rs.close();
        st.close();
        con.close();
	}
}
