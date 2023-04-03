package sqldb;//write a jdbc app that gives department from dept table based on gives deptno?
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example_Page31 {

	public static void main(String[] args) {
		              Scanner scn=null;
		              Connection con=null;
		              Statement st=null;
		              ResultSet rs=null;
		              
		               try {//read input
		            	        scn=new Scanner(System.in);
		            	        int dptno=0;
		            	        if(scn!=null)
		            	        	System.out.println("pls enter deptno:::");
		            	        dptno=scn.nextInt();//gives
		            	        //jdbc driver calss load
		            	        Class.forName("oracle.jdbc.driver.OracleDriver");
		            	        //establish connection
		            	        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		            	        
		            	        //create jdbc statement object
		            	        if(con!=null)
		            	        st=con.createStatement();
		            	        //prepare sql query
		            	        String query="SELECT DEPTNO,DNAME,LOC FROM DEPT WHERE DEPTNO="+dptno;
       	                      //send and execute query
		            	        if(st!=null)
		            	        	rs=st.executeQuery(query);
		            	        //prepare resultset process
		            	        if(rs!=null)
		            	        	if(rs.next())
		            	        		System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3) );		 
		            	        	else {
		            	        		System.out.println("record not found");
		            	        	}//else block
		               }//try block
		               catch(SQLException se) {//for known exception handling
		            	   se.printStackTrace();
		               }catch(Exception e) {
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
		            	         }   try {
		            	        	 if(scn!=null)
		            	        		 scn.close();
		            	         }catch(Exception se) {
		            	        	 se.printStackTrace();
		            	         }
		               }
		               
	}

}
