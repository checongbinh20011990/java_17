package com.cybersoft.login_jwt.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		SimpleGrantedAuthority roleAdmin = new SimpleGrantedAuthority("ROLE_ADMIN");
		roles.add(roleAdmin);
		
		User user = new User(
				"admin", 
				"$2a$12$y.5QguzleqpEA/hQxN4w5OULyePIllS4IdaDprh3hWKv.8aj4ZPxy", 
				roles);
		
		return user;
	}

}
