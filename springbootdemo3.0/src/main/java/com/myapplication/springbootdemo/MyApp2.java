package com.myapplication.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class MyApp2 {

	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
