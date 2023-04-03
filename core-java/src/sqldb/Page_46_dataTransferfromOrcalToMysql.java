package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Page_46_dataTransferfromOrcalToMysql {
	private static final String oracle_query = "SELECT SNO,SNAME,SADD,AVAG FROM STUDENT";
	private static final String mysql_query = "INSERT INTO STUDENT VALUES(?,?,?,?)";

	public static void main(String[] args) {
		Connection oraclecon = null;
		Connection mysqlcon = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// register class with driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish connection
			oraclecon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			mysqlcon = DriverManager.getConnection("jdbc:mysql:///anildb", "root", "root");
			// create statement obj
			if (oraclecon != null)
				st = oraclecon.createStatement();
			if (mysqlcon != null)
				ps = mysqlcon.prepareStatement(mysql_query);

			// send and execute select resultset query to oracle data base
			if (st != null)
				rs = st.executeQuery(oracle_query);
			if (rs != null && ps != null) {
				while (rs.next()) {
					int no = rs.getInt(1);
					String name = rs.getString(2);
					String add = rs.getString(3);
					float avg = rs.getFloat(4);
					// now set each element insert to mysql db
					ps.setInt(1, no);
					ps.setString(2, name);
					ps.setString(3, add);
					ps.setFloat(4, avg);

					// execute the this data to mysql
					ps.executeUpdate();

				} // while
				System.out.println("successfully data inserted to mysql db....");
			} // if
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (oraclecon != null) {
					oraclecon.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (mysqlcon != null) {
					mysqlcon.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}

	}
}
