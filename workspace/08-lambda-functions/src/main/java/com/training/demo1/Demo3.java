package com.training.demo1;

import java.util.List;
import java.util.function.Supplier;

import com.training.model.Person;
import com.training.utility.PersonData;

public class Demo3 {

	static String product = "Android";

	public static void main(String[] args) {
		  List<Person> tList =  PersonData.gatherPersons();

		Supplier<Boolean> boolSupplier = () -> product.length() == 10;
		Supplier<Integer> intSupplier = () -> product.length() - 2;
		Supplier<String> supplier = () -> product.toUpperCase();

		System.out.println(boolSupplier.get());// false
		System.out.println(intSupplier.get());// 5
		System.out.println(supplier.get());// ANDROID

	}

}
