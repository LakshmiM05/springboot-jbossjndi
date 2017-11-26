package com.tuv.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuv.employee.bo.Employee;
import com.tuv.employee.service.EmployeeService;


//import com.tuv.user.bo.Employee;


//import com.tuv.user.service.UserService;

@RestController
public class EmployeeController {

	@Autowired 
	private EmployeeService empService;
	
	@RequestMapping("rest/employee/{id}")
	public Employee getUser(@PathVariable("id") int id) {
		System.out.println("Inside User Controller:::::" + id);
		//userService = new UserServiceImpl();
		return empService.getEmployee(id);
		// return new ResponseEntity<User>(userService.getUser(id),
		// HttpStatus.OK);

	}
	
	@RequestMapping("organization/employee")
	public List<Employee> getAllEmployee() {
		System.out.println("Inside User Controller:::::" );		
		return empService.getAllEmployee();		
	}


}
