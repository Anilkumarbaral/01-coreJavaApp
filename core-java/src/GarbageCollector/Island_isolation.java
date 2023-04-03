package GarbageCollector;

public class Island_isolation {

	Island_isolation garbage;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Island_isolation gc1=new Island_isolation();
		Island_isolation gc2=new Island_isolation();
		
		  gc1.garbage=gc2;
		  gc2.garbage=gc1;
		  gc1=null;
		  gc2=null;
		  ///this is called island isolation
	}

}
