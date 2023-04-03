package new8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringCollection_usingStreamAPI {

	public static void main(String[] args) {
		  List<Product>productlist=new ArrayList<Product>();
	       productlist.add(new Product(100,"HP",2000f));
	       productlist.add(new Product(101,"DELL",4000f));
	       productlist.add(new Product(102,"Lenovo",3000f));
	       productlist.add(new Product(103,"apple",5000));
	       
	        List<Float>productlistprice=productlist.stream().filter((p)->p.price>2000)//filtering price
	        		.map(p->p.price)//fetching data
	        		.sorted()
	        		.collect(Collectors.toList());//collecting as list
	        System.out.println(productlistprice);
	}

}
