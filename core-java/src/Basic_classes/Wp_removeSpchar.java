package Basic_classes;

public class Wp_removeSpchar {

	public static void main(String[] args) {
		            String s="anil kumar*@is! good *Student";
		            //i want to remove special char
		           
		            //using regex
		           String ms= s.replaceAll("[^a-zA-Z0-9]", "");
		           System.out.println("before modifed: "+s);
		           System.out.println("affter modfied: "+ms);

	}

}
