package com.cybersoft.demo_jsp.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybersoft.demo_jsp.entity.Roles;
import com.cybersoft.demo_jsp.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>  {
	
	 List<Users> findByUserName(String userName);
	 Users findByUserNameAndRoleId(String userName, Integer id);
	 
	 @Query("select r from users e join roles r on r.id = e.role.id")
	 List<Users> findAll();
	
}
