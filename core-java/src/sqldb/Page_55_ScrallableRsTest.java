package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Page_55_ScrallableRsTest {

	private static final String scrallableRS="SELECT ENO,ENAME,JOB,SAL FROM EMP";
	public static void main(String[] args) {
		         //read inputs
		         try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		        		 Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		        		 ResultSet rs=st.executeQuery(scrallableRS);
		        		 ){
		        	 if(rs!=null) {
		        		 System.out.println("top to bottom");
		        		 while(rs.next()) {
		        			     System.out.println(rs.getRow()+"------> "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		        		 }//while
		        		 System.out.println("record from bottom to top");
		        	 }//if
		        	
		         }//try
		         catch(SQLException se) {
		        	 se.printStackTrace();
		         }catch(Exception e) {
		        	 e.printStackTrace();
		         }

	}

}

