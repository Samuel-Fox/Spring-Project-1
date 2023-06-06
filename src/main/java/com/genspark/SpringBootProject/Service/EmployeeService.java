package com.genspark.SpringBootProject.Service;

import com.genspark.SpringBootProject.Entity.Employee;
import java.util.List;
import org.springframework.stereotype.Service;

public interface EmployeeService
{
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	String deleteEmployeeById(int id);
}
