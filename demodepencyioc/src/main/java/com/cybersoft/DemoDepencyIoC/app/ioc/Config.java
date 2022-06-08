package com.cybersoft.DemoDepencyIoC.app.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Users users() {
		System.out.println("kiemtra");
		
		Users users = new Users();
		users.setUserName("Anitation Bean");
		users.setPassword("654321");
		
		return users;
	}
	
}
