package com.springcloud.microservices.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springcloud.microservices.LimitsConfigurationController.LimitsConfigurationController;

@SpringBootApplication
@ComponentScan(basePackageClasses = LimitsConfigurationController.class)
public class LimitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitServiceApplication.class, args);
	}

}
