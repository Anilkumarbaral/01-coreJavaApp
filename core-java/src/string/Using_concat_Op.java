package string;

public class Using_concat_Op {

	public static void main(String[] args) {
		String s1="abc";
		String s2=s1.concat(" def");
		System.out.println(s1);
		System.out.println(s2);
		String s3=s1.concat("");
		System.out.println(s1.equals(s3));

	}

}
