package string;

public class Program4 {

	private static int count;

	public static void main(String[] args) {
		String[]filesArray= {"1.txt","2.doc","3.txt","4.pdf","5.xls","6.txt"
				};
		 for(int i=0;i<filesArray.length;i++) {
			 if(filesArray[i].endsWith(".txt")) {
				count ++;
			 }
			
		 }
		 System.out.println("total text files is: "+count); 
	}

}
