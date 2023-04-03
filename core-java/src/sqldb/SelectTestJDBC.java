package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTestJDBC {

	public static void main(String[] args) {
		System.out.println("SelectTestJDBC.main()");
		Scanner scn=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String initialChar=null;
		  
		      try {
		    	   scn=new Scanner(System.in);//read inputs
		    	    
		    	   if(scn!=null) {
		    		   System.out.println("eneter the intial character of  employee");
		    		 initialChar=  scn.next();//gives 
		    	   }
		    	   //convert input values as required for the sql query
		    	   initialChar="'"+initialChar+"%'";// gives 's%'
		    	   
		    	   //register the jdbc by the loading jdbc class
		    	   
		    	   Class.forName("oracle.jdbc.driver.OracleDriver");
		    	   //establish connection
		    	   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		    	   
		    	   //create statement
		    	   if(con!=null)
		    		   st=con.createStatement();
		    	   //prepare sql query
		    	   
		    	   String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE ENAME LIKE"+initialChar;
		    	   System.out.println(query);
		    	   //send and execute sql query in DB s/w
		    	   if(st!=null)
		    		   rs=st.executeQuery(query);
		    	   //process the Resultset object
		    	   if(rs!=null) {
		    	    boolean flag=false;
		    		     while(rs.next()) {
		    		         flag =true;
		    		    	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		    		     }//while close
		    		   if(  flag == false)
		    		     System.out.println("no records found");
		    	   }// if close
		    	   
		    	   
		      }//try
		      catch(SQLException se) {// for handling known exception
		    	  if(se.getErrorCode()>=900 && se.getErrorCode()<=900)
		    		  System.out.println("invalid col names or table names or sql keyword");
		      }catch(Exception e) {// for handling unknown exception
		    	     e.printStackTrace();
		      }
		      finally {// close jdbc objs
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
