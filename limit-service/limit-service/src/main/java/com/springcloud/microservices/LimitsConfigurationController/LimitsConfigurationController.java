package com.springcloud.microservices.LimitsConfigurationController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.microservices.bean.LimitsConfiguration;



@RestController
@RequestMapping
public class LimitsConfigurationController {
	
/*	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfigurations() {
		LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(), 
				configuration.getMinimum());
		return  new LimitsConfiguration(100,1);
	}*/
	
	//@GetMapping(value = "/get")
	@RequestMapping(path ="/v")
	public String retrieveLimitsFromConfigurations() {
		System.out.println(" in then++++++++++++++++++++++");
	/*	LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(), 
				configuration.getMinimum());*/
		return  "veena is in belgium";
	}
	
 @Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfigurations1() {
		LimitsConfiguration limitConfiguration = new LimitsConfiguration(configuration.getMaximum(), 
				configuration.getMinimum());
	 return limitConfiguration;
	//return  new LimitsConfiguration(1000,10);
	}

}
