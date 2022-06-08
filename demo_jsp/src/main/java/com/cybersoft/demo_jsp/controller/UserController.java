package com.cybersoft.demo_jsp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cybersoft.demo_jsp.entity.Users;
import com.cybersoft.demo_jsp.entity.UsersDTO;
import com.cybersoft.demo_jsp.service.UserServiceImp;

@Controller
@ResponseBody
@RequestMapping("/account")
public class UserController {
	
	@Autowired
	UserServiceImp serviceImp;
	
	@GetMapping("")
	public List<Users> getAllUser(){
		return serviceImp.getAllUser();
	}
	
}
