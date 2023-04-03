package Basic_classes;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte b1 =10;
          int i1=b1;
          
//          byte b2=i1;
          byte b3=(byte)i1;
          System.out.println(b3);
          int i6=356;
          byte b6=(byte)i6;// in casting if source variable has value greater than destination type range?
          System.out.println(b6);
          int i2=i1;
          
   //       int i= true;
  //        int i3=(int)true;
          
           int i4=254;
    //       byte b4=i4;
           int i5=97;
         //  char ch= i5;  // here is need to add type cast
           char ch=(char) i5;
           long  L= 10;
           long L1=10L;
           float f=L1;
           float f1=L;// because of the float is higher than long by size
           float f2=10;
    //       long L2=f2;  here is  to need type cast
           long L3=(long)f2;
           
	}

}
