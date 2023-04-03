package sqldb;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Example2_page28 {

	public static void main(String[] args) {
	             Scanner scn=null;
	             Connection con=null;
	             Statement st=null;
	             ResultSet rs=null;
	             
	             try {
	            	 scn=new Scanner(System.in);
	            	 if(scn!=null);
	            	 String desg1,desg2,desg3;
	            	 System.out.println("pls enter desg1");
	            	 desg1=scn.next().toUpperCase();
	            	 System.out.println("pls enter desg2");
	            	 desg2=scn.next().toUpperCase();
	            	 System.out.println("pls enter desg3");
	            	 desg3=scn.next().toUpperCase();
	            	//prepare for sql type
	            	 desg1="'"+desg1+"'";
	            	 desg2="'"+desg2+"'";
	            	 desg3="'"+desg3+"'";
	            	 
	            	 
	            	 //load the jdbc driver class
	            	 Class.forName("oracle.jdbc.driver.OracleDriver");
	            	 //establish connecton
	            		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
	            	 //create statement
	            		 if(con!=null)
	            	 st=con.createStatement();
	            	 //send and execute sql query to db sw
	            	 String query="Select empno,ename,job,sal,deptno from emp where job in("+desg1+", "+desg2+", "+desg3+" ) order by job";
	            	 System.out.println(query);
	            	if(st!=null) {
	            		 System.out.println(query);
	            		rs=st.executeQuery(query);
	            		while(rs.next()!=false){
	            			   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
	            	     	}//while
	            	  }//if          	     
	             }//try
	             catch(SQLException se) {
	            	 System.out.println(se.toString());//for known exception handling
	             }catch(Exception e) {
	            	 e.printStackTrace();//for handling unknown exception
	             }
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
