package com.cybersoft.DemoDepencyIoC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cybersoft.DemoDepencyIoC.app.AppController;
import com.cybersoft.DemoDepencyIoC.app.EmailMessage;
import com.cybersoft.DemoDepencyIoC.app.FacebookMessage;
import com.cybersoft.DemoDepencyIoC.app.MessageService;
import com.cybersoft.DemoDepencyIoC.app.ioc.Ioc2Controller;
import com.cybersoft.DemoDepencyIoC.app.ioc.IocController;

@SpringBootApplication
public class DemodepencyiocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodepencyiocApplication.class, args);
//		MessageService messageService = new FacebookMessage();
//		MessageService messageService2 = new FacebookMessage();
//		
//		AppController appController = new AppController(messageService);
//		appController.send();
		
//		IocController controller = new IocController();
//		controller.getBean();
//		
//		Ioc2Controller controller2 = new Ioc2Controller();
//		controller2.getBean2();
		
	}

}
