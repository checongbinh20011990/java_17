package com.cybersoft.DemoDepencyIoC.app;

public class AppController {
	
	MessageService messageService;
	
	public AppController(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public void send() {
		messageService.sendMessage();
	}
	
}
