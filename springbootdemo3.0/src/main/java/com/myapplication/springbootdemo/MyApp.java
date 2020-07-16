package com.myapplication.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping("/welcome")
public class MyApp {
	
	
		
		@GetMapping("/greeting")
		public String welcome() {
			return "Welcome to Spring Boot";
		}

	}

