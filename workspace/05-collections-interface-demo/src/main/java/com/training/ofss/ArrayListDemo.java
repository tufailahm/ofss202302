package com.training.ofss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public ArrayListDemo() {
		
	}
	
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
	
		names.add("Neha1");
		names.add("Neha2");
		names.add("naina");
		
		names.add("Tarun");
		names.add("Neha");
		names.add("Tufail");
		names.add("Aman");

		Collections.sort(names);
		
		System.out.println(names);	
		
		
		
		
		
		
		
		
	//	names.add(90);
		
		names.remove("Neha");
		
		System.out.println("elements after deleting :"+ names.size());
		
		System.out.println(names);
		
		Iterator<String> iterator = names.iterator();
		
		System.out.println("Printing one by using iterator");
		while(iterator.hasNext()) {
			
			String element = iterator.next();
			if(!(element.startsWith("N") || element.startsWith("n")))
				System.out.println(element);
		}
		System.out.println("Printing one by using for loop");

		for(String n:names) {

			if(!(n.startsWith("N") || n.startsWith("n")))
				System.out.println(n);
		}
	}

}






