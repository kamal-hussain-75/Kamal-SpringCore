package com.my.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

 private int id;
 private String name,gender;
 
 private Address address;
 
 private List<Integer>myList;
 private Set<Integer>setOfContacts;
 private Map<Integer,String> myMap;
 
 public Employee() {
	 super();
 }
 
 

 public Employee(int id, String name, String gender, Address address, List<Integer> myList, Set<Integer> setOfContacts,
		Map<Integer, String> myMap) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.address = address;
	this.myList = myList;
	this.setOfContacts = setOfContacts;
	this.myMap = myMap;
	
	System.out.println("constructor called()");
}

 


 public Set<Integer> getSetOfContacts() {
	return setOfContacts;
}



 public void setSetOfContacts(Set<Integer> setOfContacts) {
	this.setOfContacts = setOfContacts;
 }



 public Map<Integer, String> getMyMap() {
	return myMap;
 }



 public void setMyMap(Map<Integer, String> myMap) {
	this.myMap = myMap;
 }



 public List<Integer> getMyList() {
	return myList;
}


 public void setMyList(List<Integer> myList) {
	this.myList = myList;
 }



 public Address getAddress() {
	return address;

}



 public void setAddress(Address address) {
	this.address = address;
	System.out.println("Employee.setAddress()");
 }



 public int getId() {
	return id;
 }

 public void setId(int id) {
	this.id = id;
	System.out.println("Employee.setId()");
 }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
	System.out.println("Employee.setName()");
 }

 public String getGender() {
	return gender;
 }

 public void setGender(String gender) {
	this.gender = gender;
	System.out.println("Employee.setGender()");
 }



 @Override
 public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", myList="
			+ myList + ", setOfContacts=" + setOfContacts + ", myMap=" + myMap + "]";
 }


}
