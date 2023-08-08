package com.training.iodemos;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fsRead = new FileInputStream("hello.txt");
		while ((i = fsRead.read()) != -1) {
			System.out.print((char) i);
		}

		fsRead.close();
	}
}
