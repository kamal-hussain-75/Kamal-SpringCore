package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.my.spring.model.Address1;
import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc=new AnnotationConfigApplicationContext("com.my.spring.model");
		

		
		Employee bean1=ioc.getBean(Employee.class);
	
		
	
		System.out.println(bean1);
	 
	}

}
  