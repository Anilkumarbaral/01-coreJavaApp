package sqldb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Page_53procedureTestAuthentication {
	/*
	 * CREATE OR REPLACE PROCEDURE P_AUTHENTICATE ( USERNAME IN VARCHAR2 , PASSWORD
	 * IN VARCHAR2 , RESULT OUT VARCHAR2 ) AS CNT NUMBER(5); BEGIN SELECT
	 * COUNT(*)INTO CNT FROM IRCTC_TAB WHERE UNAME=USERNAME AND PWD=PASSWORD;
	 * IF(CNT<>0) THEN RESULT:='VALIDCREDENTIAL'; ELSE RESULT:='INVALIDCREDENTIAL';
	 * END IF; END P_AUTHENTICATE;
	 */
	private static final String procedureQuery = "CALL P_AUTHENTICATE(?,?,?)";

	public static void main(String[] args) {
		// read inputs
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("pls enter username:: ");
			String uname = scn.next();
			System.out.println("pls enter password:: ");
			String password = scn.next();
			try (// establish the connection
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
							"admin");
					// create callableobject
					CallableStatement cs = con.prepareCall(procedureQuery);

			) {
				// set out param value
				if (cs != null)
					cs.registerOutParameter(3, Types.VARCHAR);
				// set in param value
				if (cs != null)
					cs.setString(1, uname);
				cs.setString(2, password);
				// call plsq procedure
				if (cs != null)
					cs.execute();

				// get out param result
				String result = null;
				if (cs != null)
					result = cs.getString(3);
				System.out.println(result);
			}
		}

		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
