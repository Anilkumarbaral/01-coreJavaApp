package WrapperClassses;

public class AutoUnboxing_DWC{

	public static void main(String[] args) {
	                        byte b=new Byte((byte)40);
	                        System.out.println(b);
	                        byte b1=Byte.valueOf((byte)50);
	                        System.out.println(b1);
	                        short s=Short.valueOf((short)220);
	                        int i=Integer.valueOf(1000);
	                        float f=new Float(10);
	                        double d=new Double(101);
	                        char ch=new Character('a');
	                        boolean bo=new Boolean(true);
	}

}
