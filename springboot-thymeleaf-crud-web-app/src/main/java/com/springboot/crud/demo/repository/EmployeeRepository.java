package com.springboot.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
