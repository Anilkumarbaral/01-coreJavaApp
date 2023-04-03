package sqldb;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CreateTable_page35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Connection con=null;
  Statement st=null;
		      
		      try {
		    	        //load the jdbc driver class
		    	      Class.forName("oracle.jdbc.driver.OracleDriver");
		    	      //establish the connection
		    	      con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		    	      //create statement
		    	      if(con!=null)
		    	    	  st=con.createStatement();
		    	      //prepare sql query 
		    	      String query="create table temp_student(sno number(5),sname varchar2(20))";
		    	      
		    	      //send and execute sql query in db sw
		    	      int count=0;
		    	      if(st!=null)
		    	    	   count= st.executeUpdate(query);
		    	      System.out.println(count);
		    	      if(count==0)
		    	    	  System.out.println("table is  created");
		    	      else
		    	    	  System.out.println("table is not created");
		    	      
		      }catch(SQLException se) {
		    	  se.printStackTrace();//known exception handling
		      }catch(Exception e) {
		    	  e.printStackTrace();//for unknown exception handling
		      }finally {
		    	  try {
		    		  if(st!=null)
		    			  st.close();
		    	  }catch(SQLException se) {
		    		  se.printStackTrace();
		    	  }
		    	  try {
		    		  if(con!=null)
		    			  con.close();
		    	  }catch(SQLException se) {
		    		  se.printStackTrace();
		    	  }
		      }
		      

	}

}
