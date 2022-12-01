package com.jobs.december.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.december.dao.EmployeeDao;
import com.jobs.december.model.Employee;

@Service
public class EmployeeService {

	//writing this to confirm whether the object is created or not suring start of the application
	public EmployeeService() {
		System.out.println(" this is Employee Service");
	}
	@Autowired
	private EmployeeDao empDao;
	
	public Employee getById(Integer id)
	{
		return empDao.getById(id);
	}
	
	
	public boolean loadObjects()
	{
		return empDao.loadObjects().size()>0?true:false;
	}
	
	
	public List<Employee> getAll()
	{
		return empDao.getAll();
	}
	
	public List<Employee> saveEmp(Employee emp)
	{
		return empDao.saveData(emp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
