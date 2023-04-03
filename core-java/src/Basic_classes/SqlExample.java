package Basic_classes;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SqlExample {//find the name by using initial name from emp db

	public static void main(String[] args) {
		  Connection con=null;
		  Statement st=null;
		  ResultSet rs=null;
		  Scanner scn=null;
		   
		     try {
		    	 scn=new Scanner(System.in);
		    	      if(scn!=null) 
		    	    	  System.out.print("pls enter ur initial name ");
		    	    	     String initialchar=scn.next().toUpperCase();
		    	    	     initialchar="'"+initialchar+"%'";
		    	      
		    	      //prepare for sql type
		    	      //register with driver so load the jdbc class
		    	      Class.forName("oracle.jdbc.driver.OracleDriver");
		    	      //establish connection
		    	      con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		    	      //create statement
		    	      if(con!=null)
		    	    	  st=con.createStatement();
		    	      //prepare sql query
		    	      String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE ENAME LIKE"+initialchar;
		    	      //send and execute sql to db sq
		    	      if(st!=null)
		    	    	  rs=st.executeQuery(query);
		    	      //prepare result query obj process
		    	      
		    	      if(rs!=null) {
		    	    	      boolean flag=false;
		    	    	        while(rs.next()) {
		    	    	        	flag=true;
		    	    	        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getString(3)+rs.getFloat(4));
		    	    	        }//while
		    	    	        if(flag==false)
		    	    	        	System.out.println("record not found");
		    	      }//if
		     }//try
		     catch(SQLException se) {//known exception handling
		    	      if(se.getErrorCode()>=900 && se.getErrorCode()<=999)
		    	    	  System.out.println("invalid colms or talble or sql keyword");
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
  	     }catch(Exception  e) {
  	    	 e.printStackTrace();
  	     }
		
	}

}
