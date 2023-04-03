package arraysClasses;

public class ArrayTestPage_211 {
           static void m1(ArrayExample[]ai) {
        	     ai[1]=null;
        	     ai=null;
        	     
           }
	public static void main(String[] args) {
	     ArrayExample[]e=new ArrayExample[5];
	          e[0]=new ArrayExample();
	          e[1]=new ArrayExample();
	          e[2]=new ArrayExample();
	          ArrayExample e1=new ArrayExample();
	             e[3]=e1;
	             
	             e1=null;
	             m1(e);
	             e=null;
	                                      

	}

}
