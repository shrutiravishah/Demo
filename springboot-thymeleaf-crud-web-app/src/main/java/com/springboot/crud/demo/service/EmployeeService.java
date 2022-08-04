package com.springboot.crud.demo.service;

import java.util.List;

import com.springboot.crud.demo.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

}
