package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class ExamplePage25 {

	public static void main(String[] args) throws Exception{
		    Scanner scn=new Scanner(System.in);
		    System.out.println("please enter start salary");
		     float startsalary=scn.nextFloat();
		     System.out.println("please enter end salary");
		     float endsalary=scn.nextFloat();
		//load the jdbc driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		//create stamenet
		Statement st=con.createStatement();
		// prepare sql querry  
		// SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE SAL>=1000 AND SAL<=3000
		String querry="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE SAL>="+startsalary+" AND SAL <="+endsalary;
		System.out.println(querry);
		//send and execute sql querry in db s/w
		ResultSet rs=st.executeQuery(querry);
		
		//prepare result query objs
		while(rs.next()!=false) {
			    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		}
		
		rs.close();
		st.close();
		con.close();
		scn.close();

	}

}
