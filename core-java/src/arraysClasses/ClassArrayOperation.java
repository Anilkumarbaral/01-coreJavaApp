package arraysClasses;
//develop a program to create int[] object with 5 values copy elements of this array into 2nd array
//array copy program display both array values
public class ClassArrayOperation {
//               int[]copyarray(int[]ai){
//            	   int[]ai2=new int[ai.length];
//            	   for(int i=0;i<ai.length;i++) {
//            		  // ai2[i]=ai[i];
//            		   ai2=ai;
//            	   }//for
            	//   return ai2;
         //      }
               int[] display(int[]ai) {
            	   for(int i=0;i<ai.length;i++) {
            		   System.out.println(""+ai[i]);
            		   
            	   }
				return ai;
               }
}
