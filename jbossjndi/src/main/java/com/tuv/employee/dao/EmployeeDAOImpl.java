package com.tuv.employee.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.tuv.employee.bo.Employee;
import com.tuv.employee.rowmapper.EmployeeRowMapper;




//import com.tuv.user.bo.Employee;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	//@Autowired
	private SimpleJdbcCall simpleJdbcCall;
	
	
	EmployeeDAOImpl(DataSource dataSource){
		System.out.println("dataSource::: " + dataSource);
		this.jndiDataSource=dataSource;
		 this.simpleJdbcCall = new SimpleJdbcCall(this.jndiDataSource).withCatalogName("TUV").withProcedureName("getEmpRecord");
	}
	//@Autowired
	 private DataSource jndiDataSource;
	
	/*// @Autowired
	 public void setDataSource(DataSource dataSource) {
	  this.dataSource = dataSource;
	  System.out.println("dataSource:::: "+dataSource);
	  this.simpleJdbcCall = new SimpleJdbcCall(this.dataSource).withProcedureName("getEmpRecord1");
	 }*/

	@Override
	public Employee getEmployee(int empId) {
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_empid", empId);
		System.out.println("simpleJdbcCall"+simpleJdbcCall);
		   Map out = simpleJdbcCall.execute(in);
		   Employee employee = new Employee();
		   employee.setEmpid(empId);
		   employee.setName((String)out.get("out_name"));
		   employee.setAge((Integer)out.get("out_age"));
		   employee.setSalary(Long.valueOf((String)out.get("out_salary")));
		   return employee;
		// TODO Auto-generated method stub
		
	}
	
	public List<Employee> getAllEmployee() {
		
		Map employeeMap =simpleJdbcCall.withCatalogName("TUV").withProcedureName("getAllEmployee").returningResultSet("emprec", new EmployeeRowMapper()).execute(new HashMap<String, Object>(0));
		//simpleJdbcCall.execute("emprec");
		//TODO Auto-generated method stub
		
		System.out.println("out data ::"+employeeMap.get("emprec"));
		List<Employee> empList=(List)employeeMap.get("emprec");
		return empList;
	}


}
