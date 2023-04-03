package arraysClasses;

public class MultiDimensionalArray_Creation_storing_reading_Modifying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]mia=new int[3][2];
		//initialization
		mia[0][0]=5;
		mia[0][1]=6;
		mia[1][0]=7;
		mia[1][1]=8;
		mia[2][0]=9;
		mia[2][1]=10;
		System.out.println(mia[0][0]);
		System.out.println(mia[0][1]);
		System.out.println(mia[1][0]);
		//System.out.println(mia[1][2]);
		//modification
		//mia[0][0]=33;
		System.out.println(mia[0][0]);
		//
		for(int i=0;i<mia.length;i++) {
			   for(int j =0;j<mia[i].length;j++) {
				   System.out.println(mia[i][j]+" ");
			   }
		}

	}

}
