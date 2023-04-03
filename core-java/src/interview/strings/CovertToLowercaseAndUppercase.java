package interview.strings;

public class CovertToLowercaseAndUppercase {

	public static void main(String[] args) {
		   String letter="The core java The core java";
		   // i want to half of beginning is small letter and rest half is capital letter
		   int mid=letter.length() /2;
		   
		   String lowercase="";
		   String upercase="";
		   
		   for(int i=0;i<letter.length();i++) {
			        if(i<mid) {
			        	      lowercase=lowercase+Character.toLowerCase(letter.charAt(i));
			        }
			        else {
			        	   upercase=upercase+Character.toUpperCase(letter.charAt(i));
			        }
		   }//for
		   System.out.println(lowercase);
		   System.out.println(upercase);
				   

	}

}
