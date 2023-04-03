package arraysClasses;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//now i am creating array with initialize
		int []arr=new int[] {2,4,2,6,5,3,4};
		//now i am creating same size array
		int []visitedArr=new int[arr.length];
		
		//now create one variable that with -1 value 
		int visited=-1;
		
		//now itterate
		for(int i=0;i<arr.length;i++) {
			  int count=1;//initial count one    //    0  1 2 3 4 5 6 7 8 9 10
			   for(int j=i+1;j<arr.length;j++) { //       2,3,4,5,2,3,4,5,2,6,8
				   if(arr[i]==arr[j]) {                    //       i  j
					   count++;
					   visitedArr[j]=visited;
				   }//if
			   }//inner for loop
			   if(visitedArr[i]!=visited) {
				   visitedArr[i]=count;//assining one time element count
			   }//if block
		}//outer for loop
		for(int i=0;i<visitedArr.length;i++) {
			if(visitedArr[i]!=visited) {
				System.out.println("frequency "+arr[i]+": "+visitedArr[i]);
			}
		}
		

	}

}
