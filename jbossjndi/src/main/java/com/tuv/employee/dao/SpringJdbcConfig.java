package com.tuv.employee.dao;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiObjectFactoryBean;

@SpringBootConfiguration
public class SpringJdbcConfig {
	
	/*@Bean
	public SimpleJdbcCall simpleJdbcCall(DataSource dataSource)	
		{		
		return new SimpleJdbcCall(dataSource);
	}	
	
	
	@Bean(name="employeeDAOImpl")
    public EmployeeDAOImpl employeeDAOImpl(DataSource dataSource) {
        return new EmployeeDAOImpl(dataSource);
    }*/
	
	
	/*@Bean
	public DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/TUV");
	dataSource.setUsername("root");
	dataSource.setPassword("root");	
return dataSource;
	}*/
	
	
	@Bean
	public DataSource jndiDataSource() throws IllegalArgumentException, NamingException {
		JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
		bean.setJndiName("java:/TUV_JNDI");
		bean.setProxyInterface(DataSource.class);
		bean.setLookupOnStartup(false);
		bean.afterPropertiesSet();
		return (DataSource)bean.getObject();
	}
	

}
