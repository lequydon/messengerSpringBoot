package com.masseger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
    public String welcome() {
        return "Welcome to Spring Boot + REST + JWT Example.";
    }
 
    @GetMapping("/test")
    public String test() {
        return "{greeting: 'Hello'}";
    }
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
}
