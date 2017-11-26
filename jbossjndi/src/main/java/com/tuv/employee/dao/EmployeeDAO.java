package com.tuv.employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tuv.employee.bo.Employee;



@Repository
public interface EmployeeDAO {

	public Employee getEmployee(int empId);
	public List<Employee> getAllEmployee();
}
