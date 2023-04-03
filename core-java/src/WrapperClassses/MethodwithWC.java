package WrapperClassses;

public class MethodwithWC {
                  static void m1(Integer io) {
                	    System.out.println("Integer-args: "+io);
                  }
	public static void main(String[] args) {
		                //   m1((byte)50);
		                   m1(40);
		            //       m1('a');
		              //     m1(70L);
		              //     m1(80.04);
		                   
		                   
//		                   m1(new Integer(50));
//		                   m1(new Byte((byte)50));
//		                   m1(new Short((short)50));
//		                   m1(new Character('a'));
//		                   m1(new Long(60L));
//		                   m1(new Double(80.44));
	}

}
