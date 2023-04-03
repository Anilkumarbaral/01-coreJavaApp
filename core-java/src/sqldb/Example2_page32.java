package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example2_page32 {
//write jdbc to delete student DB table records vase on the given student number?
	public static void main(String[] args) {
		Scanner scn = null;
		Connection con = null;
		Statement st = null;

		try {
			scn = new Scanner(System.in);
			int sno = 0;
			if (scn != null) {
				System.out.println("pls enter student number");
				sno = scn.nextInt();
			} // if
				// load the jdbc driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create jdbc statemente object
			if (con != null)
				st = con.createStatement();
			// prepare for sql query
			String query = "DELETE FROM STUDENT WHERE SNO=" + sno;
			System.out.println(query);
			// process the update
			int count = 0;
			if (st != null) 
				count = st.executeUpdate(query);

			
			if (count == 0)
				System.out.println("records are not found");
			else
				System.out.println("student records are affected no: " + count);
		} //
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
