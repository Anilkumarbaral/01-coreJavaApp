package WrapperClassses;

public class MethodWithPDT {
              static void m1(int a) {
            	         System.out.println("int-arg: "+a);
              }
	public static void main(String[] args) {
		          m1(10);
		          m1((byte)50);
		          m1('a');
		    //      m1(70L);
		   //       m1(( 80.54);
		          
		          m1(new Byte((byte)40));
		          m1(new Character((char)50));
		          m1(new Integer((int)60));
		    //      m1(new Long(70L));
		     //     m1(new Double(50.33));

	}

}
