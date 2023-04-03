package daily.coding;

public class AddBinaryNumber_20_03 {

	public  static String  returntwobinary(String x,String y) {
		
		int n1=Integer.parseInt(x,2);
		int n2=Integer.parseInt(y,2);
		
		int sum=n1+n2;
		
		String bstringsum=Integer.toBinaryString(sum);
		
	return bstringsum;
	}
	
	
	
	public static void main(String[] args) {
	
        String x="100";
        String y="010";
       System.out.println(returntwobinary(x, y)); ;

	}
	

}
