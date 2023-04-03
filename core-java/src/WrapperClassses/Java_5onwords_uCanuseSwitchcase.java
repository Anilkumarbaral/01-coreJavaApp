package WrapperClassses;

public class Java_5onwords_uCanuseSwitchcase {

	public static void main(String[] args) {
		m1(10);
		m1(1);
		m1(20);

	}
	public static void m1(Integer io) {
		  switch(io) {
		  case 10:
			    System.out.println("10");
			    break;
		  case 20:
			  System.out.println("20");
			  break;
			  default:
				  System.out.println("other");
		  }
	}

}
