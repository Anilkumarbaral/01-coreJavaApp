package sqldb;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class PsAgeCalculator {
	private static final String age_calculator="SELECT ROUND((SYSDATE-DOB)/365.25,2) FROM PERSON_INFO_DATES WHERE PID=?";  

	public static void main(String[] args) {
		 Scanner scn=null;
		 Connection con=null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 
		                  try {
		                	       //read inputs
		                	  scn=new Scanner(System.in);
		                	  int pid=0;
		                	  if(scn!=null) {
		                		  System.out.println("pls enter person id::");
		                		  pid=scn.nextInt();
		                	  }
		                	  
		                	  
		                	  //load the jdbc driver class 
		                	  Class.forName("oracle.jdbc.driver.OracleDriver");
		                	  //establish the connection
		                	  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		                	  //create preparedstatement obj
		                	  if(con!=null) 
		                		ps=con.prepareStatement(age_calculator);
		                	  //set value to param
		                	  ps.setInt(1, pid);
		                	  //send and execute the sql data
		                	  if(ps!=null)
		                		  rs=ps.executeQuery();
		                	  
		                		 //process the result
		                	  if(rs!=null) {
		                		  if(rs.next()) {
		                			  float age=rs.getFloat(1);
		                			  System.out.println("person data found   " +age);
		                		  }
		                		  else 
		                			  System.out.println("person data not found");
		                	  
		                	  }//if	  
		            }//try
		                  catch(SQLException se) {
		                	  se.printStackTrace();
		                  }
		                  catch(Exception e) {
		                	  e.printStackTrace();
		                  }
		                  finally {
		                	       try {
		                	    	   if(rs!=null)
		                	    		   rs.close();
		                	       }catch(SQLException se) {
		                	    	   se.printStackTrace();
		                	       }
		                	       try {
		                	    	   if(ps!=null)
		                	    		   ps.close();
		                	       }catch(SQLException se) {
		                	    	   se.printStackTrace();
		                	       } try {
		                	    	   if(con!=null)
		                	    		   con.close();
		                	       }catch(SQLException se) {
		                	    	   se.printStackTrace();
		                	       }
		                	       try {
		                	    	   if(scn!=null)
		                	    		   scn.close();
		                	       }catch(Exception se) {
		                	    	   se.printStackTrace();
		                	       }
		                  }
	}

}
