package arraysClasses;

public class returningArray_fromMthod {
        //creating a method  which is returning array
	static int[]get(){
		return new int[] {2,3,7,8,9};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //calling a method which is returning array
		  int[]arr=get();
		  //printing the returning array values
		  for(int i=0;i<arr.length;i++) {
			  System.out.println(arr[i]);
		  }
	}

}
