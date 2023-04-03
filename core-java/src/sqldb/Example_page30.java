package sqldb;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Example_page30 {// java app to get employee details by using initial names
	public static void main(String[] args) {
		   Scanner scn=null;
		   Connection con=null;
		   Statement st=null;
		   ResultSet rs=null;
		   
		   try {// read inputs
			      scn=new Scanner(System.in);
			      String initialchar=null;
			      if(scn!=null) {
			    	  System.out.println("pls enter intial name");
			    	   initialchar=scn.next().toUpperCase();//gives
			    	 
			      }//convert input values as required for the sql query
			    	  initialchar="'"+initialchar+"%'";//gives 'A%'
			    	  //register jdbc driver by load the jdbc driver class
			    	  Class.forName("oracle.jdbc.driver.OracleDriver");
			    	  // establish connection
			    	  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			    	  //create statement
			    	  if(con!=null)
			    		  st=con.createStatement();
			    	  //send and execute sql db sw
			    	  String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE ENAME LIKE "+initialchar;
			    	  if(st!=null)
			    		  rs=st.executeQuery(query);
			    	 
			    	  if(rs!=null) {
			    		     boolean flag=false;
			    		     while(rs.next()) {
			    		    	         flag=true;
			    		    	         System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"  "+rs.getFloat(4));
			    		     }//while 
			    		     if(flag==false) {
			    		    	  System.out.println("record not found");
			    		     }//if
			    	  }//if
			    	  
		   }//try
		   catch(SQLException se) {
			   if(se.getErrorCode()>=900 && se.getErrorCode()<=999)
			       System.out.println("invalid table or columns names or sql keyword");///for known exception handling
		   }catch(Exception e) {
			     System.out.println(e.toString());// for unknown exception handling
		   }//catch
		   finally {
			              try {
			            	  if(rs!=null)
			            		  rs.close();
			              }catch(SQLException se) {
			            	  se.printStackTrace();
			              }
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
			              try {
			            	      if(scn!=null)
			            	    	  scn.close();
			              }catch(Exception e) {
			            	  e.printStackTrace();
			              }
		   }
		   

	}

}
