package com.training.iodemos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person person = new Person();
		
		ObjectInputStream  obj  = new ObjectInputStream(
				new FileInputStream("record.txt"));
		
		person = (Person) obj.readObject();
		
		System.out.println(person);
	}
}
