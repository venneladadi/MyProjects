package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductList
{
	 int pid;
     String pname;
     float price;

 	public ProductList(int pid, String pname, float price) {
 		super();
 		this.pid = pid;
 		this.pname = pname;
 		this.price = price;
 	}
	
}
public class Product {
	

	public static void main(String[] args) {
		List<ProductList> pobj=new ArrayList<ProductList>();
		pobj.add(new ProductList(101,"LG tv",35000));
		pobj.add(new ProductList(102,"Sony tv",99000));
		pobj.add(new ProductList(103,"Skyworth tv",25000));
		pobj.add(new ProductList(104,"Apple tv",120000));
		pobj.add(new ProductList(105,"Lenovo tv",45000));
		pobj.add(new ProductList(106,"Samsung tv",55000));
		  List<Float> lobj=pobj.stream()
				  .filter(p->p.price>50000)//filtering
				  .map(p->p.price)//fetching price
				  .collect(Collectors.toList());//collecting to list
		  System.out.println(lobj);
	}

}
