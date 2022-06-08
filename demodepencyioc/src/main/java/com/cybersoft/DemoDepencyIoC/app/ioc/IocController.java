package com.cybersoft.DemoDepencyIoC.app.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocController {
	
	@Autowired
	Users users;
	
	public void getBean() {
		System.out.println("Username : " + users.getUserName());
	}
	
}
