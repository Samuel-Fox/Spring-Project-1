package com.genspark.SpringBootProject.Controller;

import com.genspark.SpringBootProject.Entity.Employee;
import com.genspark.SpringBootProject.Service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public String home()
	{
		return "<HTML><H1>WELCOME</H1></HTML>";
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return this.employeeService.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		return this.employeeService.getEmployeeById(Integer.parseInt(id));
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable String id)
	{
		return this.employeeService.deleteEmployeeById(Integer.parseInt(id));
	}

}
