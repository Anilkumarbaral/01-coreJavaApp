package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest2 {

	public static void main(String[] args) {
		Scanner scn = null;
		String desg1 = null, desg2 = null, desg3 = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			scn = new Scanner(System.in);
			if (scn != null) {
				System.out.println("enter desg1:::");
				desg1 = scn.next().toUpperCase();
				System.out.println("enter desg2:::");
				desg2 = scn.next().toUpperCase();
				System.out.println("enter desg3:::");
				desg3 = scn.next().toUpperCase();

				// convert iput values as sql query
				desg1 = "'" + desg1 + "'";
				desg2 = "'" + desg2 + "'";
				desg3 = "'" + desg3 + "'";

				// for class oject loading
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// establish connection
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");

				// create statment
				if (con != null)
					st = con.createStatement();
				// prepare for sql query
				String query = "SELECT  EMPNO, ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(" + desg1 + "," + desg2
						+ "," + desg3 + ")ORDER BY JOB";

				// send and execute query
				if (st != null)
					rs = st.executeQuery(query);
				if (rs != null) {
					System.out.println("to get employee details");
					while (rs.next() != false) {
						
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
								+ rs.getFloat(4) + " " + rs.getInt(5));
					}
				}
			}

		} catch (SQLException se) {// for handling knowing exception
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();// for handling unknown exception
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				scn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
