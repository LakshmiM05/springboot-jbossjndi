package com.tuv.employee.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tuv.employee.bo.Employee;





public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet resultset, int rowNo) throws SQLException {
		Employee employee = new Employee();
		employee.setName(resultset.getString("name"));
		employee.setEmpid(resultset.getInt("empid"));
		employee.setAge(resultset.getInt("age"));
		employee.setSalary(resultset.getLong("salary"));
		// TODO Auto-generated method stub
		return employee;
	}

}
