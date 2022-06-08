package com.cybersoft.DemoDepencyIoC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.DemoDepencyIoC.app.ioc.Users;

@RestController
@RequestMapping("/home")
public class DemoIoCController {
	
	@Autowired
	Users users;
	
	@GetMapping("/")
	public String index() {
		System.out.println("user name : " + users.getPassword() );
		return "Hello";
	}
	
}
