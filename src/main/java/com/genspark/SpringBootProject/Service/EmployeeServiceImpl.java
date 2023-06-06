package com.genspark.SpringBootProject.Service;

import com.genspark.SpringBootProject.Dao.EmployeeDao;
import com.genspark.SpringBootProject.Entity.Employee;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees()
	{
		return this.employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id)
	{
		Optional<Employee> e = this.employeeDao.findById(id);
		Employee employee = null;
		if(e.isPresent())
		{
			employee = e.get();
		}
		else
		{
			throw new RuntimeException("Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee)
	{
		return this.employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee)
	{
		return this.employeeDao.save(employee);
	}

	@Override
	public String deleteEmployeeById(int id)
	{
		this.employeeDao.deleteById(id);
		return "Deleted";
	}
}
