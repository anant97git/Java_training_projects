package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.UserServiceException;
import com.example.demo.userPackage.UserRest;

import java.util.*;

//Note :- Videos followed - REST API with Spring Boot - Sergey Kaplov

@RestController
@RequestMapping("/users")
public class MyController {
//	HashMap<String,UserRest> users = new HashMap<String,UserRest>();
	Map<String, UserRest> users;
	
	// Video3
	@GetMapping
	public String getUsers(@RequestParam(value="page") int page,
			@RequestParam(value="limit") int limit)
	{
		return "get users was called with page = "+page+" and limit = "+limit;
	}
	
//	 video 3
//	@GetMapping(path="/{userId}")
//	public ResponseEntity<UserRest> getUser(@PathVariable String userId)
//	{
//		UserRest returnValue = new UserRest();
//		returnValue.setEmail("aj@mail.com");
//		returnValue.setFirstName("Anant");
//		returnValue.setLastName("Jain");
//		returnValue.setId("11");
//		return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
//	}
	
//	// video 6
	@GetMapping(path="/{userId}")
	public ResponseEntity<UserRest> getUser(@PathVariable String userId)
	{
//		if (true) throw new UserServiceException("A user service exception is thrown");
		
		String firstName = null;
		int firstNameLength = firstName.length();
		
		if (users.containsKey(userId))
		{
			return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	// video 4
	@DeleteMapping(path="/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable String id)
	{
//		return ResponseEntity.noContent().build();
		return new ResponseEntity<String>("delete done for user id : "+id, HttpStatus.OK);
	}
	
	@PostMapping(
			consumes= {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE
			},
			produces= {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE
					} )
	public ResponseEntity<UserRest> createUser()
	{
		UserRest returnValue = new UserRest();
		returnValue.setEmail("aj");
		returnValue.setFirstName("k");
		returnValue.setLastName("k");
		
		String userId = UUID.randomUUID().toString();
		returnValue.setUserId(userId);
		
		if (users==null)users = new HashMap<>();
		users.put(userId, returnValue);
		
		return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
		
	}
	
	
	// Video1
//	@GetMapping(path="/{userId}")
//	public String getUser(@PathVariable String userId)
//	{
//		return "get users was called : "+userId;
//	}
	
//	HashMap<String,String> users = new HashMap<String, String>();
	
//	@GetMapping("/user")
//	Object getUser() {
//		
//		return users;
//	}
	
//	@PostMapping("/user")
//	Object addUser(@RequestBody HashMap<String, String> newUser) {
//		
//		users.put(newUser.get("id"),newUser.get("name"));
//		
//		return newUser;
//	}
	
}
