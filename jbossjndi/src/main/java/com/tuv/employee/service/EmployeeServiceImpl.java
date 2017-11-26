package com.tuv.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tuv.employee.bo.Employee;
import com.tuv.employee.dao.EmployeeDAO;





//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	@Override
	public Employee getEmployee(int empId) {
		
		// TODO Auto-generated method stub
		//userRepository.getUser(id);
		return employeeDAO.getEmployee(empId);
	}
	
	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployee();
	}

}
