package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class page_43_psdatainsertTestOracle {

	private static final String INSERT_DATE_QUERY = "INSERT INTO PERSON_INFO_DATES VALUES(PID_SEQ.NEXTVAL,?,?,?,?)";

	public static void main(String[] args) {

		Scanner scn = null;
		PreparedStatement ps = null;
		Connection con = null;

		try {
			// read inputs
			scn = new Scanner(System.in);
			String name = null, sdob = null, sdoj = null, sdom = null;
			if (scn != null) {
				System.out.println("pls enter pname");
				name = scn.next();
				System.out.println("pls enter DOB(dd-MM-YYYY)");
				sdob = scn.next();
				System.out.println("pls enter DOJ(YYYY-MM-dd)");
				sdoj = scn.next();
				System.out.println("pls enter DOM(MM-dd-yyyy)");
				sdom = scn.next();

			}
			// covert to string value to java.sql.Date class obj
			// for DOB (dd-mm-yyyy)
			// convert string date value to java.util.date class obj
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-YYYY");
			java.util.Date udob = sdf1.parse(sdob);
			// convert util date class object to sql date class object
			long ms = udob.getTime();

			java.sql.Date sqdob = new java.sql.Date(ms);
			// convert string value to sql data type
			// for DOJ yyyy-mm-dd direct conversion
			java.sql.Date sqdoj = java.sql.Date.valueOf(sdoj);

			// for DOM
			SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-YYYY");
			java.util.Date udom = sdf2.parse(sdom);
			// convert as sql data class obj
			ms = udom.getTime();
			java.sql.Date sqdom = new java.sql.Date(ms);

			// load the jdbc class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// prepared statement
			if (con != null)
				ps = con.prepareStatement(INSERT_DATE_QUERY);

			/// set value to param
			if (ps != null) {
				ps.setString(1, name);
				ps.setDate(2, sqdob);
				ps.setDate(3, sqdoj);
				ps.setDate(4, sqdom);
			}
			// send and execute sql query
			int count = 0;
			if (ps != null) {
				count = ps.executeUpdate();
				// process query
				if (count == 0)
					System.out.println("record is not inserted");
				else
					System.out.println("record is inserted");
			}

		} catch (SQLException se) {
			se.printStackTrace();// for known exception
		} catch (Exception e) {
			e.printStackTrace();// for uknown exception
		} finally {
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
			try {
				if (scn != null)
					scn.close();
			} catch (Exception se) {
				se.printStackTrace();
			}
		}

	}

}
