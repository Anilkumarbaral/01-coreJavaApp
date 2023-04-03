package PracticeCoding;

public class String_reverseWord {
//there are having 4 ways to reverse the string
	//1. using toCharArray()
	//2.using charAt();
	//3.using StringBuffer method
	// 4. using StringBuilder
	
	public static void main(String[] args) {
	   String s ="welcome to java world";
	      //using first approach without using reverse method
	   // Approach 1
	              char[]charr=  s.toCharArray();//coverting string to array
	             for(int i=charr.length-1;i>=0;i--) {
	            	       // System.out.println(s.toCharArray());
	            	 System.out.print(charr[i]);
	             }
	             //Approach 2
	             System.out.println();
	             for(int i=s.length()-1;i>=0;i--) {
	            	  System.out.print(s.charAt(i));
	             }
	             System.out.println();
	             //Approach 3
	             StringBuffer sb=new StringBuffer(s);
	                System.out.println(sb.reverse());
	              //Approach 4
	                StringBuilder sbb=new StringBuilder(s);
	             

	}

}
