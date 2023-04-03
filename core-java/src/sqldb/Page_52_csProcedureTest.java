package sqldb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

//create or replace procedure first_pro(x in number,y in number,z out number)as
//begin
//z:=x+y;
//end;
public class Page_52_csProcedureTest {
	private static final String CallProcedure = "{CALL FIRST_PRO(?,?,?)}";

	public static void main(String[] args) {
		// read inputs
		try (Scanner scn = new Scanner(System.in);) {
			System.out.println("pls enter 1st value::");
			int first = scn.nextInt();
			System.out.println("pls enter 2nd value:: ");
			int second = scn.nextInt();
			// establish the connection
			try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
					// create callbable statement object having query calling pl sql procedure as
					// the pre compiled qury
					CallableStatement cs = con.prepareCall(CallProcedure);) {
				// registered OUT param with jdbc data types
				if (cs != null)
					cs.registerOutParameter(3, Types.INTEGER);
				// set value to IN param
				if (cs != null) {
					cs.setInt(1, first);
					cs.setInt(2, second);
				}
				// execute / call the pl sql function
				if (cs != null)
					cs.execute();
				// gather the result from OUT param
				int result = 0;
				if (cs != null)
					result = cs.getInt(3);
				System.out.println("sum is: " + result);

			} // try2
		} // try1
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
