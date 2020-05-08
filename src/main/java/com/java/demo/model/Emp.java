package com.java.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "emp")
@Entity
public class Emp {
	
	Integer empno;
	String name;
	Integer dept;
	Integer salary;
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empno")
	public Integer getEmpno() {
		return empno;
	}
	
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	
	@Column(name = "ename")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "dept")
	public Integer getDept() {
		return dept;
	}
	public void setDept(Integer dept) {
		this.dept = dept;
	}
	
	@Column(name = "salary")
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	

}
