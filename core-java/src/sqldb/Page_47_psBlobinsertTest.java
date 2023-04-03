package sqldb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Page_47_psBlobinsertTest {
	private static final String Insert_artist_query = "INSERT INTO ANILSOFTWARE VALUES(AID_SEQ.NEXTVAL,?,?,?)";

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {
			// read inputs
			String name = null, addrs = null, photoLocation = null;
			if (scn != null) {
				System.out.println("enter artist name:: ");
				name = scn.next();
				System.out.println("enter Artist address::");
				addrs = scn.next();
				System.out.println("enter artis location::");
				photoLocation=scn.next();

			} // if
				// create inputstream pointing photo file
			try (InputStream is = new FileInputStream(photoLocation)) {

				// establish the connection
				try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"admin"); PreparedStatement ps = con.prepareStatement(Insert_artist_query);) {

					// set param value
					if (ps != null) {

						ps.setString(1, name);
						ps.setString(2, addrs);
						ps.setBinaryStream(3, is);
					} // if
					// execute the query
					int count = 0;
					if (ps != null)
						count = ps.executeUpdate();
					// process the result
					if (count == 0)
						System.out.println("record not inserted");
					else

						System.out.println("record inserted");
				} // try
			} // try
		} // try1
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem in record insertion");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main
}// class
