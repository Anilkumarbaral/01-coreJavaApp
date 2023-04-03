package arraysClasses;
//create 3da and initialize and read values from both syntaxes 
public class Create3D_initialize_readValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] tda=new int[2][3][2];
		tda[0][0][0]=4;
		tda[0][0][1]=5;
		tda[0][1][0]=6;
		tda[0][1][1]=7;
		tda[0][2][0]=8;
		tda[0][2][1]=9;
		
		tda[1][0][0]=9;
		tda[1][0][1]=8;
		tda[1][1][0]=7;
		tda[1][1][1]=6;
		tda[1][2][0]=5;
		tda[1][2][1]=4;
		
		//print the object values
		for(int i=0;i<tda.length;i++) {
			  for(int j=0;j<tda[i].length;j++) {
				    for(int k=0;k<tda[i][j].length;k++) {
				    	   System.out.println(tda[i][j][k]);
				    }
			  }
		}
		

	}

}
