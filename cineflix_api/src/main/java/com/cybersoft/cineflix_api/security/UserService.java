package com.cybersoft.cineflix_api.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cybersoft.cineflix_api.entity.Users;
import com.cybersoft.cineflix_api.services.UserServiceImp;
import com.cybersoft.cineflix_api.services.UsersService;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	UserServiceImp userServiceImp;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		SimpleGrantedAuthority roleAdmin = new SimpleGrantedAuthority("ROLE_ADMIN");
		roles.add(roleAdmin);
		
		Users users = userServiceImp.findByUsername(username);
		
		User user = new User(
				users.getUsername(), 
				users.getPassword(), 
				roles);
		
		return user;
	}

}
