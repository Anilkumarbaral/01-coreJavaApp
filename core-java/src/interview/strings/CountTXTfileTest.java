package interview.strings;

public class CountTXTfileTest {

	public static void main(String[] args) {
		
		String []docs= {"1.txt","2.txt","3.docs","4.txt","5.pdf","6.xml"};
		//so i just want to findout how many txt file is there?
		         int count=0;
		for(int i=0;i<docs.length;i++) {
			          if(docs[i].endsWith(".txt")) {
			        	  count ++;
			          }
		}
		System.out.println(count+" is time available");
		

	}

}
