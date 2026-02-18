package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.dao.employeeDao;
import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("application-context.xml");

		employeeDao edao=ioc.getBean("edao",employeeDao.class);
		
		Employee emp1=new Employee(1,"ravidas","male",23000);
		
		edao.saveEmployee(emp1);
        
        
       
	}

}
