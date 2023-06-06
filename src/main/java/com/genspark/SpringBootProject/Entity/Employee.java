package com.genspark.SpringBootProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tbl_employees")
public class Employee
{
	@Id
	@Column(name = "e_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String jobTitle;
	private int hourlyWage;

	public Employee(){};

	public Employee(String name, String jobTitle, int hourlyWage)
	{
		this.name = name;
		this.jobTitle = jobTitle;
		this.hourlyWage = hourlyWage;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getJobTitle()
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	public int getHourlyWage()
	{
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage)
	{
		this.hourlyWage = hourlyWage;
	}
}
