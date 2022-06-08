package test;

public class UserController {
	
	MessageService messageService;
	
	public UserController(MessageService messageSerivce) {
		// TODO Auto-generated constructor stub
		this.messageService = messageSerivce;
	}
	
	public void send() {
		messageService.sendMessage("Hello depency");
	}
}
