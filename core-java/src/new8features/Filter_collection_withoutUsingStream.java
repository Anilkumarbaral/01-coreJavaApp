package new8features;

import java.util.ArrayList;
import java.util.List;

public class Filter_collection_withoutUsingStream {
//In the following example, we are filtering data without using stream. 
	//This approach we are used before the stream package was released
	public static void main(String[] args) {
	      List<Product>productlist=new ArrayList<Product>();
	       productlist.add(new Product(100,"HP",2000f));
	       productlist.add(new Product(101,"DELL",4000f));
	       productlist.add(new Product(102,"Lenovo",3000f));
	       productlist.add(new Product(103,"apple",5000));
	       
	       //now i m gonna to do filtering without using stream
	       List<Float>Pricelist=new ArrayList<>();
	       
	       for(Product prod:productlist) {
	    	            //using filtering
	    	       if(prod.price<4000) {
	    	    	       Pricelist.add(prod.price);
	    	       }//if
	       }//for
	       System.out.println(Pricelist);
	}

}
