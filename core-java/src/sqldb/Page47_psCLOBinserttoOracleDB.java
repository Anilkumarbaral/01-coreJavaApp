/*
 * //package sqldb; // //import java.io.FileReader; //import java.io.Reader;
 * //import java.sql.Connection; //import java.sql.DriverManager; //import
 * java.sql.PreparedStatement; //import java.util.Scanner; // //import
 * com.mysql.cj.protocol.FullReadInputStream; // //public class
 * Page47_psCLOBinserttoOracleDB { // private static final String
 * Insert_jobseeker_query="INSERT INTO JOBSEEKER_INFO VALUES(JSID_SEQ1.NEXTVAL,?,?,?)"
 * ; // public static void main(String[] args) { // // try {//read inputs //
 * Scanner scn=new Scanner(System.in); // if(scn!=null) { // String
 * name=null,address=null,resumelocation=null; //
 * System.out.println("pls enter name: "); // name=scn.next(); //
 * System.out.println("pls enter address: "); // address=scn.next(); //
 * System.out.println("pls enter photo loction: "); //
 ///* resumelocation=scn.next(); // }{} // //create inputstream for pointinng to
 /* photolocation //// try(Reader read=new FileReader(resumelocation){//try2 ////
 * //establish the conne tion //// Connection
 * con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
 * "system","admin") ; //// PreparedStatement
 * ps=con.prepareStatement(Insert_jobseeker_query); //// } //// } // // // // //
 */