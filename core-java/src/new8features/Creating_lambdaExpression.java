package new8features;

public class Creating_lambdaExpression{

	public static void main(String[] args) {
		LmInterface i= x->System.out.println(x);  i.m1(10);
		LmInterface lm= (int p)->{System.out.println(p);}; lm.m1(11);
		//single statement parameter can have parathisis or not its optional
		//single statement is optional to have body or not
		System.out.println(lm);
		

	}

}
