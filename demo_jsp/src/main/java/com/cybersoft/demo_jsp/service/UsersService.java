package com.cybersoft.demo_jsp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.demo_jsp.entity.Roles;
import com.cybersoft.demo_jsp.entity.Users;
import com.cybersoft.demo_jsp.entity.UsersDTO;
import com.cybersoft.demo_jsp.repository.UsersRepository;

@Service
public class UsersService implements UserServiceImp{
	@Autowired
	UsersRepository repository;

	@Override
	public List<Users> getAllUser() {
		// TODO Auto-generated method stub
		System.out.println("kiemtra asdas");
		List<Users> list = new ArrayList<Users>();
		Roles roles = new Roles();
		roles.setId(1);
		
		list.add(repository.findByUserNameAndRoleId("Nguyen Thi C",1));
		return repository.findAll();
	}
	
	
}
