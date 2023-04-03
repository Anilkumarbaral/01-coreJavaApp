package arraysClasses;

public class CopyElementOneArrayToOtherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create array with initialize
		int[]arr1=new int[]{10,20,30};
		//create another array where size is same size
		
		int []arr2=new int[arr1.length]; 
		//copy element 
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
	//	display the value
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
