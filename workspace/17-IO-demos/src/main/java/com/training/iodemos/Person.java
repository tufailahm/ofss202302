package com.training.iodemos;

import java.io.Serializable;

public class Person implements Serializable{
	private String givenName;
	private String surName;
	private int age;
	private String gender;
	private String eMail;
	private transient String phone;
	private String address;
	private String city;
	private String state;
	private String code;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String givenName, String surName, int age, String gender, String eMail,
			String phone, String address,
			String city, String state, String code) {
		super();
		this.givenName = givenName;
		this.surName = surName;
		this.age = age;
		this.gender = gender;
		this.eMail = eMail;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.code = code;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Person [givenName=" + givenName + ", surName=" + surName + ", age=" + age + ", gender=" + gender
				+ ", eMail=" + eMail + ", phone=" + phone + ", address=" + address + ", city=" + city + ", state="
				+ state + ", code=" + code + "]";
	}

}
