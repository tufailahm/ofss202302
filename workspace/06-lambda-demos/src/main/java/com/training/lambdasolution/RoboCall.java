package com.training.lambdasolution;

import java.util.Arrays;
import java.util.List;

import com.training.model.Person;
import com.training.utility.PersonData;

public class RoboCall {

	public static void robocall(String number) {
		/*
		 * Code to place an automated call. This code will connect to the phone system
		 * using the supplied number and place the call.
		 */
		System.out.println("Calling :"+number );
	}

	void robocallEveryPerson() {
		List<Person> list = gatherPersons();
		for (Person p : list) {
			String num = p.getPhone();
			RoboCall.robocall(num);
		}
	}
	private List<Person> gatherPersons() {
		return Arrays.asList(new Person());
		
	}

	void robocallEligibleDrivers() {
		  List<Person> list=gatherPersons();
		  for(Person p:list){
		     if(p.getAge()>= 16){
		     String num=p.getPhone();
		 RoboCall.robocall(num);  } }}
	
	void robocallEligibleVoters() {
		  List<Person> list=gatherPersons();
		  for(Person p:list){
		     if(p.getAge()>= 18){
		     String num=p.getPhone();
		 RoboCall.robocall(num);  } }}

	
	void robocallLegalDrinkers() {
		  List<Person> list=gatherPersons();
		  for(Person p:list){
		     if(p.getAge()>= 21){
		     String num=p.getPhone();
		 RoboCall.robocall(num);  } }}

	static List<Person> pl = PersonData.gatherPersons();

	public static  void robocallPersonOlderThan(int age) {
	    for(Person p: pl){   
	       if(p.getAge()>= age){
	      String num=p.getPhone();
	   RoboCall.robocall(num);  } }}


}