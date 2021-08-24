package com.example.demo.fruit;
import com.example.demo.fruit.Fruit;
import com.example.demo.fruit.FruitResponse;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fruit")
public class FruitShopController {
	
	@GetMapping("/query/{fruitname}")
	public ResponseEntity<Fruit> queryFruit(@PathVariable String fruitname){
		
		if (fruitname.equalsIgnoreCase("banana"))
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Fruit>(new Fruit(fruitname, "Orange"), HttpStatus.OK);
	}
	
	@GetMapping("/realresponse/query/{fruitname}")
	public FruitResponse queryFruitWithResponse(@PathVariable String fruitname) {
		
		if (fruitname.equalsIgnoreCase("banana"))
			return new FruitResponse("We will not have banana until June 2020", false, null, LocalDateTime.now());
		
		return new FruitResponse(null, true, new Fruit(fruitname, "Orange"), LocalDateTime.now());
		
//		return "Hello";
	}
	
}
