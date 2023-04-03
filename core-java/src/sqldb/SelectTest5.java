package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest5 {

	public static void main(String[] args) {
		  Connection con=null;
				  Statement st=null;
				  ResultSet rs=null;
				  
				   try {
					     //class loading
					   Class.forName("oracle.jdbc.driver.OracleDriver");
					   //establish connection
					   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
					   //create staement
					   if(con!=null)
						   st=con.createStatement();
					   //prepare query
					   String query="SELECT COUNT (*) FROM STUDENT";
					   //sen d and execute query
					   if(st!=null)
						   rs=st.executeQuery(query);
					   System.out.println(query);
					   //process the result
					   if(rs!=null) {
						      rs.next();
						    //  int count=rs.getInt(1);
						      int count= rs.getInt("COUNT(*)");
						   System.out.println(count);
					   }
				   }catch(SQLException sqe) {
				    	  sqe.printStackTrace();
				      }catch(Exception e) {
				    	  e.printStackTrace();
				      }finally {
			    	      try {
			    	    	   if(rs!=null)
			    	    		   rs.close();	    	    		   
			    	      }catch(SQLException sqe) {
			    	    	  sqe.printStackTrace();
			    	      }try {
			    	    	  if(st!=null)
			    	    		  st.close();
			    	      }catch(SQLException sqe) {
			    	    	  sqe.printStackTrace();
			    	      }try {
			    	    	  if(con!=null) 
			    	    		  con.close();
			    	    	  }catch(SQLException sqe) {
			    	    		    sqe.printStackTrace();
			    	    	  }
			      }
				  

	}

}
