package interview.strings;

import java.util.Arrays;

public class CovertArrayto_strig {

	public static void main(String[] args) {
	            String []arryname= {"anil","kumar","baral","?"};
	            System.out.println(arryname);
	           
	            
	            //type one
	            String stringname=convertarraytostring(arryname);
	            System.out.println((stringname));
	            System.out.println();
	            //using stringBuilder.append()method
	            String stringname2=ConvertArraytoString(arryname);
	            System.out.println(stringname2);
	            System.out.println();
	            //type 3 using string join method
	            String stringname3=ConvertArraytoStringbyusingjoin(arryname);
	            System.out.println(stringname3);

	}//using type one method Arrays.toString
 public static String convertarraytostring(String[] arryname) {
	        return Arrays.toString(arryname);
	           
 }
 //using stringBuilder
        public static String ConvertArraytoString(String[]arryname) {
        	             StringBuilder stringbuilder=new StringBuilder();
        	             for(int i=0;i<arryname.length;i++) {
        	            	        stringbuilder.append(arryname[i]);
        	             }
        	   return stringbuilder.toString();
        }
        //string join method
        public static String ConvertArraytoStringbyusingjoin(String[]arrayname) {
        	           String stringname=String.join(" " , arrayname);
        	           return stringname;
        }

}
