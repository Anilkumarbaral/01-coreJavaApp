package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//write a JDBC App to delete student records based given city name(sadd)


public class Example_page32 {

	public static void main(String[] args) {
		  Connection con=null;
		  Statement st=null;
		  Scanner scn=null;
		  
		      try {//read inputs
		    	        scn=new Scanner(System.in);
		    	        String city=null;
		    	        
		    	        if(scn!=null) {
		    	        	System.out.println("pls enter student address (city name)");
		    	        	city=scn.next();// gives hyd
		    	        }
		    	           city="'"+city+"'";//gives 'hyd'
		    	        //load jdbc driver class
		    	        Class.forName("oracle.jdbc.driver.OracleDriver");
		    	        //establish connection to db
		    	        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		    	        //create statement
		    	          if(con!=null)
		    	        	  st=con.createStatement();
		    	        //prepare for sql query
		    	        String query="DELETE FROM STUDENT WHERE SADD="+city;
		    	        System.out.println(query);
		    	        //prepare for
		    	        int count=0;
		    	        if(st!=null)
		    	        count = st.executeUpdate(query);
		    	        
		    	        //process the result
		    	        if(count==0)
		    	        	System.out.println("no records found to delete");
		    	        else
		    	        	System.out.println("no. of record that are affacted::"+count);
		    	       
		    	        
		      }//try
		      catch(SQLException se) {
		    	   if(se.getErrorCode()>=900 && se.getErrorCode()<=999)
		    		   System.out.println("invalid couln names or table names or sql keyoword");
		    	     se.printStackTrace();
		      }catch(Exception e) {
		    	  e.printStackTrace();
		      }
		      finally {
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
		    	    }catch(Exception se) {
		    	    	se.printStackTrace();
		    	    }
		      }
		  

	}

}
