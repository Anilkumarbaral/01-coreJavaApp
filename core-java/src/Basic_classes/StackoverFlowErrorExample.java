package Basic_classes;

public class StackoverFlowErrorExample {
	static int x = 0;

	public static int printnumber(int x) {

		int i = 0+ x;

		System.out.println(i);
		if (i == 10) {
			return i;
		}
		return i + printnumber(i + 2);
	}
	public static void main(String[] args) {

		printnumber(x);
		
		try {}
		catch(Exception e){}

	}

}
