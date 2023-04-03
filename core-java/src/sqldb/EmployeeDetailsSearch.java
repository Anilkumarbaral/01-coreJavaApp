package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDetailsSearch {

	public static void main(String[] args) {
		// write a jdbc app that gives employee details emanp,ename,job ,sal
		//from 'emp 'db table based on the intial char of emplyee name
		
		   Scanner scn=null;
		   Connection con=null;
		   Statement st=null;
		   ResultSet rs=null;
		   String initialChar=null;
		   
		         try {
		        	     scn=new Scanner(System.in);//read input
		        	     if(scn!=null)
		        	    	 System.out.println("enter intial character");
		        	     initialChar=scn.next();
		        	     //conver input values as required for sql query
		        	     initialChar="'"+initialChar+"%'";
		        	     
		        	     //Register jdbc driver and load jdbc driver class
		        	     
		        	     Class.forName("oracle.jdbc.driver.OracleDriver");
		        	     
		        	    //establish connection
		        	     con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		        	     
		        	     //create statement
		        	     
		        	     if(con!=null)
		        	    	 st=con.createStatement();
		        	     
		        	     //prepare for sql query
		        	     String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE ENAME LIKE"+initialChar;
		        	     //send and execute sql query
		        	     if(st!=null) 
		        	    	 rs=st.executeQuery(query);
		        	     
		        	     if(rs!=null) {
		        	    	 boolean flag=false;// default value assign
		        	    	   while(rs.next()) {
		        	    		  flag=true;
		        	    		      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		        	    		      
		        	    	   }//while
		        	    	   if(flag==false)
		        	    		   System.out.println(" no records found");
		        	     }//if
		        	     
		        	     
		         }//try
		         catch(SQLException se) {// handling known exception
		        	  if(    se.getErrorCode()>= 900 && se.getErrorCode()<=999) {
		        		  System.out.println("invalid col name or table name or sql keyword");
		        		  se.printStackTrace();
		        	     }
		             }catch(Exception e) {
		        		    e.printStackTrace();// for catchig and hanling unknown exception
		        }
		        	  finally {
		        		          try {
		        		        	   if(rs!=null)
		        		        		   rs.close();
		        		          }catch(SQLException se) {
		        		        	  se.printStackTrace();
		        		          }try {
		        		        	      if(st!=null)
		        		        	    	  st.close();
		        		          }catch(SQLException se) {
		        		        	       se.printStackTrace();
		        		          }try {
		        		        	  if(con!=null)
		        		        		  con.close();
		        		          }catch(SQLException se) {
		        		        	  se.printStackTrace();
		        		          }try {
		        		        	  if(scn!=null)
		        		        		  scn.close();
		        		          }catch(Exception e) {
		        		        	     e.printStackTrace();
		        		          }
		        		      }
		        	  
		         }
				   
	}


