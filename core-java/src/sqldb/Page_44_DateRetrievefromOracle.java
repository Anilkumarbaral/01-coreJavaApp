package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Page_44_DateRetrievefromOracle {

	public static void main(String[] args) {
		final String Query = "SELECT PID,PNAME,DOB,DOJ,DOM FROM PERSON_INFO_DATES";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// load jdbc driver class object
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create preparedstatement obj
			if (con != null)
				ps = con.prepareStatement(Query);
			// send and execute result set
			if (ps != null)
				rs = ps.executeQuery();
			// procecss the result
			if (rs != null)
				while (rs.next()) {
					int number = rs.getInt(1);
					String name = rs.getString(2);
					java.sql.Date sldob = rs.getDate(3);
					java.sql.Date sldoj = rs.getDate(4);
					java.sql.Date sldom = rs.getDate(5);
					// convert sql date to string date
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
					String sdob = sdf.format(sldob);
					String sdoj = sdf.format(sldoj);
					String sdom = sdf.format(sldom);
					System.out.println(number + " " + name + " " + sdob + " " + sdoj + " " + sdom);
				} // while

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (ps != null)
					ps.close();
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
