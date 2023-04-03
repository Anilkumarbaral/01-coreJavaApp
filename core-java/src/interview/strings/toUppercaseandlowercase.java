package interview.strings;

public class toUppercaseandlowercase {

	public static void main(String[] args) {
		    String s1="sanahantuad sanahantuad";
		    
		   int mid=s1.length()/2;
		   
		   for(int i=0;i<s1.length();i++) {
			             if(i<mid) {
			            	    System.out.print(s1.toUpperCase().charAt(i));
			             }
			             else {
			            	 System.out.print(s1.toLowerCase().charAt(i));
			             }
		   }

	}

}
