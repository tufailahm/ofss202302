package com.training.spring.pms.model;


public class Address
{
	private int aId;
	private String city;
	private String state;
	
	public Address() {
		System.out.println("Address default cons called");
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
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

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", state=" + state + "]";
	}
	
	
}