package sqldb;
import java.util.Scanner;
import java.sql.*;
public class ExamplePage25_Test2{

	public static void main(String[] args) throws Exception{
	      Scanner scn= new Scanner(System.in);
	      System.out.println("pls enter your startpoint");
	      float startpoint=scn.nextFloat();
	      System.out.println("pls enter your endpoint");
	      float endpoint=scn.nextFloat();
	      
	      //load the jdbc class
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      //establish the connection
	      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
	      //create statement mean vehicle carryout data from java application to database visversa
	      Statement st=con.createStatement();
	      //prepare query
	      String query="SELECT SNO,SNAME,SADD,AVAG FROM STUDENT WHERE AVAG>="+startpoint+"AND AVAG<="+endpoint;
	      //send and execute sql query to db sw
	      ResultSet rs=st.executeQuery(query);
	      //prepare result process objs
	      while(rs.next()!=false) {
	    	       System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"    "+rs.getFloat(4));
	      }
	      rs.close();
	      st.close();
	      con.close();
	      scn.close();

	}

}
