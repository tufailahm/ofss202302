package com.training.pdetails;

import java.util.List;

import com.training.plist.ProductList;

public class PrinntProductDetails {

	public static void main(String[] args) {
		List<String> products = ProductList.getProductList();
		
		System.out.println(products);
	}

}
