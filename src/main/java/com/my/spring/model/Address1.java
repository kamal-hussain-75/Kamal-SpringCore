
  package com.my.spring.model;
  
  import org.springframework.stereotype.Component;
  
  @Component(value="add1")
  public class Address1 implements IAaddress {
  
  private String city="GZB"; 
  private String state="UP";
  
  public Address1(){
	  super();
	  }
  
    
  
  public Address1(String city, String state) {
	  super(); this.city = city;
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
  
  @Override public String toString() { return "Address [city=" + city +
  ", state=" + state + "]"; }
  
  }
 
