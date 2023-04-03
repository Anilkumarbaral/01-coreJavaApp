package WrapperClassses;

public class WrapperClassesComparision {

	public static void main(String[] args) {
		     int i1=10;
		     int i2=10;
		     System.out.println(i1==i2);
		   //  System.out.println(i1.equals(i2));
		     
		     Integer io1=new Integer(10);
		     Integer io2=new Integer(10);
		     System.out.println(io1==io2);
		     System.out.println(io1.equals(io2));
		     
		     //wrapper class type conversion
		     Double do1=new Double(10.0);
		 //    System.out.println(io1==do1);  incompatible
		     double d=10.0;
         System.out.println(i1==d);
         System.out.println();
         System.out.println(10==10.0);
         System.out.println(10.0==10);
         
         
         byte b11=40;
         byte b2=(byte) 128;
         int i='a';
         long L=50;
         Byte bo1=40;
    //     Byte bo2=128;
    //     Integer io='a';
    //     Long Lo=50;
        
	}

}
