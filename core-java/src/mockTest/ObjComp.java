package mockTest;

public class ObjComp {

	public static void main(String[] args) {
		    int result =0;
		    ObjComp oc=new ObjComp();
		    Object o=oc;
		    
		    if(o==oc)
		    	result =1;
		    if(o!=oc)
		    	result=result+10;
		    if(o.equals(oc))
		    	result =result+100;
		    if(oc.equals(o))
		    	result=result+1000;
		    System.out.println("result = "+result);
		    
		    
		    int a=10;
		    System.out.println(++a);
		    
//		    	int odd=1;
//		    	if(odd) {
//		    		System.out.println("odd");
//		    	}
		    
		     
		    int x=3;
		    int y=1;
		    
//		    if(x=y)  {  miss mathc can not convert int to boolean
//		    	 System.out.println();
//		    }
		    
	}

}
