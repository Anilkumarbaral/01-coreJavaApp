package sqldb;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Example2_page33 {

	public static void main(String[] args) {
		            Scanner scn=null;
		            Connection con=null;
		            Statement st=null;
		            
		            try {//define varible as per sql requirment
		            	       scn=new Scanner(System.in);
		            	       int no=0;//number
		            	       String name=null;//name
		            	       String add=null;//address
		            	       float avg=0.0f;
		            	       
		            	       if(scn!=null)
		            	    	   System.out.println("pls enter number");
		            	       no=scn.nextInt();
		            	       System.out.println("pls enter sname:");
		            	       name=scn.next();
		            	       System.out.println("pls enter address");
		            	       add=scn.next();
		            	       System.out.println("pls enter student average");
		            	       avg=scn.nextFloat();
		            	       //prepare for sql requirment
		            	       name="'"+name+"'";//gives name
		            	       
		            	       add="'"+add+"'";//gives address
		            	       //load jdbc class driver
		            	       Class.forName("oracle.jdbc.driver.OracleDriver");
		            	       //establish connection
		            	         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		            	         if(con!=null)
		            	         st=con.createStatement();
		            	         //prepare sql query
		            	         
		            	         String query="insert into student values("+no+","+name+","+add+","+avg+")";
		            	         System.out.println(query);
		            	         //send execute sql query in DB s/w
		            	         int count =0;
		            	         if(st!=null)
		            	        	count=st.executeUpdate(query);
		            	         //process
		            	         if(count==0) 
		            	        	 System.out.println("record not inserted");
		            	         else
		            	        	 System.out.println("record inserted");
   	    	   
		            } catch(SQLException se) {
		            	se.printStackTrace();//for known exception handling
		            }
		            catch(Exception e) {
		            	e.printStackTrace();// for unknown exception handling
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
