package com.cybersoft.demo_jpa_hibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.demo_jpa_hibernate.entity.Users;
import com.cybersoft.demo_jpa_hibernate.repository.UsersRepository;

@Service
public class UsersServices implements UsersServiceImp {
	
	@Autowired
	UsersRepository usersRepository;

	@Override
	public List<Users> getAllUser() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	@Override
	public List<Users> getUsersByUserName(String username) {
		// TODO Auto-generated method stub
		return usersRepository.findByuserName(username);
	}

	@Override
	public void insertUsers(Users users) {
		// TODO Auto-generated method stub
		usersRepository.save(users);
	}

	@Override
	public void deleteUsersById(Integer id) {
		// TODO Auto-generated method stub
		usersRepository.deleteById(id);
	}
	
	/* Nơi gọi lấy dữ liệu ở database và xử lý dữ liệu trước khi trả
	 * ra controller
	 *  */
	
//	public List<Users> getAllUser(){
//		return usersRepository.findAll();
//	}
//	
//	public List<Users> getUsersByUserName(String username){
//		return usersRepository.findByuserName(username);
//	}
}
