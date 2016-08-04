package de.derpeterson.di.hard;

public class Application {
	
	EmailService emailService;
	
	public Application(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public void processMessage(String message, String receiver) {
		emailService.sendMessage(message, receiver);
	}
}
