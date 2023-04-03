package sqldb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

/* create or replace PROCEDURE P_GET_EMPS_BYNAME_INTIAL 
(
  INITIALCHAR IN VARCHAR2 
, DETAILS OUT SYS_REFCURSOR 
) AS 
BEGIN
     open details for
      select eno,ename,job,sal from emp where ename like initialchar;
END P_GET_EMPS_BYNAME_INTIAL;
*/
public class Page_54_Pc_cursorTest {
	private static final String procedurecall = "{call P_GET_EMPS_BYNAME_INTIAL(?,?)}";

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String initialchar = null;
			if (scn != null) {
				System.out.println("pls enter initial name ::");
				initialchar = scn.next() + "%";
			}
			try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
					// create callable object
					CallableStatement cs = con.prepareCall(procedurecall);) {
				// register outParam with jdbctype
				if (cs != null)
					cs.registerOutParameter(2, OracleTypes.CURSOR);
				// set value to in param
				if (cs != null)
					cs.setString(1, initialchar);
				/// call the plsql procedure
				if (cs != null)
					cs.execute();
				// get the result from out param
				if (cs != null) {
					ResultSet rs = (ResultSet) cs.getObject(2);
					if (rs != null) {
						 boolean flag=false;
						while (rs.next()) {
							flag=true;
							System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
									+ rs.getInt(4));
						} // while
						if(flag==false)
							System.out.println("record not found");
					} // if
				} // if
			} // try2
		} // try1
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
