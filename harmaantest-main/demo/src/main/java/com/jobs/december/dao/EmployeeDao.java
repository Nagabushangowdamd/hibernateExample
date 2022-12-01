package com.jobs.december.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.jobs.december.model.Employee;

@Repository
public class EmployeeDao {
	
	//writing this to confirm whether the object is created or not suring start of the application
	public EmployeeDao()
	{
		System.out.println("this is EmployeeDao");
	}
	
	Map<Integer,Employee> database= new HashMap<>();
	public  Map<Integer, Employee> loadObjects()
	{
		Employee e1= new Employee("Rama", 12, 1000.0, "Developer");
		Employee e2= new Employee("Bheema", 15, 2000.0, "QA");
		Employee e3= new Employee("Soma", 13, 500.0, "admin");
		//Adding these data to the hashmap
		database.put(e1.geteId(),e1);
		database.put(e2.geteId(),e2);
		database.put(e3.geteId(),e3);
		return database;
	}
	
	public Employee getById(Integer id)
	{
		return database.get(id);
	}	
	public List<Employee> getAll()
	{
		List<Employee> list = new ArrayList<>();
		Set<Entry<Integer, Employee>> datas = database.entrySet();
		
		for(Entry<Integer, Employee> data: datas)
		{
			list.add(data.getValue());
		}
		
		return list;
	}
	
	
	
	public List<Employee> saveData(Employee emp)
	{
		
		List<Employee> list= new ArrayList<>();
		if(database!=null)
		{
			database.put(emp.geteId(), emp);
		}
		
		database.entrySet().stream().forEach(p->list.add(p.getValue()));
		return list;
	}
}





























