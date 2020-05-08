package com.java.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.demo.model.Emp;
import com.java.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public Emp findEmployee(Emp emp) {
		
		Optional<Emp> emp1=repository.findById(emp.getEmpno());
		
		return emp1.get();
	}
	
	public void save(Emp emp) {
		repository.save(emp);
	}
	
	public void delete(Integer empno) {
		repository.deleteById(empno);
	}

}
