package sqldb;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Example2_page30 {

	public static void main(String[] args) {
		       Connection con=null;
		       Statement st=null;
		       ResultSet rs=null;
		       Scanner scn=null;
		         
		       
		       try {
		    	        scn=new Scanner(System.in);
		    	        String initialchar=null;
		    	        System.out.println("pls enter ur intial name");
		    	        if(scn!=null) {
		    	        	   initialchar =scn.next().toUpperCase();//give input
		    	        }//prepare for sql query
		    	        initialchar ="'%"+initialchar+"%'";
		    	        //register jdbc driver by loading jdbc class
		    	        Class.forName("oracle.jdbc.driver.OracleDriver");
		    	        //establish connection
		    	        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		    	        //create statement
		    	        if(con!=null)
		    	        	st=con.createStatement();
		    	        //prepare sql query
		    	        String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE ENAME LIKE"+initialchar;
		    	        //send and execute sql to db sw
		    	        if(st!=null)
		    	        	rs=st.executeQuery(query);
		    	        //prepare result query object process
		    	        if(rs!=null) {
		    	        	   boolean flag=false;
		    	        	   while(rs.next()) {
		    	        		   flag=true;
		    	        		   System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getString(3)+" "+rs.getFloat(4));
		    	        		   
		    	        	   }//while
		    	        	   if(flag==false) {
		    	        		   System.out.println("record not found");
		    	        	   }//if
		    	        }//if
		       }//try
		       catch(SQLException se) {
		    	   if (se.getErrorCode()>=900 && se.getErrorCode() <=999)
		    		     System.out.println("column or table invalid");
		    	           se.printStackTrace();
		    	   		       }//catch
		       catch(Exception e){
		    	        e.printStackTrace();//for unknown exception handling
		    	      
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
