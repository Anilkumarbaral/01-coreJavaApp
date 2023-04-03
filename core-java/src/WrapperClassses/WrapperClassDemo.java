package WrapperClassses;

public class WrapperClassDemo {

	public static void main(String[] args) {
		//primitive Data to Wrapper class data
		     int i=10;
		    Integer io=new Integer(20);
		    Integer io2=Integer.valueOf(i);
		    
		    System.out.println(i);
		    System.out.println(io);
		    System.out.println(io2);
		    
		    System.out.println();
		    Byte b1=new Byte((byte) 50); 
		    Character ch1=new Character('a');
		   // Character ch2=new Character(97);
		    Character ch2=new Character((char)97);
		    Boolean bo=new Boolean(true);
		    Float f1=new Float(100);
		    System.out.println(f1);
		    Float f2 =new Float(100.32f);
		    Float f3=new Float(100.99);
		    Float f4=new Float(100.99d);
		    Double d1=new Double(56);
		  //  Double d1=new Double(56.99f);
		      Double d=new Double(56.99f);
		    Double d2=new Double(98);
		    Double d3=new Double('a');
		    System.out.println();
		    
		    
		    //conversion Wrapper class to primitive data
		    Integer io3=new Integer(199);
		    System.out.println(io3);
		    int in=io3.intValue();		
		    System.out.println(in);
		    byte b=io3.byteValue();
		    System.out.println(b);
		    short s=io3.shortValue();
		    System.out.println(s);
		    float f=io3.floatValue();
		    System.out.println(f);
		    double db=io3.doubleValue();
		   Double dbd=Double.valueOf(100);
		   double db2=dbd.doubleValue();
		   System.out.println(dbd);
		   System.out.println(db2);
		   System.out.println();
		    
		   
		   System.out.println();
		//   char ch11=io3.charValue();
		//   char ch12=io3.intValue();
		   char ch13=(char)io3.intValue();
		   
	//	   boolean bo1=io3.booleanValue();
	//	   boolean bo12=(boolean)io3.intValue();
		   
		   //pso==> WCO conversion
		   Integer io11=new Integer("10");
		   Integer io12= Integer.valueOf("1");
		   
		   Byte b11=new Byte("11");
		   Byte b12=Byte.valueOf("12");
		//   Byte b13=Byte.valueOf("128");  RE java.lang.NumberFormatException.Value out or range
		   
		   
	//	   Integer io13=Integer.valueOf("a");//RE
		//   Integer io14=Integer.valueOf("10.0");//RE
	//	   Integer io15=Integer.valueOf("5L");//RE
		   
		   
		   
		  //  System.out.println(io14);
		   
		   Float fo5=Float.valueOf("5");
		   Float fo6=Float.valueOf("5.4");
		   Float foo7=Float.valueOf("454.34F");
		   
		   
		   //boolean string object=> Boolean wco
		   Boolean bo1=new Boolean("false");
		   System.out.println(bo1);
		   Boolean bo2=new Boolean("true");
		   System.out.println(bo2);
		   
		   Boolean bo3=Boolean.valueOf("false");System.out.println(bo3);
		   Boolean bo4=Boolean.valueOf("true");System.out.println(bo4);
		   System.out.println();
		   Boolean bo5=Boolean.valueOf("True");System.out.println(bo5);//true
		   Boolean bo6=Boolean.valueOf("TRue");System.out.println(bo6);//true
		   System.out.println();
		   Boolean bo7=Boolean.valueOf(false);System.out.println(bo7);
		   Boolean bo8=Boolean.valueOf("FALSE");System.out.println(bo8);
		   System.out.println();
		   Boolean bo9=Boolean.valueOf("TURE");System.out.println(bo9);
		   Boolean bo10=Boolean.valueOf("");System.out.println(bo10);//false
		   
		   Boolean bo11=Boolean.valueOf(null);System.out.println(bo11);//false
		   
		   System.out.println();
	//	   Integer io31=Integer.valueOf(null);System.out.println(io31);// RE
		   
		   Float ff1=Float.valueOf(100000);System.out.println(ff1);
				   Float ff2=Float.parseFloat("10000");System.out.println(ff2);
				   float ff3=Float.valueOf((float) 99.99);System.out.println(ff3);
				   float ff4=Float.parseFloat("100.100");System.out.println(ff4);
				   System.out.println();
				   boolean bo111=Boolean.parseBoolean("TRUE");
				   boolean bo22=Boolean.parseBoolean("FALSE");
				   boolean bo23=Boolean.parseBoolean("TURe");System.out.println(bo23);
				   
				   
				   // 5. wco=>String object conversion
				   Integer aio=new Integer(222);
		   Integer aio2=Integer.valueOf(2232);
		   System.out.println(aio);
		   System.out.println(aio.toString());
		   System.out.println(aio2.toString());
		   
		   //6.pdt=>NSO
		   String s1=Integer.toString(10);System.out.println(s1);
		   String s2=Byte.toString((byte)20);
		    
		    String s3=Character.toString('a');System.out.println(s3);
		    
		    String s4=Float.toString(10);
		    String s5=Float.toString(39L);System.out.println(s5);
		    
		    String s6=Boolean.toString(false);
		    String s7=Boolean.toString(true);
	//	    String s8=Boolean.toString(TRUE);
		   
		   
	}

}
