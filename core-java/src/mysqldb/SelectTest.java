package mysqldb;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
		Scanner scn = null;
		String desg1 = null, desg2 = null, desg3 = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			scn = new Scanner(System.in);
			if (scn != null) {
				System.out.println("enter desg1:::");//CLERK
				desg1 = scn.next().toUpperCase();
				System.out.println("enete desg2:::");//MANAGER
				desg2 = scn.next().toUpperCase();
				System.out.println("enter desg3:::");//SALESMAN
				desg3 = scn.next().toUpperCase();

			}
			// convert input values as required for sql query
			desg1 = "'" + desg1 + "'";
			desg2 = "'" + desg2 + "'";
			desg3 = "'" + desg3 + "'";
			// load the jdbc driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create statement object
			if (con != null)
				st = con.createStatement();

			// prepare sql query
			// select empno,emname,job,sal,deptno from emp where job in
			// ('CLERK','MANAGER','SALESMAN')ORDER BY JOB
			String query = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (" + desg1 + "," + desg2 + ","
					+ desg3 + ")ORDER BY JOB";

			// send query and execute in db
			if (st != null) 
				rs = st.executeQuery(query);
			if(rs!=null){
				System.out.println("the employee details are ");
				
				while (rs.next() != false) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getFloat(4) + " " + rs.getInt(5));
				}

			}

		} catch (SQLException se) {// to handle known exception
			System.out.println(se.toString());
		} catch (Exception e) { // to handle unknown exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// System.out.println(e.toString());
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
