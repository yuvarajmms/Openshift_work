package com.example.handson.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Me";
	}
	
	@GetMapping("/users")
	public User sayHelloList() {
		return new User(1, "name1");
	}
	
}
