import java.util.Arrays;

public class Conv_arrayToString {

	public static void main(String[] args) {
	            String []name= {"anil","kumar","baral"};
	            System.out.println(Arrays.toString(name));
	            
	            String s1=convert(name);
	            System.out.println(s1);

	}
    public static String convert(String []s) {
    	
    	            
		return Arrays.toString(s);
    	   
    }
}
