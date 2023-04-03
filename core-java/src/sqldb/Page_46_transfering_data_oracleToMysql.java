package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Page_46_transfering_data_oracleToMysql {
                  private static final String oracle_query="SELECT SNO,SNAME,SADD,AVAG FROM STUDENT";
                  private static final String mysql_query="INSERT INTO STUDENT VALUES(?,?,?,?)";
	public static void main(String[] args) {
		
		
		    Connection oraclecon=null;
		    Connection mysqlcon=null;
		    Statement st  =null;
		    PreparedStatement ps=null;
		    ResultSet rs=null;
		    
		    //register class with jdbc
		    try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName("com.mysql.cj.jdbc.Driver");
				//establish connection
				oraclecon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
				mysqlcon=DriverManager.getConnection("jdbc:mysql:///anildb","root","root");
				
				//create statement object
				if(oraclecon!=null)
					st=oraclecon.createStatement();
				if(mysqlcon!=null)
					ps=mysqlcon.prepareStatement(mysql_query);
				//send and execute select query
				if(st!=null)
					rs=st.executeQuery(oracle_query);
				//gather result from rs object and insert into mysql data
				if(rs!=null&& ps!=null) {
					while(rs.next()) {
						  //gather record from rs
						  int sno=rs.getInt(1);
						  String sname=rs.getString(2);
						  String sadd=rs.getString(3);
						  float svg=rs.getFloat(4);
						  //set param value to as mysql
						  ps.setInt(1, sno);
						  ps.setString(2, sname);
						  ps.setString(3, sadd);
						  ps.setFloat(4, svg);
						  //then executeupdate
						  ps.executeUpdate();
						
					}//while
					System.out.println("record copied from oracle db to mysql db");
				}//if
					

		    }//try
		    catch(SQLException se) {
		    	se.printStackTrace();
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }finally {
		    	try {
		    		if(rs!=null) {
		    			  rs.close();
		    		}
		    	}catch(SQLException se) {
		    		se.printStackTrace();
		    	}
		    	try {
		    		if(ps!=null) {
		    			 ps.close();
		    		}
		    	}catch(SQLException se) {
		    		se.printStackTrace();
		    	}
		    	try {
		    		if(st!=null) {
		    			  st.close();
		    		}
		    	}catch(SQLException se) {
		    		se.printStackTrace();
		    	}	try {
		    		if(oraclecon!=null) {
		    			  oraclecon.close();
		    		}
		    	}catch(SQLException se) {
		    		se.printStackTrace();
		    	}	try {
		    		if(mysqlcon!=null) {
		    			  mysqlcon.close();
		    		}
		    	}catch(SQLException se) {
		    		se.printStackTrace();
		    	}
		    }
	}

}
