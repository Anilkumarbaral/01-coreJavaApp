package sqldb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/*CREATE OR REPLACE FUNCTION FX_GET_EMP_DETAILS 
(
  NO IN NUMBER 
, NAME OUT VARCHAR2 
, JOBS OUT VARCHAR2 
) RETURN FLOAT AS 
SALARY FLOAT;
BEGIN
        SELECT ENAME,JOB ,SAL INTO NAME ,JOBS ,SALARY FROM EMP WHERE ENO=NO;
  RETURN SALARY;
END FX_GET_EMP_DETAILS;*/
public class Page_54_functionalTest2 {
	private static final String csFunctional_query = "{?=call FX_GET_EMP_DETAILS(?,?,?)}";

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {
			// read inputs
			int no = 0;
			if (scn != null) {
				System.out.println("pls enter emp number: ");
				no = scn.nextInt();
			} // if
				// establishing connection
			try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
					// create callabale statement object
					CallableStatement cs = con.prepareCall(csFunctional_query);) {

				// register return,out parama with jdbc type
				if (cs != null) {
					cs.registerOutParameter(1, Types.FLOAT);// return type always 1 number
					cs.registerOutParameter(3, Types.VARCHAR);// out param name
					cs.registerOutParameter(4, Types.VARCHAR);// out param job
				}
				// set value to in param
				if (cs != null)
					cs.setInt(2, no);
				// call /execute plsql function

				if (cs != null)
					cs.execute();
				// get the result from outpram and return param
				if (cs != null) {
					String name = cs.getString(3);
					String job = cs.getString(4);
					float sal = cs.getFloat(1);
					System.out.println("employee name::" + name);
					System.out.println("employee job::" + job);
					System.out.println("employee salary::" + sal);

				} // if

			} // try2

		} // try1
		catch (SQLException se) {
			System.out.println("record not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
