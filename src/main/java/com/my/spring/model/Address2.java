package com.my.spring.model;

import org.springframework.stereotype.Component;

@Component(value="add2")
public class Address2 implements IAaddress{

	private String city="noida";
	private  String state="UP";
	
	public Address2() {
		super();
	}

	public Address2(String city, String state) {
		super();
		this.city = city;
		this.state = state;
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
		return "Address2 [city=" + city + ", state=" + state + "]";
	}
	
	
	

}
