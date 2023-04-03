package string;

public class StringJoiner {

	public StringJoiner(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//creating first StringJoiner class object and passing  delimate argument , as separator
		
		
		
		           String joiner=String.join("-",  "anil","kumar","baral","is","extraodinry","progrmmer");
		           System.out.println(joiner);
		           
		           String join2=String.join("-", "10","05","1995");
		           System.out.println(join2);
		           
		           String join3=String.join(":", "10","45");
		
		
	}

}
