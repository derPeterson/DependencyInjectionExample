package de.derpeterson.di.hard;

public class Test {
	public static void main(String[] args) {
		EmailService emailService = new EmailService();
		Application application = new Application(emailService);
		application.processMessage("Hello Body!", "c.doelb@gmx.de");
	}
}
