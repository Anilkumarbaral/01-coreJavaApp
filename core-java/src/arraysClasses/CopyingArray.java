package arraysClasses;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create array
		char[]copyfrom= {'a','b','c','d','e','f','g','h','n'};
		//declaring copy array
		char[]copyto=new char[7];
		//using copy array method using system.arrycopy method
		System.arraycopy(copyfrom, 2, copyto, 3, 4);
		System.out.println(String.copyValueOf(copyto));
		

	}

}
