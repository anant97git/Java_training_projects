package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
   
	@GetMapping(value="/user/{id}")
	public int fun(@PathVariable int id) {
		return id;
	}
	
}
