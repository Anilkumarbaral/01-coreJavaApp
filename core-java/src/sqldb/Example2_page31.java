package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//write a jdbc app to get cound of record fr	om studend db table
public class Example2_page31 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		// Scanner scn=null;

		try {
			// read inputs
			// jdbc driver class loading
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create jdbc statement object
			if (con != null)
				st = con.createStatement();
			// prepare sql query
			String query = "SELECT COUNT(*) FROM STUDENT";
			// send and execute the sql query
			if (st != null)
				rs = st.executeQuery(query);
			// process the resultset(0 or 1 record)
			if (rs != null) {
				rs.next();
				// int count=rs.getInt(1);
				int count = rs.getInt("COUNT(*)");
				System.out.println("records cound in student DB table:" + count);
			} // if
		} // try
		catch (SQLException se) {
			System.out.println(se.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // catch
			try {
				if (st != null)
					st.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}
	}
}
