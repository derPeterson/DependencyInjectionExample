package de.derpeterson.di.soft;

public class DITest {
	public static void main(String[] args) {
		MessageServiceInjector messageServiceInjector = null;
		
		Consumer app = null;
		
		// Send EMail		
		messageServiceInjector = new EmailServiceInjector();
		app = messageServiceInjector.getConsumer();
		app.processMessage("Hello Body!", "c.doelb@gmx.de");
		
		// SEnd SMS		
		messageServiceInjector = new SMSServiceInjector();
		app = messageServiceInjector.getConsumer();
		app.processMessage("Hello Body!", "017034875868");
	}
}
