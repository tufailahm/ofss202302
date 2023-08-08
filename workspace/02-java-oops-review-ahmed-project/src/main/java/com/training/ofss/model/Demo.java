package com.training.ofss.model;

import com.training.ofss.orders.CustomerOrders;

public class Demo {
	public int age=40;
	public Demo() {
		age=30;
	}
	
	public void display() {
		System.out.println("Display called");
		System.out.println(age);

	}
	public void accept() {
		System.out.println("accept called");
	
		display();
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.accept();
		Emp e = new Emp();
		e.work();
		Customer c = new Customer();
		c.payBill();
		
		CustomerOrders customerOrders = new CustomerOrders();
		customerOrders.payBill();
	}
}
class Emp
{
	public void work() {
		Demo d = new Demo();
		System.out.println(d.age);
		System.out.println("Emp work method called");
	}
}

class Cust extends Demo
{
	public void display() {
		Demo d = new Demo();
		System.out.println(d.age);
		System.out.println(age);
	}
}