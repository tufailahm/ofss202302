package com.training.ofss.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ThrowsExample {

	public static int readByteFromFile() throws FileNotFoundException, IOException {
		try (InputStream in = new FileInputStream("a.txt")) {
			System.out.println("File open");
			return in.read();
		}
	}
	public static int writeByteFromFile() throws FileNotFoundException, IOException {
		try (InputStream in = new FileInputStream("a.txt")) {
			System.out.println("File open for write");
			return in.read();
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Reading from the file");

		readByteFromFile();
		writeByteFromFile();

		System.out.println("Writing from the file");

		System.out.println("Thanks");
	}
}
