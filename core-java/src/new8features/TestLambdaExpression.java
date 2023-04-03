package new8features;

public class TestLambdaExpression {

	public static void main(String[] args) {
	   
		I1 i1=()->{System.out.println("LE");};   i1.m1();
		I2 i2=(int x)->{System.out.println("LE2 x"+x);};    i2.m1(10);
		I3 i3=(x,s)->{System.out.println("LE3 x:"+x);};       i3.m1(11, "anil kumar");
		I2 i4=x->System.out.println(x);                                i4.m1(20);
		I3 i5=(a,b)-> System.out.println(a+" "+b);    i5.m1(12, "never give up");

		
		
	}

}
