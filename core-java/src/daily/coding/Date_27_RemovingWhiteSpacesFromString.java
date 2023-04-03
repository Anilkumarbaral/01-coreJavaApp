package daily.coding;

public class Date_27_RemovingWhiteSpacesFromString {

	public static void main(String[] args) {
		//declaring string
		String stringwithspace="a  n i   l   k u  m  a r";
		//now i want to remove white spaces from string
		
		  String st=stringwithspace.replaceAll("\\s", "");System.out.println(st);
		  System.out.println();
		
		String rspaces=stringwithspace.replaceAll("[^a-zA-Z0-9]", "");
      System.out.println(rspaces);
	}

}
