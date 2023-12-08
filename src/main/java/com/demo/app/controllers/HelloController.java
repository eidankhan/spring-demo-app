package com.demo.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    	@GetMapping
	public String displayMessage(){
		return "Spring App is running perfectlly on Azure Kubernets!";
	}

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello! Spring Cloud Azure";
	}
}
