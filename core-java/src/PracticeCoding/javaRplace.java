package PracticeCoding;

public class javaRplace {

	public static void main(String[] args) {
		  //java words replace with====>kava,keva,keka
		
		     String names="java";
		       
		     String name1=names.replace("j", "k");System.out.println(name1);
		     String name2=name1.replaceFirst("a", "e");System.out.println(name2);
		     String name3=name2.replace("v", "k");System.out.println(name3);

	}

}
