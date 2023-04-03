package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ExamplePage24 {

	public static void main(String[] args) throws Exception {
              // load the jdbc driver class
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  //establish connection
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");//making road from java application to db sw
		  //create statment (like vehicle transporting from java app to dabata and viversa)
		   Statement st=con.createStatement();
		   //send and execute sql result from java app to db sw
		   ResultSet rs=st.executeQuery("SELECT * FROM MASTER");
		   
		   //process Result set objs
		   while(rs.next()!=false) {
			   System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4));
		   }
		   rs.close();
		   st.close();
		   con.close();
	}

}
