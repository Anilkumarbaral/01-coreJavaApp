package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class page_66ResultSetMetaData {

	public static void main(String[] args) {
	
		      try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		    		  //create statement 
		    		  Statement st= con.createStatement();
		    		  //send and execute query
		    		  ResultSet rs=st.executeQuery("select * from student");
		    		  ){
		    	    //create ResultSetMetaData obj
		    	  java.sql.ResultSetMetaData rsmd=null;
		    	  if(con!=null) {
		    		  rsmd=rs.getMetaData();
		    	  }
		    	  //get column count
		    	  if(rsmd!=null) {
		    		  int colcount=rsmd.getColumnCount();
		    		    for(int i=1;i<=colcount;i++) {
		    		    	System.out.println(rsmd.getColumnClassName(i)+" ");
		    		    }
		    	  }
		      }catch(SQLException se) {
		    	  se.printStackTrace();
		      }catch(Exception e) {
		    	  e.printStackTrace();
		      }
		      

	}

}

