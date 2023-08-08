package com.training.iodemos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopyTest {
	public static void main(String[] args) throws IOException {
		final String file1 = "hello.txt";
		String file2 = "bye.txt";
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		System.out.println("Bytes available: " + fis.available());
		int count = 0;
		int read = 0;
		int i=0;
		while ( (i   = fis.read()) != -1) {
			fos.write(i);
			count++;
		}
		System.out.println("Wrote: " + count);
	}
}