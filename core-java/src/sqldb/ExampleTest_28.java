package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// select empno,ename,job,sal,deptno from emp where job in('CLERK','MANAGER','SALESMAN'

import java.util.Scanner;

public class ExampleTest_28 {

	public static void main(String[] args) {
		// read inputs from enduser
		Scanner scn = null;
		String desg1 = null, desg2 = null, desg3 = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			scn = new Scanner(System.in);
			if (scn != null) {
				System.out.println("enter desg1..");
				desg1 = scn.next().toUpperCase();// ex give clerk
				System.out.println("enter desg2::");
				desg2 = scn.next().toUpperCase();
				System.out.println("enter desg3");
				desg3 = scn.next().toUpperCase();// gives salesman
			} // if
				// convert input values as required for sql query
			desg1 = "'" + desg1 + "'";// clerk
			desg2 = "'" + desg2 + "'";// manager
			desg3 = "'" + desg3 + "'";// salesman

			// load jdbc driver class
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create statement
			if (con != null)
				st = con.createStatement();

			// prepare sql query
			String query = "select empno,ename,job,sal,deptno from emp where job in(" + desg1 + "," + desg2 + ","
					+ desg3 + ") order by job";
			// send and execute sql query in db sw

			if (st != null)
				rs = st.executeQuery(query);

			if (rs != null) {
				System.out.println("the employee details are");
				while (rs.next() != false) {
					System.out.println(rs.getInt(1) + " " + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getFloat(4) + rs.getInt(5));
				} // while
			} // if
		} catch (SQLException e) {
			System.out.println(e.toString());// for details raised exception
		} catch (Exception se) {
			se.printStackTrace();// for unknown exception handling
		}

		finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				System.out.println(se.toString());
			} // catch
			try {
				if (st != null)
					st.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // catch
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // catch
			try {
				if (scn != null)
					scn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
