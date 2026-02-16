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
		
		Employee bean1=ioc.getBean("emp2",Employee.class);
	
		bean1.setName("Rohit");
		
		Address ad=ioc.getBean("add1",Address.class);
		
		ad.setCity("Gkp");
		ad.setState("UP");
	    
	    
	    System.out.println(bean1);
        
      
        
        
       
	}

}
  