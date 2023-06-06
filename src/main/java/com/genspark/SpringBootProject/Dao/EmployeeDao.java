package com.genspark.SpringBootProject.Dao;

import com.genspark.SpringBootProject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer>
{
}
