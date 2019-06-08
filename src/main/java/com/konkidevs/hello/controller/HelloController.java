package com.konkidevs.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.konkidevs.hello.services.HelloService;

@RestController
@RequestMapping("hello")
public class HelloController {
	
	@Autowired
	private HelloService helloService;

	@GetMapping
	public String sayHello(@RequestParam(name = "name", required = false) String name) {
		return helloService.sayHello(name);
	}
	
}