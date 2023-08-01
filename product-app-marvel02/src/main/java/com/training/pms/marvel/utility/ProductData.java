package com.training.pms.marvel.utility;

import java.util.ArrayList;
import java.util.List;

import com.training.pms.marvel.model.Product;

public class ProductData {
	
	public static List<Product> getAllProducts(){
		Product p1 = new Product(1, "Table", 2321, 100);
		Product p2 = new Product(2, "Chair", 332, 200);
		Product p3 = new Product(3, "Bed", 333, 300);
		Product p4 = new Product(4, "Mobile", 234, 400);
		Product p5 = new Product(5, "TV", 2325, 500);
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);products.add(p4);
		products.add(p2);products.add(p5);
		products.add(p3);
		return products;
	}

}
