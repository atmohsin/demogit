package com.niveus.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	String hello(@RequestParam(required = false) String foo) {
		if ("foo".equals(foo)) {
			System.out.println("this is not going to happen");
		}
		return "hello";
	}

}