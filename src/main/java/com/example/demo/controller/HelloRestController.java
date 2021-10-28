package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	@RequestMapping(value= {"","/","/home"})
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("Hello world!",HttpStatus.OK);
	}
}