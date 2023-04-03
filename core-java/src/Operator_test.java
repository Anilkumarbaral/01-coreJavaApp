
public class Operator_test {

	public static void main(String[] args) {
		       byte b2=10;
	      // byte b3=b2+20;// mismatch from int to byte
		       byte b4=(byte) (b2+20);
		       final byte b5=10;
		       byte bb=b5+20;
		       short s=30;
//         short s2=s+20;
	//      final short s3=s+30;
		         final short s4=39;	         
		      short s5=s4+30;
		       byte b33=(byte) 10l;
		       byte b44=(byte)b33;
		       long ln3=108L;
		       byte b1q=(byte)ln3;
		       byte b23=(int)33f;
		       
		       
		       char ch1='a';
		       char ch2='b';
	//      char ch3=(char)ch1+ch2;//in that cases int can not convert mismatch
		      char ch4=(char)(ch1+ch2);
		       int p=10;
		       int q=20;
		       
		      
		      System.out.println(10+" "+20);
		      System.out.println(20+30+" ");
		      System.out.println(""+20+10);
		      System.out.println();
		      System.out.println("p+q"+p+q);//p+q1020
		      System.out.println("p+q"+(p+q));
	//	      System.out.println("p-q"+p-q);
		      System.out.println("p-q"+(p-q));
		      System.out.println("p*q"+p*q);//because first precendnce first priority prefix and profix ternary?:
		      //then multicative */%
		      System.out.println();
		      System.out.println(10.0f/0);
		      System.out.println(-10.4f/0);
		      System.out.println(0.0/0);
		      System.out.println(22/7*10*10);
		       System.out.println(22.0/7*10*10);
		       System.out.println(22.0f/7*10*10);
		       System.out.println(2/1);
		       System.out.println(1/2);
		       System.out.println(0.0/2);
		       System.out.println(2.0/1);
		       
	}

}
