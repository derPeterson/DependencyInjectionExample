package de.derpeterson.di.soft;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("SMS sent to " + receiver + " with message=" + message);		
	}

}
