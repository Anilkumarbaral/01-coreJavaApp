package mockTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int i=0;
            outer:
            	while(true) {
            		i++;
            		inner:
            			for(int j=0;j<10;j++) {
            				 i+=j;
            				 if(j==3)
            					 continue inner;
            				 break outer;
            			}
            		continue outer;
            	}
            System.out.println(i);
		
		
	}

}
