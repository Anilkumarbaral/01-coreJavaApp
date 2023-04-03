package string;

public class RemoveSpaces {

	public static void main(String[] args) {
		          String s="a    b    c  d    e   f   g    h i     j k l";
		          //trim method only remove first and last space
		          System.out.println(s);
		          System.out.println();
		          //im using replce regex method
		          
		           String st1=s.replaceAll("\\s", "");
		           System.out.println(st1);

	}

}
