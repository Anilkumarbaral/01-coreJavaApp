package string;

public class CompareStringWith_equalsMethod_IgnoreCase {

	public static void main(String[] args) {
		  
		          //creating two string objects
		
		  String s1="sachin";
		  String s2="sachin";
		  String s3="SACHIN";
		  
		  System.out.println(s1.equals(s2));//true
		  System.out.println(s1.equalsIgnoreCase(s3));//true
	}

}
