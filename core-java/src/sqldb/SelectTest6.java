package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest6 {

	public static void main(String[] args) {
	    Connection con=null;
	    		Statement st= null;
             ResultSet rs= null;
               
                      try {
                    	          //for loading class 
                    	    Class.forName("oracle.jdbc.driver.OracleDriver");
                    	    //establish connection
                    	    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
                    	    // createStatement
              	    
                    	    if(con!=null)
                    	    	st=con.createStatement();
                    	    //prepare query
                    	    String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE SAL=(SELECT MAX(SAL)FROM EMP)";
                    	    //send and execute query
                    	    if(st!=null)
                    	    	rs=st.executeQuery(query);
                    	    //process the result
                    	    
                    	    if(rs!=null) {
                    	    	boolean flag=false;
                    	    	while(rs.next()) {
                    	    		flag=true;
                    	    		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
                    	    	}//while
                    	    	if(flag==false)
                    	    		System.out.println("record not found");
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
			    	    	  }
	}

}
}
