package arraysClasses;

public class ArrayobjectArgumentReturnType {
	static int[]addsub(int[]ia){
		int add=0;
		for(int i=0;i<ia.length;i++) {
			add +=ia[i];
			
		}
		int sub=0;
		for(int i=0;i<ia.length;i++) {
			sub-=ia[i];
		}
		int[]res=new int[2];
		  res[0]=add;
		  res[1]=sub;
		  return res;
		  //return new int[] {add,sub};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[]ia= {2,3,4};
		    int[]resArray=addsub(ia);
		    
		    for(int i=0;i<ia.length-1;i++) {
		    	System.out.println(ia[0]+"+");
		    }
		    System.out.println(ia[ia.length-1]+"="+resArray[0]);

	}
	

}
