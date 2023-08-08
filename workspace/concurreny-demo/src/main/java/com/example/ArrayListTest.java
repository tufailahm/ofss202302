package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest implements Runnable {
	private static CopyOnWriteArrayList<String> wordList = new CopyOnWriteArrayList<>();

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		ArrayListTest test = new ArrayListTest();

		es.submit(test);
		es.submit(test);
		
		System.out.println(wordList);

		
		es.shutdown();
		
	}

	// Print code here
	public void run() {
		wordList.add("A");
		wordList.add("B");
		wordList.add("C");
	}
}