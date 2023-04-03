package GarbageCollector;

public class Example {
	static Example e1;
	static Example e2;

	Example e3, e4;

	public static void main(String[] args) {
      Example e5,e6;
      int a;
      Example e7=new Example();
      
		System.out.println(e1);
		System.out.println(e2);
		
		//System.out.println(e3);
		//System.out.println(e4);
		
		System.out.println(e7.e3);
		System.out.println(e7.e4);
		
		//System.out.println(e5);
		//
		
		
	//	System.out.println(e6);
		
		//converting local null
		//referenced variable as 
		// object refernced variable
		
		e5=new Example();
		e6=null;
		System.out.println(e5);
		System.out.println(e6);
		//System.out.println(a);
		
		
	}

}
