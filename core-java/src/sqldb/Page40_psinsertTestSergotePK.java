package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Page40_psinsertTestSergotePK {
	private static final String student_insert_query = "INSERT INTO STUDENT VALUES(SNO_SQE1.NEXTVAL,?,?,?)";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		Scanner scn = null;

		try {//read inputs
			scn = new Scanner(System.in);
			int count = 0;

			if (scn != null) {
				System.out.println("pls enter how many student details");
			    count = scn.nextInt();
			}
			// load the jdbc driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");

			// create prepared statement object having pre compiled sql query
			if (con != null)
				ps = con.prepareStatement(student_insert_query);
			// read the input value from enduser ,set them as query param values and execute
			// the precompiled
			if (ps != null && scn != null) {
				for (int i = 1; i <= count; i++) {
					//read each student input values
					System.out.println("enter "+i+"student details");
					System.out.println("pls enter student name");
					String sname = scn.next();
					System.out.println("pls enter student address");
					String sadd = scn.next();
					System.out.println("pls enter student avarage");
					float svag = scn.nextFloat();
					// set each student details as precompiled sql query param
					ps.setString(1, sname);
					ps.setString(2, sadd);
					ps.setFloat(3, svag);
					// execute precompiled sql query each time
					int result = ps.executeUpdate();
					// process execution result of precompiled sql query
					if (result == 0)
						System.out.println(i+"student value is not inserted");

					else
						System.out.println(i+"student value is inserted");

				} // for
			} // if

		} // try
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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
		} // finally

	}// main
}// class
