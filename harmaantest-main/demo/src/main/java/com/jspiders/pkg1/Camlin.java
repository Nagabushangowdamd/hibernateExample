package com.jspiders.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harman.demo.controller.TestService;

@Controller
public class Camlin {
	@Autowired
	TestService testService;

	@RequestMapping("/camlin")
	public ResponseEntity<String> hello()
	{
		testService.testMe();
		return ResponseEntity.ok("HEllo bhayya how are you?");
	}
}
