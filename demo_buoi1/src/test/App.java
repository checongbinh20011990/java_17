package test;

public class App {
	public static void main(String[] args) {
		MessageService messageService = new EmailService();
		UserController controller = new UserController(messageService);
		controller.send();
	}
}
