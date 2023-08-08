package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService_Example {

	public ExecutorService_Example() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(new ExampleRunnable("one"));
		es.execute(new ExampleRunnable("two"));
		es.shutdown();
	}

}
