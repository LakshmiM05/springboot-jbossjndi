package com.tuv.employee.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tuv.employee.bo.Employee;




//@Component
@Service
public interface EmployeeService {

	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();
	
}
