package new8features;

import java.util.ArrayList;
import java.util.List;
//In the following example, we are using filter() method. 
//Here, you can see code is optimized and very concise.
public class Stream_filtering_ieterating {

	public static void main(String[] args) {
	      List<Product>productlist=new ArrayList<>();
	          productlist.add(new Product(1,"Dell",50000));
	          productlist.add(new Product(2,"HP",40000));
	          productlist.add(new Product(3,"lenovo",2000));
	          productlist.add(new Product(4,"apple",50000));
	          
	          //using filtering to find same price 
	          productlist.stream().filter((product->product.price==50000)).
	          forEach(product->System.out.println(product.name));

	}

}
