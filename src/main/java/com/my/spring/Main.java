package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("application-context.xml");
		
//		Employee bean=ioc.getBean(Employee.class);
//        System.out.println(bean);
		
		Employee bean1=ioc.getBean("emp1",Employee.class);
		
        bean1.setId(75);
        bean1.setName("kamal");
        bean1.setGender("Male");
        
        System.out.println(bean1);
        
        Employee bean2=ioc.getBean("emp2",Employee.class);
        bean2.setName("Haresh");
        bean2.setId(675);
        bean2.setGender("Male");
        System.out.println(bean2);
	}

}
