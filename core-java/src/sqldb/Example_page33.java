package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//write jdbc app to hike emp salary by giben percetange for given 3 designation
public class Example_page33 {

	public static void main(String[] args) {
		Scanner scn = null;
		Connection con = null;
		Statement st = null;

		try {
			scn = new Scanner(System.in);
			float given_Percentage = 0.0f;
			String desg1=null, desg2=null, desg3 = null;
			if (scn != null) {
				System.out.println("plse enter desg1::");
				desg1 = scn.next().toUpperCase();// CLERK
				System.out.println("pls ente desg2:::");
				desg2 = scn.next().toUpperCase();// manager
				System.out.println("pls enter desg3::");
				desg3 = scn.next().toUpperCase();//analytic
				System.out.println("pls enter given hike percentage: ");
				given_Percentage = scn.nextFloat();
			}
			// convert input values to sql requirment
			desg1 = "'" + desg1 + "'";
			desg2 = "'" + desg2 + "'";
			desg3 = "'" + desg3 + "'";
			// load the jdgbc driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create statement jdbc object
			if (con != null)
				st = con.createStatement();
			String query = "update emp set  sal=(sal*" + given_Percentage / 100 + ") where job in (" + desg1 + ","
					+ desg2 + "," + desg3 + ")";
			System.out.println(query);
			// result process obj
			int count = 0;
			if (st != null)
				count = st.executeUpdate(query);
			// process the result
			if (count == 0)
				System.out.println("no records found for updation");
			else
				System.out.println("no.of records that are effected: " + count);

		} // try
		catch (SQLException se) {
			if (se.getErrorCode() >= 900 && se.getErrorCode() <= 999)
				System.out.println("invalid couln names or table names or sql keyoword");
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
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
			try {
				if (scn != null)
					scn.close();
			} catch (Exception se) {
				se.printStackTrace();
			}

		}

	}
}
