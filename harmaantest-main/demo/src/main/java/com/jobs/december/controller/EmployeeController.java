package com.jobs.december.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobs.december.model.Employee;
import com.jobs.december.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	//writing this to confirm whether the object is created or not suring start of the application
	public EmployeeController()
	{
		System.out.println("i am EmployeeController");
	}
	
	@Autowired
	private EmployeeService empService;
	@RequestMapping("/getById/{id}")
	public ResponseEntity<Employee> getTheEmployee(@PathVariable("id") Integer id)
	{
		Employee emp= empService.getById(id);
		if(emp!=null) {
		return ResponseEntity.status(200).body(emp);
		}
		else
		{
			return ResponseEntity.status(400).body(emp);
		}
	}
	//writing this to load the data to the hashmap
	@RequestMapping("/load/data")
	public ResponseEntity<String>  loadData()
	{
		boolean value=empService.loadObjects();
		if(value)
		{
			return ResponseEntity.status(200).body("Data loaded successfully to the hashmap");
		}
		else
		{
			
				return ResponseEntity.status(403).body("Could not load Data to the hashmap");	
		}
	}
	@RequestMapping("/get/all")
	public ResponseEntity<List<Employee>>  getAll()
	{
		List<Employee> objects=empService.getAll();
		if(objects!=null &&objects.size()>0)
		{
			return ResponseEntity.status(200).body(objects);
		}
		else
		{
				return ResponseEntity.status(403).body(objects);	
		}
	}
	
	@RequestMapping("/save")
	public ResponseEntity<List<Employee>> saveData(@RequestBody Employee emp)
	{
		List<Employee> listData=  empService.saveEmp(emp);
		
		if(listData!=null&&listData.size()>0)
		{
			return ResponseEntity.status(200).body(listData);
		}
		else
		{
			return ResponseEntity.status(403).body(null);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
