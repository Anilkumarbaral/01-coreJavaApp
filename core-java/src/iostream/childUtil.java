package iostream;
import mockTest.parentUtil;
public class childUtil extends parentUtil{

	public static void main(String[] args) {
		
    childUtil c= new childUtil();
     c.callstuff();
	}

	 void callstuff() {
	//	System.out.println("this "+c.dostuff());// need to be create local variable
		parentUtil p=new parentUtil();
		// System.out.println("parent "+p.dostuff());  visibility problem means super class is method is protected
	}

}
