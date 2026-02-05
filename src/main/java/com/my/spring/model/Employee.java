package com.my.spring.model;

public class Employee {

 private int id;
 private String name,gender;
 
 private Address address;
 
 public Employee() {
	 super();
 }

 

 public Employee(int id, String name, String gender, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.address = address;
	System.out.println("Employee.Employee(Constructor)");
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
	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
 }


 
 

}
