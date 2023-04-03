package sqldb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Page_68_scrollableRsWith_fileproperties {

	private static final String scrallableRS="SELECT ENO,ENAME,JOB,SAL FROM EMP";
	public static void main(String[] args) {
		     Properties pros=null;
		    try(InputStream is = new FileInputStream("src/sqldb/jdbc.properties")){
		    	        pros=new Properties();
		    	     pros.load(is);
		    }catch(FileNotFoundException se) {
		    	se.printStackTrace();
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
		
		         //read inputs
		         try (Connection con=DriverManager.getConnection(pros.getProperty("jdbc.url"),pros.getProperty("jdbc.username"),pros.getProperty("jdbc.pwd"));
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

