package com.jspiders.pkg1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.harman.demo.controller.TestService;

@Configuration
public class CamlinConfig {
	
	
	@Bean
	public TestService getMarker()
	{
		return new TestService();
	}

}
