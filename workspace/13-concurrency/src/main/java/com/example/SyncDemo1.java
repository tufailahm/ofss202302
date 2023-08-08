package com.example;

class TwoStrings
{
	static synchronized void  print(String str1, String str2)
	{
		System.out.print(str1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str2);
	}
}

class PrintStringsThread implements Runnable
{
	Thread thread;
	String str1, str2;
	PrintStringsThread(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
	}
}
class SyncDemo1
{
	public static void main(String args[])
	{
		new PrintStringsThread("Thread1#Abinash", "Thread1-Suryakant");
		new PrintStringsThread("Thread2#Yash", "Thread2-Pandya");
		new PrintStringsThread("Thread3#Anshul","Thread3-Vishwakarma");
		new PrintStringsThread("Thread4#Sagnik","Thread4-Ghosh");
	}
}