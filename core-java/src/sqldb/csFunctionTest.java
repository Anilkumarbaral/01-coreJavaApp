package sqldb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/*CREATE OR REPLACE FUNCTION FX_GET_STUDENT_DETAILS_BY_N0 
(
  NO IN NUMBER 
, NAME OUT VARCHAR2 
, ADDRS OUT VARCHAR2 
) RETURN FLOAT
AS 
  PERCENTAGE FLOAT;
BEGIN
         SELECT SNAME,SADD,SAVG INTO NAME,ADDRS,PERCENTAGE FROM STUDENT WHERE SNO=NO;
  RETURN PERCENTAGE ;
END FX_GET_STUDENT_DETAILS_BY_N0;*/
public class csFunctionTest {
	private static final String cs_Functional_query = "{?=call  FX_GET_STUDENT_DETAILS_BY_N0(?,?,?)}";

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in);) {
			// read inputs
			int no = 0;
			if (scn != null) {
				System.out.println("pls enter student number: ");
				no = scn.nextInt();
				// establish connection
				try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"admin");
						// create callablestatement
						CallableStatement cs = con.prepareCall(cs_Functional_query);) {
					// register return ,outparam with jdbc types

					if (cs != null) {
						cs.registerOutParameter(1, Types.FLOAT);
						cs.registerOutParameter(3, Types.VARCHAR);
						cs.registerOutParameter(4, Types.VARCHAR);
					}
					// set value to in param
					if (cs != null)
						cs.setInt(2, no);
					// call /execute plsql function

					if (cs != null)
						cs.execute();
					// get the result from return and outpraam
					if (cs != null) {
						String name = cs.getString(3);
						String add = cs.getString(4);
						int nos = cs.getInt(1);
						System.out.println("student name:: " + name);
						System.out.println("student addrs:: " + add);
						System.out.println("student avag:: " + nos);
					} // if
				} // try2

			} // try1
		} catch (SQLException se) {
			System.out.println("record not found");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
