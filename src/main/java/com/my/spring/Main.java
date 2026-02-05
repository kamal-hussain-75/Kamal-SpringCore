package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Address;
import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("application-context.xml");
		
//		Employee bean=ioc.getBean(Employee.class);
//        System.out.println(bean);
		
		Employee bean1=ioc.getBean("emp3",Employee.class);
		
		Address beanAdd=ioc.getBean("add1", Address.class);
		
		beanAdd.setCity("Gopalganj");
		beanAdd.setState("Bihar");
		
        bean1.setId(2);
        bean1.setName("kamal");
        bean1.setGender("male");
        bean1.setAddress(beanAdd);
        
        System.out.println(bean1);
        
        
       
	}

}
