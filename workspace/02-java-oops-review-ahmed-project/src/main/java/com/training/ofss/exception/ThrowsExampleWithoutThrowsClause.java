package com.training.ofss.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ThrowsExampleWithoutThrowsClause {

	public static int readByteFromFile()  {
	    try (InputStream in = new FileInputStream("a.txt")) {
	        System.out.println("File open");
	        return in.read();
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	   }
	public static int writeByteFromFile()  {
	    try (InputStream in = new FileInputStream("a.txt")) {
	        System.out.println("File open for write");
	        return in.read();
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	   }
	
		public static void main(String[] args) {
			System.out.println("Reading from the file");
			readByteFromFile();
			System.out.println("Writing from the file");
			readByteFromFile();
		}
}
