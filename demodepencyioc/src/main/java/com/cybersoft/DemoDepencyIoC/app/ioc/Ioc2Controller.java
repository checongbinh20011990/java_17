package com.cybersoft.DemoDepencyIoC.app.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ioc2Controller {
	ClassPathXmlApplicationContext context;
	
	public Ioc2Controller() {
		// TODO Auto-generated constructor stub
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public void getBean2() {
		Users users = (Users) context.getBean("users");
		System.out.println("User name 2 : " + users.getUserName());
	}
}
