package com.tuv.employee.bo;


public class Employee {
	private int empid;
	 private String name;
	 private int age;
	 private long salary;
	 /**
	  * @return the empid
	  */
	 public int getEmpid() {
	  return empid;
	 }
	 /**
	  * @param empid the empid to set
	  */
	 public void setEmpid(int empid) {
	  this.empid = empid;
	 }
	 /**
	  * @return the name
	  */
	 public String getName() {
	  return name;
	 }
	 /**
	  * @param name the name to set
	  */
	 public void setName(String name) {
	  this.name = name;
	 }
	 /**
	  * @return the age
	  */
	 public int getAge() {
	  return age;
	 }
	 /**
	  * @param age the age to set
	  */
	 public void setAge(int age) {
	  this.age = age;
	 }
	 /**
	  * @return the salary
	  */
	 public long getSalary() {
	  return salary;
	 }
	 /**
	  * @param salary the salary to set
	  */
	 public void setSalary(long salary) {
	  this.salary = salary;
	 }
	 public String toString(){
	  return "EMPLOYEE{empid- "+this.empid+" name- "+this.name+
	    " age- "+this.age+" salary- "+this.salary+"}";
	 }

}
