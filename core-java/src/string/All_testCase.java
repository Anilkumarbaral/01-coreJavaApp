package string;

public class All_testCase {
   
	  
	public static void main(String[] args) {
	    try {
			System.out.println(A.s1==B.s2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String s = "JavaHariKrishna";
	   // String s1=s.charAt(2);
	  //  System.out.println(s.charAt(1));
		
		//equals operation comparing with object
		/*
		String s1 = "JavaHariKrishna";
		if(s.equals(s1)){
			System.out.println("true");
		}else{
			System.out.println("false");
			*/
		/*
		StringBuffer sb = new StringBuffer("welcometoNareshIT");
		sb.insert(7, ',');
		System.out.println(sb);
        */
		// using #concat method for adding character
		/*
		String s2="java Hari Krishna";
		String s3=s2.concat(" core Java");
	           System.out.println(s3);
		*/
		/*
		StringBuffer sb1= new StringBuffer("HK java");
		            sb1.append(" NIT");
		             System.out.println(sb1);
		 */
		//# thread safe and non thread safe in between stringBuffer and StringBuilder
		/*
		 StringBuffer sb2= new StringBuffer("");
		              sb2.append("Hari is ");
		              sb2.append("very good faculty");
		              System.out.println(sb2);
		              
		 StringBuilder sb3 = new StringBuilder("");  
		               sb3.append("Anil is a ");
		               sb3.append("Good Student");
		               System.out.println(sb3);
		*/
		
		
		}
	}


