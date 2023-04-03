package sqldb;
import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Page_65_DatabaseMetadata {
  
	     public static void main(String[]args) {
	    	 
	    	//using databasemetadata
	    	 
	    	 try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin")) {
	    		         //create DatabaseMetaData obj     
	    		 DatabaseMetaData dmd  =con.getMetaData();
	    		 if(dmd!=null) {
	    			 System.out.println("db s/q name::"+dmd.getDatabaseProductName());
	    			 System.out.println("db s/w version::"+dmd.getDatabaseProductVersion());
	    			 System.out.println("db s/w driver name:"+dmd.getDriverName());
	    			 System.out.println("db s/w driver version:: "+dmd.getDriverVersion());
	    			 
	    			 
	    		 }
	    	 }catch(SQLException se) {
	    		  se.printStackTrace();
	    	 }catch(Exception e) {
	    		 e.printStackTrace();
	    	 }
	    	 
	    	 
	    	 
	     }
}
