package string;

public class TestImutable_mutable {

	public static void main(String[] args) {
		
              String s1="hk";
              System.out.println(s1);
              s1.concat("nit");
              System.out.println(s1);
              System.out.println();
              
              
              StringBuffer sb1=new StringBuffer("HK");
              System.out.println(sb1);
              sb1.append("NIT");
              System.out.println(sb1);
	}

}
