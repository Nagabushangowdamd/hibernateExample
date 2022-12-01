package com.harman.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.harman.demo.model.SuperHeroes;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/testing")
	public ResponseEntity<String> testMe(@RequestParam("name") String name) throws JsonMappingException, JsonProcessingException
	{
		if(name.equals("virat"))
		{
		String s="this is working for testing";
		return ResponseEntity.status(200).body(s);
		}
		else
		{
			String s="this is not  working for testing";
			return ResponseEntity.status(400).body(s);
		}
		}

	
	@RequestMapping("/testing/{empId}")
	public ResponseEntity<String> test(@RequestParam("name") String name,
			@PathVariable("empId")int id) 	{
		if(name.equals("virat"))
		{
		String s="this is working for testing dust";
		return ResponseEntity.status(200).body(s);
		}
		else
		{
			String s="this is not  working testing dust";
			return ResponseEntity.status(400).body(s);
		}
		}


}
