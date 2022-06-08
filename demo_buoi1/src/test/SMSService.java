package test;

public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS message " + message);
		
	}

}
