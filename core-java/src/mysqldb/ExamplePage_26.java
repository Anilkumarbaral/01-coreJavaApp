package mysqldb;
import java.sql.*;
public class ExamplePage_26 {

	public static void main(String[] args) throws Exception{
		       
		   //load mysql class
		     Class.forName("com.mysql.cj.jdbc.Driver");
		     //establish the connection
		     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ANILKUMAR001","root","root");
		     //create statement like vehicle
		     Statement st=con.createStatement();
		     //send and execute sql data and retunr result from db sw
		     String query="SELECT * FROM STUDENT";
		     System.out.println(query);
		     ResultSet rs=st.executeQuery(query);
		     //prepare resultset process obj
		     while(rs.next()!=false) {
		    	     System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getFloat(4));
		     }
		     rs.close();
		     st.close();
		     con.close();
	 
	}

}
