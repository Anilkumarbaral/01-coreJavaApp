
public class con_String_ToStringBuilder {

	public static void main(String[] args) {
		String s="anil kumar baral";
		//to convert string to sbuilder
		String []s1= {"anil","kuma","baral"};
		//converting string array to stringbuilder
		
		       StringBuilder sb1=new StringBuilder();
		       sb1.append(s1[0]);
		       sb1.append(s1[1]);
		       sb1.append(s1[2]);
		      System.out.println(sb1);
		
		 StringBuilder sb=new StringBuilder(s);
		 System.out.println(sb);
		   

	}

}
