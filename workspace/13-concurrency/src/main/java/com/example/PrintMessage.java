package com.example;

public class PrintMessage extends Thread{

	Thread t1;
	public PrintMessage() {
			t1 = new Thread(this);
			t1.setName("GAME");
			t1.start();
			System.out.println("4.HELLO BY :"+currentThread().getName());
	}
	@Override
	public void run() {
		System.out.println("3.RUN CALLED ::"+currentThread().getName());
	}
	public static void main(String[] args) {
		Thread.currentThread().setName("ORACLE");
		PrintMessage pm = new PrintMessage();
		Hello h = new Hello();
		h.setName("OFSS2");
		h.start();
		Hello h1 = new Hello();
		h1.start();
		System.out.println("5.MAIN CALLED by "+currentThread().getName());
	}
}

class Hello extends Thread
{
	@Override
	public void run() {
		System.out.println("Hello RUN CALLED ::"+currentThread().getName());

	}
}