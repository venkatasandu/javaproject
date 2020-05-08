package com.java.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.demo.model.Emp;

@Repository
public interface EmployeeRepository extends JpaRepository<Emp, Integer>{
}
