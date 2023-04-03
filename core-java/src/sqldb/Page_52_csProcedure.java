package sqldb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/*
 create or replace procedure p_get_emp_details_by_id(
no in number,name out varchar2,desg out varchar2,salary out varchar2
)as begin

    select ename,job,sal into name,desg,salary from emp  where eno=no;
end;
 */
public class Page_52_csProcedure {
                  private static final String call_procedure="{CALL P_GET_EMP_DETAILS_BY_ID(?,?,?,?)}";
	public static void main(String[] args) {
		//read inputs
		  try(Scanner scn=new Scanner(System.in);) {
			    System.out.println("pls enter column number");
			    int enumber=scn.nextInt();
			    //establish the connetion
			    try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			    		//create callableStatement obje having call to plsql query as precompiled
			    		CallableStatement cs=con.prepareCall(call_procedure);
			    		){
			    	    //registred out parameter with jdbc datatype
			    	  if(cs!=null) {
			    		    cs.registerOutParameter(2, Types.VARCHAR);
			    		    cs.registerOutParameter(3, Types.VARCHAR);
			    		    cs.registerOutParameter(4, Types.FLOAT);
			    	  }
			    	  //set the in parameter value
			    	  if(cs!=null)
			    		  cs.setInt(1, enumber);
			    	  //execute /call the plsql querey
			       if (cs!=null)
			    	   cs.execute();
			       //gather process result
			       if(cs!=null) {
			    	     String name=cs.getString(2);
			    	     String job=cs.getString(3);
			    	     float sala=cs.getFloat(4);
			    	     System.out.println("name: "+name+" job: "+job+"salary"+sala);
			       }
			    	 
			    	
			    }//try2
		  }//try1
		  catch(SQLException se) {
			//  se.printStackTrace();
			  System.out.println("record not found");
		  }catch(Exception e) {
			  e.printStackTrace();
		  }

	}

}

