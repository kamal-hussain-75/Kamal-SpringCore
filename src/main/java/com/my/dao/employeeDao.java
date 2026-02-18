package com.my.dao;



import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.my.spring.model.Employee;

import com.my.spring.model.employeeMapper;


public class employeeDao {
	
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getAllEmp()	{
		return jdbcTemplate.query("select * from employee", new employeeMapper());

	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee (id,name,salary,gender) values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "','"+e.getGender()+"')";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(int id) {
		String query = "delete from employee where id='" + id + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
}
