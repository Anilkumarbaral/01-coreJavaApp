package class_TypeOfClasses;

public class MOL4 {
	static void m1(byte b) {
		  System.out.println("byte arg");
	}
	void m2(Example e) {
		 System.out.println("example");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// m1(50);  need to be downcasting
		m1((byte)50);
		byte b=50;
		m1(b);
		MOL4 m=new MOL4();
		m.m2(new Example());
		m.m2(new Sample());
	//	m.m2(new Test());
	//	m.m2("abc");
		m.m2(null);
		
		

	}

}
