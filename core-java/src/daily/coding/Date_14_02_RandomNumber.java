package daily.coding;

public class Date_14_02_RandomNumber {

	public static void main(String[] args) {
		//generating random number
		//1st approach using Math.Random
		
		System.out.println("random number"+Math.random());
		System.out.println("random number "+Math.random());
		
		System.out.println();
		//second approach
		int min=200;
		int max=400;
		System.out.println();
		System.out.println();
		
		System.out.println("random double type of value in between 200 to 400");
		double d=Math.random()*((max-min)+1)+min;
		System.out.println(d);
     System.out.println("random int type of value in between 200 to 400");
      int i=(int)(Math.random()*((max-min)+1)+min);
      System.out.println(i);
	}

}
