package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
	    //     register jdbc driver s/w
		// create jdbc driver class object
		oracle.jdbc.driver.OracleDriver obj=new oracle.jdbc.driver.OracleDriver();
		         //   DriverManager.registerDriver(obj);
		// establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		
		
		if (con==null)
			System.out.println("connection is not established");
		else
			System.out.println("connection is established");
	}

}
