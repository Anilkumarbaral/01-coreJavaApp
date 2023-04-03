package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest4 {

	public static void main(String[] args) {
		  Scanner scn=null;
		  Connection con=null;
		  Statement st=null;
		  ResultSet rs=null;
		  int dtno=0;
		    
		      try {
		    	  scn=new Scanner(System.in);
		    	    if(scn!=null) {
		    	    	System.out.println("enter dptno :");
		    	    	dtno=scn.nextInt();
		    	    }
		    	    //load class object
		    	    Class.forName("oracle.jdbc.driver.OracleDriver");
		    	    //create connection
		    	  
		    		  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		    	  //create statement
		    	  if(con!=null)
		    		  st=con.createStatement();
		    	  //prepare query
		    	  
		    	  String query="SELECT DEPTNO ,DNAME,LOC FROM DEPT WHERE DEPTNO="+dtno;
		    	  //send and execute result query
		    	  if(st!=null)
		    		  rs=st.executeQuery(query);
		    	  System.out.println(query);
		    	  if(rs!=null) {
		    		    if(rs.next()) 
		    		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		    		    	else
		    		    	System.out.println("records not found");
		    		    
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
		    	    	  }try {
		    	    		     if(scn!=null)
		    	    		    	 scn.close();
		    	    	  }catch(Exception e) {
		    	    		  e.printStackTrace();
		    	    	  }
		    	      }
		      }
		  
	}


