package com.cybersoft.demo_hibernate.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.demo_hibernate.entity.Users;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@GetMapping("")
	public ResponseEntity<List<Users>> getUsers() {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Users> query = session.createQuery("from users", Users.class);
		List<Users> listUser = query.getResultList();
		
		for (Users users : listUser) {
			System.out.println("kiemtra " + users.getUserName());
		}
		
		return new ResponseEntity<List<Users>>(listUser, HttpStatus.OK);
	}
	
	/* 
	 * - Tạo API thêm user thực hiện kết nối database và thêm user
	 * - Tạo API xoá user 
	 * */
	
	@DeleteMapping("/delete/{id}")
	@Transactional
	public String deleteUser(@PathVariable("id") int id) {
		Session session = sessionFactory.getCurrentSession();
		Users users = new Users();
		users.setId(id);
		
		try {
			session.delete(users);
			
			return "success";
		}catch (Exception e) {
			// TODO: handle exception
			return "Failed";
		}
		
		
		
	}
	
	
}
