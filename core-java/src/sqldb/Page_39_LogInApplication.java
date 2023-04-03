package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Page_39_LogInApplication {
	private static final String loginQuery = "SELECT COUNT(*) FROM IRCTC_TAB WHERE UNAME=? AND PWD=?";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner scn = null;

		try {//read inputs
			scn = new Scanner(System.in);
			String user = null;
			String password = null;

			if (scn != null) {// read inputs
				System.out.println("pls enter user id");
				user = scn.nextLine();//gives Anil kumar
				System.out.println("pls enter password");
				password = scn.nextLine();//gives win
			} // if
				// load the jdbc class driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create prepared statement
			if (con != null)
				ps = con.prepareStatement(loginQuery);
			// set values to the params of precompiled sql query

			if (ps != null) {
				ps.setString(1, user);
				ps.setString(2, password);
			}
			// send and execute the sql query in db sw

			if (ps != null)
				rs = ps.executeQuery();

			// process the resultset object
			if (rs != null) {
				rs.next();// moves the cursor to first record from BFR
				int count = rs.getInt(1);// get first col values of that first record

				// process the result
				if (count == 0)
					System.out.println("invalid credentials");
				else
					System.out.println("valid credentials");
			} // if

		} // try
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
                   try {
                	   if(rs!=null)
                		   rs.close();
                   }catch(SQLException se) {
                	   se.printStackTrace();
                   }   try {
                	   if(ps!=null)
                		   ps.close();
                   }catch(SQLException se) {
                	   se.printStackTrace();
                   }   try {
                	   if(con!=null)
                		 con.close();
                   }catch(SQLException se) {
                	   se.printStackTrace();
                   }   try {
                	   if(scn!=null)
                		   scn.close();
                   }catch(Exception se) {
                	   se.printStackTrace();
                   }
		}//finally

	}//main

}//class
