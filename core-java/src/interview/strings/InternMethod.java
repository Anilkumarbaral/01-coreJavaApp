package interview.strings;

public class InternMethod {

	public static void main(String[] args) {
	            String s1=new String("anil kumar baral").intern();
	            String s2=new String("anil kumar baral").intern();
	            System.out.println(s1==s2);//comapring with reference
	            System.out.println();
	            System.out.println(s1.equals(s2));//comparing with data
	}

}
