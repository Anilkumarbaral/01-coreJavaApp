package sqldb;
//write jdbc app for n student details insert into db by colleting details from enduser
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PsinsertTest {
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO STUDENT VALUES(?,?,?,?)";

	public static void main(String[] args) {
		       Scanner scn=null;
		       Connection con=null;
		       PreparedStatement ps=null;
                         try {
                        	      //read inputs
                        	   scn=new Scanner(System.in);
                        	   int count=0;
                        	   if(scn!=null) {
                        		      System.out.println("pls enter insert student details");
                        		      count=scn.nextInt();  
                        	   }
                        	   //load the jdbc driver class
                        	   Class.forName("oracle.jdbc.driver.OracleDriver");
                        	   //establish the connection
                        	  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
                        	  //create preparedStatement object having pre_compiled query
                        	  if(con!=null)
                        		  ps=con.prepareStatement(STUDENT_INSERT_QUERY);
                        	  //read input values from enduser ,set them query param values and execute precompiled
                        	  //sql query for multiple times
                        	  if(ps!=null && scn!=null) {  
                        		  
                        	          for(int i=1;i<=count;i++) {
                        	        	  //read each student details
                        	        	  System.out.println("enter student "+i+"details");
                        		      System.out.println("pls enter student no");
                        		      int sno=scn.nextInt();
                        		      System.out.println("pls enter student name");
                        		      String sname=scn.next();
                        		      System.out.println("pls enter student address");
                        		      String sdd=scn.next();
                        		      System.out.println("pls enter student avag");
                        		      float savg=scn.nextFloat();
                        		      //set each student details as pre -compiled sql query
                        		      ps.setInt(1, sno);ps.setString(2, sname);ps.setString(3, sdd);ps.setFloat(4, savg);
                        		      //execute pre-compiled sql query each time
                        		     int result =  ps.executeUpdate();
                        		     //process  execution  result of pre -compiled sql query
                        		     if(result==0)
                        		    	 System.out.println("student details not inserted");
                        		     else
                        		    	 System.out.println("student details inserted");
                        		      
                        	          }//for
                        	  }//if
                         }//try
                         catch(SQLException se) {
                        	 se.printStackTrace();//for known exception handling
                         }
                         catch(Exception e) {
                        	 e.printStackTrace();//for unknown exception handling
                         }//catch
                         finally {
                        	     try {
                        	    	 if (ps!=null)
                        	    		 ps.close();
                        	     }catch(SQLException se) {
                        	    	se.printStackTrace();
                        	     }
                        	     try {
                        	    	 if (con!=null)
                        	    		 con.close();
                        	     }catch(SQLException se) {
                        	    	se.printStackTrace();
                        	     }
                        	     try {
                        	    	 if (scn!=null)
                        	    		 scn.close();
                        	     }catch(Exception se) {
                        	    	se.printStackTrace();
                        	     }
                         }
	}

}
