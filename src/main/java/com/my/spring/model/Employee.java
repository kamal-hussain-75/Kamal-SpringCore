package com.my.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

 private int id;
 private String name,gender;
 

 private IAaddress address;
 
 public Employee() {
	 super();
 }


 public int getId() {
	return id;
 }

 public void setId(int id) {
	this.id = id;
 }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 public String getGender() {
	return gender;
 }

 public void setGender(String gender) {
	this.gender = gender;
 }

 public IAaddress getAddress() {
	return address;
 }

 @Autowired
 @Qualifier(value="add1")
 public void setAddress(IAaddress address) {
	this.address = address;
 }

 @Override

 public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
 }

 
}
