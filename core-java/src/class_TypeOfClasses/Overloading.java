package class_TypeOfClasses;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page_45_call cl=new Page_45_call();
		       
		        Object obj1=new Object();
		        Object obj2="hari";
		        Object obj3=new Integer(999);
		        
            cl.foo(obj1);
            cl.foo(obj2);
            cl.foo(obj3);
            
            System.out.println();
            cl.foo((String)obj2);
            cl.foo((Integer)obj3);
            System.out.println();
       //     cl.foo((String)obj1);
      //      cl.foo((Integer)obj1);
         //   cl.foo((String)obj3);
        //    cl.foo((Integer)obj2);
	}

}
