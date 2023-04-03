package Basic_classes;

public class TestHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleHashcode anil = new ExampleHashcode(100, "Anil");
		ExampleHashcode sunil = new ExampleHashcode(101, "Sunil");
		// print the both object hashcode
		int anilhashcodevalue = anil.hashCode();
		System.out.println(anilhashcodevalue);
		int sunilhashcodvalue = sunil.hashCode();
		System.out.println(sunilhashcodvalue);
		System.out.println();
		
		String st1="ab";
		String st2="ca";
		System.out.println(st1.hashCode()+"  "+st2.hashCode());

	}

}
