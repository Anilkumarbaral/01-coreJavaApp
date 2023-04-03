package string;

public class String_InternMethod {

	public static void main(String[] args) {
	  String s1=new String("Anil kumar baral").intern();//firs stored scpa area
	  String s2="Anil kumar baral";//string pooling here from scpa
	  
	  String s3=new String("Anil kumar baral");
	  String s4=new String("Anil kumar baral").intern();
	  System.out.println(s1==s2);//resulst is false becz of diffent refernce
	  
	  System.out.println(s1==s3);
	  
	  System.out.println(s1==s4);
	 

	}

}
