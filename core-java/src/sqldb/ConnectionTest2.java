package sqldb;
import java.sql.*;
public class ConnectionTest2 {

	public static void main(String[] args) throws SQLException {
	                        // register db s/w driver 
		       oracle.jdbc.driver.OracleDriver obj = new oracle.jdbc.driver.OracleDriver();
		       // create connection
		       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		       
		       
		       if(con==null)
		    	   System.out.println("connection not established");
		       else
		    	   System.out.println("connnection established");
	}

}
