package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Address;
import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc=new AnnotationConfigApplicationContext("com.my.spring.model");
		

		
		Employee bean1=ioc.getBean(Employee.class);
	
		bean1.setId(1);
		bean1.setName("Hussain");
		bean1.setGender("Male");

		
		Address add=ioc.getBean(Address.class);
		add.setCity("Siwan");
		add.setState("Bihar");
		
		System.out.println(add);
		bean1.setAddress(add);
		System.out.println(bean1);
	 
	}

}
  