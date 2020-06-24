package com.java.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.model.Emp;
import com.java.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/emps/")
	public Emp employee(@RequestParam Integer empno) {
		System.out.println("****EMPNO" + empno+"********");
		Emp e = new Emp();
		e.setEmpno(empno);
		Emp e1=service.findEmployee(e);
		return e1;
	}
		/**
	* Create given employee ... 
	*/
	@PostMapping("/emps/")
	public void save(@RequestBody Emp emp) {
		service.save(emp);
	}
	
	@PutMapping("/emps/")
	public void update(@RequestBody Emp emp) {
		service.save(emp);
	}	
	
	@PatchMapping("/emps/")
	public void insert(@RequestBody Emp emp) {
		service.save(emp);
	}	
	
	@RequestMapping(value = "/emps/", method = RequestMethod.DELETE)
	public void delete(@RequestParam("empno") Integer empno) {
		service.delete(empno);
	}

}
