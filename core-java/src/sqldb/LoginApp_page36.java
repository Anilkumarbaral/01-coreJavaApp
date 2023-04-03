package sqldb;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class LoginApp_page36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Console consss=null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Scanner scn = null;

		try {// read inputs
		scn = new Scanner(System.in);
			 //consss=System.console();
			String uname = null;
			String pwd = null;
			//if (consss != null) {
			if(scn!=null) {
				System.out.println("Pls enter user id");
			//	uname = consss.readLine();
			      uname=scn.nextLine();
				System.out.println("pls enter password");
			//	pwd = new String(consss.readPassword());
				pwd=scn.nextLine();
             
			} // if
				// prepare query as per sql query
			uname = "'" + uname + "'";// enter userid
			pwd = "'" + pwd + "'";// enter password
			// load the jdbc driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// establish connectionn in btwn app to DB sw
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create statement object
			if (con != null)
				st = con.createStatement();
			// prepare sql query type
			String query = "SELECT COUNT(*) FROM IRCTC_TAB WHERE UNAME=" + uname + "AND PWD=" + pwd ;
			System.out.println(query);
			// send and execute sql query
			if (st != null)
				rs = st.executeQuery(query);
			// process the result set
			if (rs != null) {
				rs.next();//
			int count = rs.getInt(1);
			//System.out.println(count);
			if (count == 0)
				System.out.println("invalid credentials");
			else
				System.out.println("valid Credentials");
			}//if

		} catch (SQLException se) {
			se.printStackTrace();
		} // for handling known exception

		catch (Exception e) {
			e.printStackTrace();// for unknown exception handling
		} // catch
		finally {
			try {
				if (rs != null)
					rs.close();

			} catch (SQLException se) {
				System.out.println(se.toString());
			}
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
