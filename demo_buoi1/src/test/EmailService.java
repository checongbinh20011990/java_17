package test;

public class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Send email : " + message);
		
	}
}
