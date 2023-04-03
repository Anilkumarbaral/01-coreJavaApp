package arraysClasses;

public class PrintThe_sumofarrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int []ai= {20,30,40,50,100,10};
		   //im taking a variable name sum and initialize 0 value 
		   int sum=0;
		   
		        for(int i=0;i<ai.length;i++) {
		        	 sum=sum+ai[i];
		        }
               System.out.println("total sum of element of array: "+sum);
	}

}
