package daily.coding;

public class Date_27_RemovingSpecialcharFromstring {

	public static void main(String[] args) {
	
		     //removing special character from string
		
		          String spchar="a2n@#i#l^Ku)8m!a$r";
		          //and remove those special character from string
		          
		              String st=spchar.replaceAll("[^a-zA-Z]", "");
		              System.out.println(st);
	}

}
