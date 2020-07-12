package com.niveus.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	String hello(@RequestParam(required = false) String foo) {
		return "hello from master";
	}
	
	@GetMapping("/sample")
	String sample() {
		return "This first commit from Sample1 bbranch";
	}
	
	

}
