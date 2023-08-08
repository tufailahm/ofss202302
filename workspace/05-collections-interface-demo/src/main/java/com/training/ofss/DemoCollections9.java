package com.training.ofss;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCollections9 {

	public DemoCollections9() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		List<String> testList = List.of("A", "B", "C", "D", "E");              // List

		Set<String> testSet = Set.of("J", "B", "C", "A", "E");                 //Set

		Map<String, Integer> testMap = Map.of("A", 1, "B", 2, "C", 3, "D", 4, "E", 5);  
		
		System.out.println(testList);
		System.out.println(testSet);
	}
}
