package com.training.iodemos;

public class PrintMessage extends Thread{

	Thread t1;
	public PrintMessage() {
			t1 = new Thread(this);
			t1.start();
			System.out.println("4.HELLO BY :"+currentThread().getName());
	}
	@Override
	public void run() {
		System.out.println("3.RUN CALLED ::"+currentThread().getName());
	}
	public static void main(String[] args) {
		PrintMessage pm = new PrintMessage();
		System.out.println("5.MAIN CALLED by "+currentThread().getName());
	}
}
